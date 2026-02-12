package com.example.a20passingdatabetweenactivities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textViewMessage = findViewById(R.id.textViewMessage);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        textViewMessage.setText("Hello, welcome " + name + "!");
    }
}