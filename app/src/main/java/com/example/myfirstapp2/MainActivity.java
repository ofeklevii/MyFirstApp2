package com.example.myfirstapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textview);
        tv1=findViewById(R.id.textview1);
        tv.setText("sec");
        tv1.setText("first");
        tv1.setTextColor(Color.CYAN);
        tv.setTextColor(Color.BLUE);
        tv.setTextSize(50);
        tv1.setTextSize(50);
    }
}