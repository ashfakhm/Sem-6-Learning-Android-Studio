package com.example.a2implementacalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextView;
    private String currentNumber = "";
    private String operator = "";
    private double result = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.resultTextView);

        View.OnClickListener listener = v -> {
            Button b = (Button) v;
            String buttonText = b.getText().toString();
            switch (buttonText) {
                case "C":
                    clear();
                    break;
                case "=":
                    calculate();
                    break;
                case ".":
                    appendDot();
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    setOperator(buttonText);
                    break;
                default:
                    appendNumber(buttonText);
                    break;
            }
        };

        findViewById(R.id.button_clear).setOnClickListener(listener);
        findViewById(R.id.button_divide).setOnClickListener(listener);
        findViewById(R.id.button_multiply).setOnClickListener(listener);
        findViewById(R.id.button_subtract).setOnClickListener(listener);
        findViewById(R.id.button_add).setOnClickListener(listener);
        findViewById(R.id.button_equals).setOnClickListener(listener);
        findViewById(R.id.button_dot).setOnClickListener(listener);

        findViewById(R.id.button_0).setOnClickListener(listener);
        findViewById(R.id.button_1).setOnClickListener(listener);
        findViewById(R.id.button_2).setOnClickListener(listener);
        findViewById(R.id.button_3).setOnClickListener(listener);
        findViewById(R.id.button_4).setOnClickListener(listener);
        findViewById(R.id.button_5).setOnClickListener(listener);
        findViewById(R.id.button_6).setOnClickListener(listener);
        findViewById(R.id.button_7).setOnClickListener(listener);
        findViewById(R.id.button_8).setOnClickListener(listener);
        findViewById(R.id.button_9).setOnClickListener(listener);
    }

    private void appendNumber(String number) {
        currentNumber += number;
        resultTextView.setText(currentNumber);
    }

    private void appendDot() {
        if (!currentNumber.contains(".")) {
            currentNumber += ".";
            resultTextView.setText(currentNumber);
        }
    }

    private void setOperator(String op) {
        if (!currentNumber.isEmpty()) {
            calculate();
        }
        operator = op;
        result = Double.parseDouble(currentNumber.isEmpty() ? "0" : currentNumber);
        currentNumber = "";
    }

    private void clear() {
        currentNumber = "";
        operator = "";
        result = 0.0;
        resultTextView.setText("0");
    }

    private void calculate() {
        if (operator.isEmpty() || currentNumber.isEmpty()) {
            return;
        }

        double newNumber = Double.parseDouble(currentNumber);
        switch (operator) {
            case "+":
                result += newNumber;
                break;
            case "-":
                result -= newNumber;
                break;
            case "*":
                result *= newNumber;
                break;
            case "/":
                if (newNumber != 0) {
                    result /= newNumber;
                } else {
                    resultTextView.setText("Error");
                    return;
                }
                break;
        }
        currentNumber = String.valueOf(result);
        resultTextView.setText(currentNumber);
        operator = "";
    }
}
