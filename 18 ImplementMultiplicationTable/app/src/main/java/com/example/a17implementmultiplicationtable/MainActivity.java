package com.example.a17implementmultiplicationtable;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText numberInput;
    private TextView tableOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput = findViewById(R.id.numberInput);
        Button generateButton = findViewById(R.id.generateButton);
        tableOutput = findViewById(R.id.tableOutput);

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateMultiplicationTable();
            }
        });
    }

    private void generateMultiplicationTable() {
        String input = numberInput.getText().toString().trim();
        if (input.isEmpty()) {
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            int number = Integer.parseInt(input);
            StringBuilder table = new StringBuilder();
            for (int i = 1; i <= 10; i++) {
                table.append(number).append(" x ").append(i).append(" = ").append(number * i).append("\n");
            }
            tableOutput.setText(table.toString());
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid number format", Toast.LENGTH_SHORT).show();
        }
    }
}
