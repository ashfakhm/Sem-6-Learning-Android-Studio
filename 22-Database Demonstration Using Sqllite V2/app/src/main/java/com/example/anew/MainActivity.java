package com.example.anew;

import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper myDb;
    EditText editTitle, editAuthor, editPublisher;
    Button btnSave, btnClear, btnDelete;
    ListView listView;
    BookCursorAdapter adapter;

    private final ExecutorService executorService = Executors.newSingleThreadExecutor();
    private final Handler handler = new Handler(Looper.getMainLooper());

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
        btnDelete = findViewById(R.id.button4);
        listView = findViewById(R.id.listView);

        adapter = new BookCursorAdapter(this, null);
        listView.setAdapter(adapter);

        refreshData();

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String title = editTitle.getText().toString();
                final String author = editAuthor.getText().toString();
                final String publisher = editPublisher.getText().toString();

                executorService.execute(new Runnable() {
                    @Override
                    public void run() {
                        boolean isInserted = myDb.insertData(title, author, publisher);
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                if (isInserted) {
                                    Toast.makeText(MainActivity.this, "Data Inserted", Toast.LENGTH_LONG).show();
                                    refreshData();
                                } else {
                                    Toast.makeText(MainActivity.this, "Data not Inserted", Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                    }
                });
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

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                executorService.execute(new Runnable() {
                    @Override
                    public void run() {
                        final Integer deletedRows = myDb.deleteAllData();
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                if (deletedRows > 0) {
                                    Toast.makeText(MainActivity.this, "Data Deleted", Toast.LENGTH_LONG).show();
                                    refreshData();
                                } else {
                                    Toast.makeText(MainActivity.this, "Data not Deleted", Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                    }
                });
            }
        });
    }

    private void refreshData() {
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                final Cursor newCursor = myDb.getAllData();
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        adapter.changeCursor(newCursor);
                    }
                });
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        executorService.shutdown();
        Cursor cursor = adapter.getCursor();
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }
}
