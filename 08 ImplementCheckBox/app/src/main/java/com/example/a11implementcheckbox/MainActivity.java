package com.example.a11implementcheckbox;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View v) {
        String msg = "Selected Qualification:";
        CheckBox c1 = findViewById(R.id.checkBox);
        CheckBox c2 = findViewById(R.id.checkBox2);
        CheckBox c3 = findViewById(R.id.checkBox3);
        CheckBox c4 = findViewById(R.id.checkBox4);

        if (c1.isChecked()) {
            msg += "\n10";
        }
        if (c2.isChecked()) {
            msg += "\n+2";
        }
        if (c3.isChecked()) {
            msg += "\nBsc";
        }
        if (c4.isChecked()) {
            msg += "\nMsc";
        }

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
