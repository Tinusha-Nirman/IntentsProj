package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private Button btn_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btn_ok = findViewById(R.id.button);
        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTost();
              //  sendData();
                openActivity2();

            }
        });
    }

    public void openActivity2(){
        EditText num1 = findViewById(R.id.editText1);
        EditText num2 = findViewById(R.id.editText2);

        String Number1 = num1.getText().toString();
        String Number2 = num2.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra("Number_1",Number1);
        intent.putExtra("Number_2",Number2);

        startActivity(intent);
    }

    public void showTost(){
        Toast toast = Toast.makeText(this,"Sending Message...", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0,0);
        toast.show();
    }
/*
    public void sendData(){

    }
*/

}
