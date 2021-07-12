package com.example.overloading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class TestProject extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Oveloading obj = new Oveloading();
        Log.e("",obj.getName());
        Log.e("",obj.getDescription());
    }
}