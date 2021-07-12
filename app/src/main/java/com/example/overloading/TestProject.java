package com.example.overloading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TestProject extends AppCompatActivity {
    private EditText rtResult;
    private Button btnPrint;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rtResult = findViewById(R.id.rtResult);
        btnPrint = findViewById(R.id.btnPrint);
        btnPrint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Oveloading obj = new Oveloading();
                rtResult.setText(obj.elevatorPitch());
                obj.elevatorPitch();
            }
        });
    }

}