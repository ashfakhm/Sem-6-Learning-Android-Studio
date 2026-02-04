package com.example.anew;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper myDb;
    EditText editTitle, editAuthor, editPublisher;
    Button btnSave, btnClear, btnList, btnDelete;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb = new DatabaseHelper(this);

        editTitle = findViewById(R.id.editTextText);
        editAuthor = findViewById(R.id.editTextText2);
        editPublisher = findViewById(R.id.editTextText3);
        btnSave = findViewById(R.id.button2);
        btnClear = findViewById(R.id.button3);
        btnList = findViewById(R.id.button);
        btnDelete = findViewById(R.id.button4);
        listView = findViewById(R.id.listView);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = myDb.insertData(editTitle.getText().toString(),
                        editAuthor.getText().toString(),
                        editPublisher.getText().toString());
                if (isInserted) {
                    Toast.makeText(MainActivity.this, "Data Inserted", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Data not Inserted", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTitle.setText("");
                editAuthor.setText("");
                editPublisher.setText("");
            }
        });

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDb.getAllData();
                if (res.getCount() == 0) {
                    Toast.makeText(MainActivity.this, "Nothing found", Toast.LENGTH_LONG).show();
                    return;
                }

                ArrayList<String> list = new ArrayList<>();
                while (res.moveToNext()) {
                    list.add("Title :" + res.getString(1) + "\n" +
                            "Author :" + res.getString(2) + "\n" +
                            "Publisher :" + res.getString(3));
                }

                ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this,
                        android.R.layout.simple_list_item_1, list);
                listView.setAdapter(adapter);
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer deletedRows = myDb.deleteAllData();
                if (deletedRows > 0) {
                    Toast.makeText(MainActivity.this, "Data Deleted", Toast.LENGTH_LONG).show();
                    listView.setAdapter(null);
                } else {
                    Toast.makeText(MainActivity.this, "Data not Deleted", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
