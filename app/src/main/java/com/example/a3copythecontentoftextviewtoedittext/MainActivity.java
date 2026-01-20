package com.example.a3copythecontentoftextviewtoedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void copy(View v)
    {
        EditText e1 = findViewById(R.id.editTextNumber);
        TextView tv = findViewById(R.id.textView);
        tv.setText(e1.getText());
    }
}
