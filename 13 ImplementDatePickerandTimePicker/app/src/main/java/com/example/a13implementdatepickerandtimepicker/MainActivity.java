package com.example.a13implementdatepickerandtimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements TimePicker.OnTimeChangedListener, DatePicker.OnDateChangedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimePicker tp = findViewById(R.id.tp);
        DatePicker dp = findViewById(R.id.dp);
        tp.setOnTimeChangedListener(this);
        Calendar calendar = Calendar.getInstance();
        dp.init(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), this);
    }

    @Override
    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        String dp = year + "/" +(monthOfYear+1)+"/"+dayOfMonth;
        Toast.makeText(this, dp, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
        String tp = hourOfDay+":"+minute;
        Toast.makeText(this, tp, Toast.LENGTH_SHORT).show();
    }
}