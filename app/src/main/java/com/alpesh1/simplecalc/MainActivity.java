package com.alpesh1.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView n1,n2,n3,n4,n5,n6,n7,n8,n9,n0,n00,input,plus,sub,mod,div,multi,point,equal,ac;

    int num1,num2,sign;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);
        n5 = findViewById(R.id.n5);
        n6 = findViewById(R.id.n6);
        n7 = findViewById(R.id.n7);
        n8 = findViewById(R.id.n8);
        n9 = findViewById(R.id.n9);
        n0 = findViewById(R.id.n0);
        n00 = findViewById(R.id.n00);
        plus = findViewById(R.id.plus);
        sub = findViewById(R.id.sub);
        mod = findViewById(R.id.mod);
        div = findViewById(R.id.div);
        multi = findViewById(R.id.multi);
        point = findViewById(R.id.point);
        equal = findViewById(R.id.equal);
        ac = findViewById(R.id.ac);

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                num1 = num2 = 0;
            }
        });

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = input.getText().toString();
                input.setText(num + "1");
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = input.getText().toString();
                input.setText(num + "2");
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = input.getText().toString();
                input.setText(num + "3");
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = input.getText().toString();
                input.setText(num + "4");
            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = input.getText().toString();
                input.setText(num + "5");
            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = input.getText().toString();
                input.setText(num + "6");
            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = input.getText().toString();
                input.setText(num + "7");
            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = input.getText().toString();
                input.setText(num + "8");
            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = input.getText().toString();
                input.setText(num + "9");
            }
        });
        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = input.getText().toString();
                input.setText(num + "0");
            }
        });
        n00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = input.getText().toString();
                input.setText(num + "00");
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = input.getText().toString();
                input.setText(num + ".");
            }

        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = input.getText().toString();
                num1 = Integer.parseInt(num);
                input.setText("");
                sign = 1;
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = input.getText().toString();
                num1 = Integer.parseInt(num);
                input.setText("");
                sign = 2;
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = input.getText().toString();
                num1 = Integer.parseInt(num);
                input.setText("");
                sign = 3;
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = input.getText().toString();
                num1 = Integer.parseInt(num);
                input.setText("");
                sign = 4;
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = input.getText().toString();
                num1 = Integer.parseInt(num);
                input.setText("");
                sign = 5;
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String num = input.getText().toString();
                num2 = Integer.parseInt(num);

                switch (sign) {
                    case 1:
                        input.setText(""+(num1+num2));
                        break;
                    case 2:
                        input.setText(""+(num1-num2));
                        break;
                    case 3:
                        input.setText(""+(num1*num2));
                        break;
                    case 4:
                        input.setText(""+(num1/num2));
                        break;
                    case 5:
                        input.setText(""+(num1/100));
                        break;
                }
            }
        });
    }
}