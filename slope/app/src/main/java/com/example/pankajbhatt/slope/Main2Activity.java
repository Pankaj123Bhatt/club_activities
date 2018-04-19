package com.example.pankajbhatt.slope;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void next(View v)
    {
        Intent i = new Intent(this, CalculatorActivity.class);
        startActivity(i);
    }
    public void next1(View v)
    {
        Intent i = new Intent(this, GalleryActivity.class);
        startActivity(i);
    }
    public void EXIT(View v)
    {
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}



