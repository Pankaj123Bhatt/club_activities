package com.example.pankajbhatt.slope;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        }
    public void back(View v){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }
    public void add(View v){
        EditText text1 = (EditText)findViewById(R.id.editText);
        String a=text1.getText().toString();
        EditText text2 = (EditText)findViewById(R.id.editText2);
        String b=text2.getText().toString();
        EditText text3 = (EditText)findViewById(R.id.editText3);

        Double aa=Double.parseDouble(a);
        Double bb=Double.parseDouble(b);
        Double ans=aa+bb;
        text3.setText(ans.toString());
    }
    public void subtract(View v){
        EditText text1 = (EditText)findViewById(R.id.editText);
        String a=text1.getText().toString();
        EditText text2 = (EditText)findViewById(R.id.editText2);
        String b=text2.getText().toString();
        EditText text3 = (EditText)findViewById(R.id.editText3);
        Double aa=Double.parseDouble(a);
        Double bb=Double.parseDouble(b);
        Double ans=aa-bb;
        text3.setText(ans.toString());
    }
    public void multiply(View v){
        EditText text1 = (EditText)findViewById(R.id.editText);
        String a=text1.getText().toString();
        EditText text2 = (EditText)findViewById(R.id.editText2);
        String b=text2.getText().toString();
        EditText text3 = (EditText)findViewById(R.id.editText3);
        Double aa=Double.parseDouble(a);
        Double bb=Double.parseDouble(b);
        Double ans=aa*bb;
        text3.setText(ans.toString());
    }
    public void divide(View v){
        EditText text1 = (EditText)findViewById(R.id.editText);
        String a=text1.getText().toString();
        EditText text2 = (EditText)findViewById(R.id.editText2);
        String b=text2.getText().toString();
        EditText text3 = (EditText)findViewById(R.id.editText3);
        Double aa=Double.parseDouble(a);
        Double bb=Double.parseDouble(b);
        Double ans=aa/bb;
        text3.setText(ans.toString());
    }
}
