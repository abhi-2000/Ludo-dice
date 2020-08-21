package com.example.ludo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

import static java.lang.Math.random;

public class MainActivity extends AppCompatActivity {
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onclick(View view) {
        textview=findViewById(R.id.textView);
        Random rn = new Random();
        int answer = rn.nextInt(6)+1;

        textview.setText(String.format("%d",answer));


    }
}