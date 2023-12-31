package com.example.myfirstapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
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
        tv1=findViewById(R.id.textview2);
        tv.setText("1");
        tv1.setText("2");
        tv1.setTextColor(Color.MAGENTA);
        tv.setTextColor(Color.GRAY);
        tv.setTextSize(40);
        tv1.setTextSize(40);
    }

    public void go(View view) {
        tv.setText("1");
        tv1.setText("2");
    }

    public void go1(View view) {
        tv.setText("2");
        tv1.setText("1");
    }

    public void go2(View view) {
        tv.setTextColor(Color.MAGENTA);
        tv1.setTextColor(Color.GRAY);
    }

    public void go3(View view) {
        tv1.setTextColor(Color.RED);
        tv.setTextColor(Color.YELLOW);
    }
}