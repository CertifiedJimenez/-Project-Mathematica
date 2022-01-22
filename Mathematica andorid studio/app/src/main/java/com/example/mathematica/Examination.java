package com.example.mathematica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.logging.Level;

public class Examination extends AppCompatActivity {

    // Debug Lines
    // Log.i("debug", "MessageBox");
    // Toast.makeText(this, "ThIs Is A DeBuG.", Toast.LENGTH_SHORT).show();

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonCorrection;


    TextView User_Response;


    TextView Question_Terminal;

    public Integer Answer_Value;



    String User_Answer;

    int First_Number;

    int Second_Number;

    int Level = 1;

    String Equatiom;

    int Score;

    int Question_Total;

    int Answerd_Questions;


    public int Generate_Question(int a) {

        if (a == 1) {
            Random RandomInt = new Random();

            int Maximum = 20;
            int Minimum = 5;

            Answer_Value = -1;
            Log.i("debug", String.valueOf(Answer_Value));
            while (Answer_Value < 0) {


                int First_Generation = RandomInt.nextInt(Maximum - Minimum);
                int Second_Generation = RandomInt.nextInt(Maximum - Minimum);

                First_Number = First_Generation;
                Second_Number = Second_Generation;


                int Equation_Generation = RandomInt.nextInt(2 - 0);
                int Eqauation_Type = Equation_Generation;


                if (Eqauation_Type == 1) {

                    Equatiom = "+";
                    Answer_Value = First_Number + Second_Number;

                }
                if (Eqauation_Type == 2) {

                    Equatiom = "-";
                    Answer_Value = First_Number - Second_Number;

                }


            }

        }

        if (a == 2) {
            Random RandomInt = new Random();

            int Maximum = 40;
            int Minimum = 5;

            Answer_Value = -1;
            Log.i("debug", String.valueOf(Answer_Value));
            while (Answer_Value < 0) {


                int First_Generation = RandomInt.nextInt(Maximum - Minimum);
                int Second_Generation = RandomInt.nextInt(Maximum - Minimum);

                First_Number = First_Generation;
                Second_Number = Second_Generation;


                int Equation_Generation = RandomInt.nextInt(4 - 0);
                int Eqauation_Type = Equation_Generation;


                if (Eqauation_Type == 1) {

                    Equatiom = "+";
                    Answer_Value = First_Number - Second_Number;

                }
                if (Eqauation_Type == 2) {

                    Equatiom = "-";
                    Answer_Value = First_Number - Second_Number;

                }
                if (Eqauation_Type == 3) {

                    Equatiom = "x";
                    Answer_Value = First_Number * Second_Number;

                }
                if (Eqauation_Type == 4) {

                    Equatiom = "/";
                    Answer_Value = First_Number / Second_Number;

                }

            }

        }

                if (a == 3) {
                    Random RandomInt = new Random();

                    int Maximum = 100;
                    int Minimum = 20;

                    Answer_Value = -1;
                    Log.i("debug", String.valueOf(Answer_Value));
                    while (Answer_Value < 0) {


                        int First_Generation = RandomInt.nextInt(Maximum - Minimum);
                        int Second_Generation = RandomInt.nextInt(Maximum - Minimum);

                        First_Number = First_Generation;
                        Second_Number = Second_Generation;


                        int Equation_Generation = RandomInt.nextInt(4 - 0);
                        int Eqauation_Type = Equation_Generation;


                        if (Eqauation_Type == 1) {

                            Equatiom = "+";
                            Answer_Value = First_Number - Second_Number;

                        }
                        if (Eqauation_Type == 2) {

                            Equatiom = "-";
                            Answer_Value = First_Number - Second_Number;

                        }
                        if (Eqauation_Type == 3) {

                            Equatiom = "x";
                            Answer_Value = First_Number * Second_Number;

                        }
                        if (Eqauation_Type == 4) {

                            Equatiom = "/";
                            Answer_Value = First_Number / Second_Number;

                        }


                    }

                }





        return 0;
    }




    public String Question_Display(int a, int b, String c) {

        String Question_First_Number = String.valueOf(a);
        String Question_Second_Number = String.valueOf(b);
        String Equation = c;

        String Question = "What is " + Question_First_Number + " " + Equation + " " + Question_Second_Number + "?";

        return Question;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_examination);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonCorrection = (Button) findViewById(R.id.buttonCorrection);
        User_Response = (TextView) findViewById(R.id.User_Response);
        Question_Terminal = (TextView) findViewById(R.id.Question_Terminal);


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User_Response.setText(User_Response.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User_Response.setText(User_Response.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User_Response.setText(User_Response.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User_Response.setText(User_Response.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User_Response.setText(User_Response.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User_Response.setText(User_Response.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User_Response.setText(User_Response.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User_Response.setText(User_Response.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User_Response.setText(User_Response.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User_Response.setText(User_Response.getText() + "9");
            }
        });

        buttonCorrection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User_Response.setText("");
            }
        });


        Level = 1;
        Generate_Question(Level);
        Answerd_Questions = 0;
        Question_Terminal.setText(Question_Display(First_Number, Second_Number, Equatiom));




    }


    public void Check_Resposne(View v) {




        TextView txtanswer = findViewById(R.id.User_Response);
        String theAnswer = txtanswer.getText().toString();
        int theAnsInt = Integer.parseInt(theAnswer);

        // Toast.makeText(this, String.valueOf(Answer_Value), Toast.LENGTH_SHORT).show();

        if (theAnsInt == Answer_Value) {

            Score = Score + 1;

            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
        }

        if (Answerd_Questions < 30) {

            Answerd_Questions = Answerd_Questions + 1;
            Generate_Question(Level);
            Question_Terminal.setText(Question_Display(First_Number, Second_Number, Equatiom));

           if (Answerd_Questions == 11) {
                Level = 2;
            }

            if (Answerd_Questions == 21) {
                Level = 3;
            }
            }



        }

    }












