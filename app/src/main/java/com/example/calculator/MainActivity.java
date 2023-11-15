package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // this method ADDS the values
    public void Add(View v){
        // declare the three text fields: value 1, value 2, and answer
        EditText et1 = (EditText)findViewById(R.id.editTextNumber);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText)findViewById(R.id.editTextNumber3);

        // number values
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1+n2;

        et3.setText(result);
    }
    // end of ADD method

    // this method Subtracts the values
    public void Sub(View v){
        // declare the three text fields: value 1, value 2, and answer
        EditText et1 = (EditText)findViewById(R.id.editTextNumber);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText)findViewById(R.id.editTextNumber3);

        // number values
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1-n2;

        et3.setText(result);
    }
    // end of Sub method

    // this method ADDS the values
    public void Multiply(View v){
        // declare the three text fields: value 1, value 2, and answer
        EditText et1 = (EditText)findViewById(R.id.editTextNumber);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText)findViewById(R.id.editTextNumber3);

        // number values
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1*n2;

        et3.setText(result);
    }
    // end of Multiply method

    // this method Divides the values
    public void Div(View v){
        // declare the three text fields: value 1, value 2, and answer
        EditText et1 = (EditText)findViewById(R.id.editTextNumber);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText)findViewById(R.id.editTextNumber3);

        // number values
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1/n2;

        et3.setText(result);
    }
    // end of Div method
}