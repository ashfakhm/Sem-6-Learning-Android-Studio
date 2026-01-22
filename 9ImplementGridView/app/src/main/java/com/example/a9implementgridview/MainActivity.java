package com.example.a9implementgridview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gv = findViewById(R.id.gv);
        String[] a = {"Samsung", "Oppo", "Vivo", "Oneplus", "Iphone", "Nothing"};
        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, a);
        gv.setAdapter(ad);
        gv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String s = parent.getItemAtPosition(position).toString();
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
