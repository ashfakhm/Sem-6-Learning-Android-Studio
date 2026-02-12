package com.example.a12implementradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rg = findViewById(R.id.radiogroup);
        if (rg != null) {
            rg.setOnCheckedChangeListener(this);
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        String message = "";
        if (checkedId == R.id.radio_male) {
            message = "You selected Male";
        } else if (checkedId == R.id.radio_female) {
            message = "You selected Female";
        } else if (checkedId == R.id.radio_other) {
            message = "You prefer not to say";
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
