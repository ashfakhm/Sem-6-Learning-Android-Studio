package com.example.a14implementalert;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View v)
    {
        AlertDialog.Builder b = new AlertDialog.Builder(this);
        b.setTitle("Alert");
        b.setMessage("Do you want to exit?");
        b.setPositiveButton("Yes", new DialogInterface.OnClickListener()
        {
            public void onClick(DialogInterface dialog, int which)
            {
                finish();
            }
        });
        b.setNegativeButton("No",null);
        AlertDialog ad = b.create();
        ad.show();
    }
}
