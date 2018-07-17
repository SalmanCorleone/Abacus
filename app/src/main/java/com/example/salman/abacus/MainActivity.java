package com.example.salman.abacus;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, add, sub, mult, div, eql, btnPoint;
    Button clr, back, min;
    String str1, str2, str3, currentOp, pastOp;
    float num1, num2, result;
    TextView txt1, txt2, txt3, signBox;
    int step;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setNumberListerners();
        setOperatorListeners();

    }

    /*Event Listener for Operator Buttons*/
    private void setOperatorListeners() {
        /*************
         * Basic Idea:
         * ***********
         * The whole process works with 3 steps.
         *
         * First Step:
         * Input for the first number.
         * Any of the four operator buttons (add, sub, mult or div)
         * will save the number, check it's validity,
         * save the operator pressed as active operator and
         * take the process to the the second step.
         *
         * Second Step:
         * Input for the second number.
         * The epl operator (=) will save the second number,
         * check it's validity and proceed to step three.
         * In the meantime, if any other operator is pressed,
         * it will only changed the current active operator,
         * not the number or current step.
         *
         * Third Step:
         * It will calculate the result using 2 numbers given
         * and active operator and display the result.
         * Now, if any number is pressed,
         * it will go back  to step 1.
         * If another operator is pressed, it be considered active operator,
         * the answer will be saved as first input number
         * and it will proceed to step 2.
         *
         * Inputs like empty string, multiple points,
         * several signs are also handled with if-else.
         *
         * *************/


        add.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if (step == 3) {
                    num1 = result;
                    result = 0;
                    num2 = 0;
                    str2 = "";
                    txt1.setText(String.valueOf(num1));
                    txt2.setText("");
                    txt3.setText("");

                } else if (step == 1) {

                    if (str1 != "") {
                        try {
                            num1 = Float.parseFloat(str1);

                        } catch (NumberFormatException nfe) {
                            Toast.makeText(getApplicationContext(), "Syntax Error",
                                    Toast.LENGTH_SHORT).show();
                        }

//                        txt1.setText(String.valueOf(num1));
                    }

                }
                step = 2;
                currentOp = "add";
                signBox.setText("+");
                add.setBackground(getDrawable(R.drawable.selected));
                sub.setBackground(getDrawable(R.drawable.numbtn));
                mult.setBackground(getDrawable(R.drawable.numbtn));
                div.setBackground(getDrawable(R.drawable.numbtn));



            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if (step == 3) {
                    num1 = result;
                    result = 0;
                    num2 = 0;
                    str2 = "";
                    txt1.setText(String.valueOf(num1));
                    txt2.setText("");
                    txt3.setText("");

                } else if (step == 1) {
                    if (str1 != "") {
                        try {
                            num1 = Float.parseFloat(str1);

                        } catch (NumberFormatException nfe) {
                            Toast.makeText(getApplicationContext(), "Syntax Error",
                                    Toast.LENGTH_SHORT).show();
                        }
//                        txt1.setText(String.valueOf(num1));
                    }

                }
                step = 2;
                currentOp = "sub";
                signBox.setText("-");

                add.setBackground(getDrawable(R.drawable.numbtn));
                sub.setBackground(getDrawable(R.drawable.selected));
                mult.setBackground(getDrawable(R.drawable.numbtn));
                div.setBackground(getDrawable(R.drawable.numbtn));



            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if (step == 3) {
                    num1 = result;
                    result = 0;
                    num2 = 0;
                    str2 = "";
                    txt1.setText(String.valueOf(num1));
                    txt2.setText("");
                    txt3.setText("");


                } else if (step == 1) {
                    if (str1 != "") {
                        try {
                            num1 = Float.parseFloat(str1);

                        } catch (NumberFormatException nfe) {
                            Toast.makeText(getApplicationContext(), "Syntax Error",
                                    Toast.LENGTH_SHORT).show();
                        }
//                        txt1.setText(String.valueOf(num1));
                    }

                }
                step = 2;
                currentOp = "mult";
                signBox.setText("*");


                add.setBackground(getDrawable(R.drawable.numbtn));
                sub.setBackground(getDrawable(R.drawable.numbtn));
                mult.setBackground(getDrawable(R.drawable.selected));
                div.setBackground(getDrawable(R.drawable.numbtn));


            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if (step == 3) {
                    num1 = result;
                    result = 0;
                    num2 = 0;
                    str2 = "";
                    txt1.setText(String.valueOf(num1));
                    txt2.setText("");
                    txt3.setText("");

                } else if (step == 1) {

                    if (str1 != "") {

                        try {
                            num1 = Float.parseFloat(str1);

                        } catch (NumberFormatException nfe) {
                            Toast.makeText(getApplicationContext(), "Syntax Error",
                                    Toast.LENGTH_SHORT).show();
                        }
//                        txt1.setText(String.valueOf(num1));
                    }

                }
                step = 2;
                currentOp = "div";
                signBox.setText("/");


                add.setBackground(getDrawable(R.drawable.numbtn));
                sub.setBackground(getDrawable(R.drawable.numbtn));
                mult.setBackground(getDrawable(R.drawable.numbtn));
                div.setBackground(getDrawable(R.drawable.selected));


            }
        });

        eql.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if(step==3)
                {
                    num1 = result;
                    txt1.setText(String.valueOf(num1));
                    currentOp = pastOp;

                }
                step = 3;
                if (str2 != "") {
                    try {
                        num2 = Float.parseFloat(str2);

                    } catch (NumberFormatException nfe) {
                        Toast.makeText(getApplicationContext(), "Syntax Error on Second Number",
                                Toast.LENGTH_SHORT).show();
                    }
                }
//                txt2.setText(String.valueOf(num2));


                switch (currentOp) {
                    case "add":
                        result = num1 + num2;
                        txt3.setText(String.valueOf(result));
                        break;
                    case "sub":
                        result = num1 - num2;
                        txt3.setText(String.valueOf(result));
                        break;
                    case "mult":
                        result = num1 * num2;
                        txt3.setText(String.valueOf(result));
                        break;
                    case "div":
                        result = num1 / num2;
                        txt3.setText(String.valueOf(result));
                        break;

                    case "":
                        if (str1 != "") {
                            try {
                                num1 = Float.parseFloat(str1);

                            } catch (NumberFormatException nfe) {
                                Toast.makeText(getApplicationContext(), "Syntax Error",
                                        Toast.LENGTH_SHORT).show();
                            }
                        }
                        result = num1;
                        txt2.setText("0");
                        txt3.setText(String.valueOf(num1));
                        break;
                    default:
                        break;
                }

                pastOp = currentOp;
                currentOp = "";



                add.setBackground(getDrawable(R.drawable.numbtn));
                sub.setBackground(getDrawable(R.drawable.numbtn));
                mult.setBackground(getDrawable(R.drawable.numbtn));
                div.setBackground(getDrawable(R.drawable.numbtn));




            }
        });


        clr.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                str1 = str2 = str3 = currentOp = "";
                num1 = num2 = result = 0;

                txt1.setText(str1);
                txt2.setText(str2);
                txt3.setText(str3);

                step = 1;
                currentOp = "";
                signBox.setText("");


                add.setBackground(getDrawable(R.drawable.numbtn));
                sub.setBackground(getDrawable(R.drawable.numbtn));
                mult.setBackground(getDrawable(R.drawable.numbtn));
                div.setBackground(getDrawable(R.drawable.numbtn));

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (step == 1 && str1 != "" && str1.length() > 0) {
                    str1 = str1.substring(0, str1.length() - 1);
                    txt1.setText(str1);
                } else if (step == 2 && str2 != "" && str2.length() > 0) {
                    str2 = str2.substring(0, str2.length() - 1);
                    txt2.setText(str2);
                }
            }
        });

        /*root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (step == 3) {
                    result = (float) Math.sqrt(result);
                    txt3.setText(String.valueOf(result));
                    num1 = num2 = 0;
                    txt1.setText("0.0");
                    txt2.setText("");
                }
            }
        });*/

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (step == 1) {
                    str1 += "-";
                    txt1.setText(str1);
                }
                if (step == 2) {
                    str2 += "-";
                    txt2.setText(str2);
                }

                if (step == 3) {
                    str1 = "-";
                    str2 = "";
                    str3 = "";
                    num1 = num2 = result = 0;
                    txt1.setText(str1);
                    txt2.setText(str2);
                    txt3.setText(str3);
                    step = 1;
                }

            }
        });
    }

    /*Event Listener for Numbers and Point Buttons*/
    private void setNumberListerners() {
        btn0.setOnClickListener(numclicks);
        btn1.setOnClickListener(numclicks);
        btn2.setOnClickListener(numclicks);
        btn3.setOnClickListener(numclicks);
        btn4.setOnClickListener(numclicks);
        btn5.setOnClickListener(numclicks);
        btn6.setOnClickListener(numclicks);
        btn7.setOnClickListener(numclicks);
        btn8.setOnClickListener(numclicks);
        btn9.setOnClickListener(numclicks);
        btnPoint.setOnClickListener(numclicks);
    }

    /*Mapping all Buttons and Text-fields with XML*/
    private void init() {
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        btnPoint = (Button) findViewById(R.id.btnPoint);
        add = (Button) findViewById(R.id.btnPlus);
        sub = (Button) findViewById(R.id.btnMinus);
        mult = (Button) findViewById(R.id.btnMult);
        div = (Button) findViewById(R.id.btnDivide);

        eql = (Button) findViewById(R.id.btnEql);
        clr = (Button) findViewById(R.id.btnClr);
        back = (Button) findViewById(R.id.btnBack);
//        root = (Button) findViewById(R.id.btnSqrt);
        min = (Button) findViewById(R.id.btnMin);

        txt1 = (TextView) findViewById(R.id.textView2);
        txt2 = (TextView) findViewById(R.id.textView3);
        txt3 = (TextView) findViewById(R.id.textView4);
        signBox = (TextView) findViewById(R.id.signbox);

        str1 = str2 = str3 = currentOp = "";
        num1 = num2 = result = 0;

        txt1.setText(str1);
        txt2.setText(str2);
        txt3.setText(str3);

        step = 1;


    }

    /*One Common Listener for all the Number Buttons*/
    private View.OnClickListener numclicks = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Button btnTmp = (Button) v;
            if (step == 1) {
                str1 += btnTmp.getText().toString();
                txt1.setText(str1);
            }
            if (step == 2) {
                str2 += btnTmp.getText().toString();
                txt2.setText(str2);
            }

            if (step == 3) {
                str1 = btnTmp.getText().toString();
                str2 = "";
                str3 = "";
                num1 = num2 = result = 0;
                txt1.setText(str1);
                txt2.setText(str2);
                txt3.setText(str3);
                step = 1;
                signBox.setText("");
            }


        }
    };


}
