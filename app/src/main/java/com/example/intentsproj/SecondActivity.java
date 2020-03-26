package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button btnPlus, btnMinus, btnMultiply, btnDevide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String Number1 = intent.getStringExtra("Number_1");
        String Number2 = intent.getStringExtra("Number_2");

        EditText num1 = findViewById(R.id.editText3);
        EditText num2 = findViewById(R.id.editText4);

        num1.setText(Number1);
        num2.setText(Number2);

        btnDevide = findViewById(R.id.buttonDevide);
        btnMultiply = findViewById(R.id.buttonMultiply);
        btnPlus = findViewById(R.id.buttonPlus);
        btnMinus = findViewById(R.id.buttonMunus);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Equation();
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Substractin();
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Multiply();
            }
        });

        btnDevide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Divitin();
            }
        });

    }

    public int getFnum(){
        EditText txt1 = findViewById(R.id.editText3);
        String stingNum1 = txt1.getText().toString();

        //Convert string to int
        int intNum1 = Integer.parseInt(stingNum1);

        return intNum1;
    }

    public int getSnum(){
        EditText txt2 = findViewById(R.id.editText4);
        String stringNum2 = txt2.getText().toString();

        //Convert string to int
        int intNum2 = Integer.parseInt(stringNum2);
        return intNum2;
    }

    public void Equation(){
        TextView answerText = findViewById(R.id.textView5);

        int answer = getFnum() + getSnum();
        answerText.setText(""+answer);
    }

    public void Substractin(){
        TextView answerText = findViewById(R.id.textView5);

        int answer = getFnum() - getSnum();
        answerText.setText(""+answer);
    }

    public void Multiply(){
        TextView answerText = findViewById(R.id.textView5);

        int answer = getFnum() * getSnum();
        answerText.setText(""+answer);
    }

    public void Divitin(){
        TextView answerText = findViewById(R.id.textView5);

        int answer = getFnum() / getSnum();
        answerText.setText(""+answer);
    }
}
