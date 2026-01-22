package com.example.a20implementlogin;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText usernameEditText, passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameEditText = findViewById(R.id.editText);
        passwordEditText = findViewById(R.id.editText2);
    }

    public void register(View v) {
        SharedPreferences sharedPreferences = getSharedPreferences("user_credentials", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("username", usernameEditText.getText().toString());
        editor.putString("password", passwordEditText.getText().toString());
        editor.apply();
        Toast.makeText(this, "Registration Successful!", Toast.LENGTH_SHORT).show();
    }

    public void login(View v) {
        SharedPreferences sharedPreferences = getSharedPreferences("user_credentials", MODE_PRIVATE);
        String enteredUsername = usernameEditText.getText().toString();
        String enteredPassword = passwordEditText.getText().toString();
        String savedUsername = sharedPreferences.getString("username", "");
        String savedPassword = sharedPreferences.getString("password", "");

        if (savedUsername.equals(enteredUsername) && savedPassword.equals(enteredPassword)) {
            Toast.makeText(this, "Welcome back!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Invalid username or password.", Toast.LENGTH_SHORT).show();
        }
    }

    public void reset(View v) {
        usernameEditText.setText("");
        passwordEditText.setText("");
    }
}
