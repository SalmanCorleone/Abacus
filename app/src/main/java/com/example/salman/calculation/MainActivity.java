package com.example.salman.calculation;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.media.Image;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, add, sub, mult, div, eql, btnPoint;
    ImageButton clr, back, root,min;
    String str1, str2, str3, currentOp;
    float num1, num2, result;
    TextView txt1, txt2, txt3;
    int step;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.titile);

        init();

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





        add.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if(step==3)
                {
                    num1=result;
                    result=0;
                    num2=0;
                    str2="";
                    txt1.setText(String.valueOf(num1));
                    txt2.setText("");
                    txt3.setText("");

                }
                else if(step==1){

                    if(str1!="") {
                        try {
                            num1 = Float.parseFloat(str1);

                        }catch (NumberFormatException nfe)
                        {
                            Toast.makeText(getApplicationContext(), "Syntax Error",
                                    Toast.LENGTH_SHORT).show();
                        }

                        txt1.setText(String.valueOf(num1));
                    }

                }
                step=2;
                currentOp="add";
                add.setBackgroundTintList(ColorStateList.valueOf(0xFF3f7c71));

                sub.setBackgroundTintList(ColorStateList.valueOf(0xFF00ba96));
                mult.setBackgroundTintList(ColorStateList.valueOf(0xFF00ba96));
                div.setBackgroundTintList(ColorStateList.valueOf(0xFF00ba96));



            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if(step==3)
                {
                    num1=result;
                    result=0;
                    num2=0;
                    str2="";
                    txt1.setText(String.valueOf(num1));
                    txt2.setText("");
                    txt3.setText("");

                }
                else if(step==1){
                    if(str1!="") {
                        try {
                            num1 = Float.parseFloat(str1);

                        }catch (NumberFormatException nfe)
                        {
                            Toast.makeText(getApplicationContext(), "Syntax Error",
                                    Toast.LENGTH_SHORT).show();
                        }
                        txt1.setText(String.valueOf(num1));
                    }

                }
                step=2;
                currentOp="sub";
                sub.setBackgroundTintList(ColorStateList.valueOf(0xFF3f7c71));

                add.setBackgroundTintList(ColorStateList.valueOf(0xFF00ba96));
                mult.setBackgroundTintList(ColorStateList.valueOf(0xFF00ba96));
                div.setBackgroundTintList(ColorStateList.valueOf(0xFF00ba96));




            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if(step==3)
                {
                    num1=result;
                    result=0;
                    num2=0;
                    str2="";
                    txt1.setText(String.valueOf(num1));
                    txt2.setText("");
                    txt3.setText("");


                }
                else if(step==1){
                    if(str1!="") {
                        try {
                            num1 = Float.parseFloat(str1);

                        }catch (NumberFormatException nfe)
                        {
                            Toast.makeText(getApplicationContext(), "Syntax Error",
                                    Toast.LENGTH_SHORT).show();
                        }
                        txt1.setText(String.valueOf(num1));
                    }

                }
                step=2;
                currentOp="mult";

                mult.setBackgroundTintList(ColorStateList.valueOf(0xFF3f7c71));

                sub.setBackgroundTintList(ColorStateList.valueOf(0xFF00ba96));
                add.setBackgroundTintList(ColorStateList.valueOf(0xFF00ba96));
                div.setBackgroundTintList(ColorStateList.valueOf(0xFF00ba96));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if(step==3)
                {
                    num1=result;
                    result=0;
                    num2=0;
                    str2="";
                    txt1.setText(String.valueOf(num1));
                    txt2.setText("");
                    txt3.setText("");

                }
                else if(step==1){

                    if(str1!="") {

                        try {
                            num1 = Float.parseFloat(str1);

                        }catch (NumberFormatException nfe)
                        {
                            Toast.makeText(getApplicationContext(), "Syntax Error",
                                    Toast.LENGTH_SHORT).show();
                        }
                        txt1.setText(String.valueOf(num1));
                    }

                }
                step=2;
                currentOp="div";
                div.setBackgroundTintList(ColorStateList.valueOf(0xFF3f7c71));

                sub.setBackgroundTintList(ColorStateList.valueOf(0xFF00ba96));
                mult.setBackgroundTintList(ColorStateList.valueOf(0xFF00ba96));
                add.setBackgroundTintList(ColorStateList.valueOf(0xFF00ba96));

            }
        });

        eql.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                step=3;
                if(str2!=""){
                    try {
                        num2 = Float.parseFloat(str2);

                    }catch (NumberFormatException nfe)
                    {
                        Toast.makeText(getApplicationContext(), "Syntax Error on Second Number",
                                Toast.LENGTH_SHORT).show();
                    }
                }
                txt2.setText(String.valueOf(num2));


                switch (currentOp){
                    case "add":
                        result= num1+num2;
                        txt3.setText(String.valueOf(result));
                        break;
                    case "sub":
                        result= num1-num2;
                        txt3.setText(String.valueOf(result));
                        break;
                    case "mult":
                        result= num1*num2;
                        txt3.setText(String.valueOf(result));
                        break;
                    case "div":
                        result= num1/num2;
                        txt3.setText(String.valueOf(result));
                        break;

                    case "":
                        if(str1!="") {
                            try {
                                num1 = Float.parseFloat(str1);

                            }catch (NumberFormatException nfe)
                            {
                                Toast.makeText(getApplicationContext(), "Syntax Error",
                                        Toast.LENGTH_SHORT).show();
                            }
                        }
                        result=num1;
                        txt2.setText("0");
                        txt3.setText(String.valueOf(num1));
                        break;
                    default:
                        break;
                }

                currentOp="";
                add.setBackgroundTintList(ColorStateList.valueOf(0xFF00ba96));
                sub.setBackgroundTintList(ColorStateList.valueOf(0xFF00ba96));
                mult.setBackgroundTintList(ColorStateList.valueOf(0xFF00ba96));
                div.setBackgroundTintList(ColorStateList.valueOf(0xFF00ba96));

            }
        });


        clr.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                str1=str2=str3=currentOp="";
                num1=num2=result=0;

                txt1.setText("0.0");
                txt2.setText(str2);
                txt3.setText(str3);

                step=1;
                currentOp="";
                add.setBackgroundTintList(ColorStateList.valueOf(0xFF00ba96));
                sub.setBackgroundTintList(ColorStateList.valueOf(0xFF00ba96));
                mult.setBackgroundTintList(ColorStateList.valueOf(0xFF00ba96));
                div.setBackgroundTintList(ColorStateList.valueOf(0xFF00ba96));

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (step==1 && str1 != "" && str1.length() > 0) {
                    str1 = str1.substring(0, str1.length() - 1);
                    txt1.setText(str1);
                }
                else if (step==2 && str2 != "" && str2.length() > 0) {
                    str2 = str2.substring(0, str2.length() - 1);
                    txt2.setText(str2);
                }
            }
        });

        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(step==3)
                {
                    result=(float)Math.sqrt(result);
                    txt3.setText(String.valueOf(result));
                    num1=num2=0;
                    txt1.setText("0.0");
                    txt2.setText("");
                }
            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(step==1)
                {
                    str1+="-";
                    txt1.setText(str1);
                }
                if(step==2)
                {
                    str2+="-";
                    txt2.setText(str2);
                }

                if(step==3)
                {
                    str1="-";
                    str2="";
                    str3="";
                    num1=num2=result=0;
                    txt1.setText(str1);
                    txt2.setText(str2);
                    txt3.setText(str3);
                    step=1;
                }

            }
        });

    }

    private View.OnClickListener numclicks =new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Button btnTmp= (Button) v;
            if(step==1)
            {
                str1+=btnTmp.getText().toString();
                txt1.setText(str1);
            }
            if(step==2)
            {
                str2+=btnTmp.getText().toString();
                txt2.setText(str2);
            }

            if(step==3)
            {
                str1=btnTmp.getText().toString();
                str2="";
                str3="";
                num1=num2=result=0;
                txt1.setText(str1);
                txt2.setText(str2);
                txt3.setText(str3);
                step=1;
            }


        }
    };





    public void init()
    {
        btn0= (Button)findViewById(R.id.btn0);
        btn1= (Button)findViewById(R.id.btn1);
        btn2= (Button)findViewById(R.id.btn2);
        btn3= (Button)findViewById(R.id.btn3);
        btn4= (Button)findViewById(R.id.btn4);
        btn5= (Button)findViewById(R.id.btn5);
        btn6= (Button)findViewById(R.id.btn6);
        btn7= (Button)findViewById(R.id.btn7);
        btn8= (Button)findViewById(R.id.btn8);
        btn9= (Button)findViewById(R.id.btn9);

        btnPoint = (Button) findViewById(R.id.btnPoint);
        add = (Button) findViewById(R.id.btnPlus);
        sub = (Button) findViewById(R.id.btnMinus);
        mult = (Button) findViewById(R.id.btnMult);
        div = (Button) findViewById(R.id.btnDivide);

        eql=(Button)findViewById(R.id.btnEql);
        clr=(ImageButton) findViewById(R.id.btnClr);
        back=(ImageButton) findViewById(R.id.btnBack);
        root=(ImageButton)findViewById(R.id.btnSqrt);
        min=(ImageButton)findViewById(R.id.btnMin);

        txt1= (TextView)findViewById(R.id.textView2);
        txt2= (TextView)findViewById(R.id.textView3);
        txt3= (TextView)findViewById(R.id.textView4);

        str1=str2=str3=currentOp="";
        num1=num2=result=0;

        txt1.setText("0.0");
        txt2.setText(str2);
        txt3.setText(str3);

        step=1;







    }




}
