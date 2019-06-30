package com.muhametshehu.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText)findViewById(R.id.editText);
        editText2 = (EditText)findViewById(R.id.editText2);
        result = (TextView) findViewById(R.id.resultText);

    }

    public void sum(View view){

        float a = Float.parseFloat(editText1.getText().toString());
        float b = Float.parseFloat(editText2.getText().toString());

        float resultInt = a + b;

        result.setText("Result:" + resultInt);

    }

    public void subtract(View view){

        float a = Float.parseFloat(editText1.getText().toString());
        float b = Float.parseFloat(editText2.getText().toString());

        float resultInt = a - b;

        result.setText("Result:" + resultInt);

    }

    public void multiply(View view){

        float a = Float.parseFloat(editText1.getText().toString());
        float b = Float.parseFloat(editText2.getText().toString());

        float resultInt = a * b;

        result.setText("Result:" + resultInt);

    }

    public void divide(View view){

        float a = Float.parseFloat(editText1.getText().toString());
        float b = Float.parseFloat(editText2.getText().toString());

        float resultInt = a / b;

        result.setText("Result:" + resultInt);

    }

}


