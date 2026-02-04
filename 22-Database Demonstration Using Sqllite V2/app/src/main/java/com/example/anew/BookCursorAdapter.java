package com.example.anew;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

public class BookCursorAdapter extends CursorAdapter {

    public BookCursorAdapter(Context context, Cursor c) {
        super(context, c, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView titleTextView = view.findViewById(R.id.title_text);
        TextView authorTextView = view.findViewById(R.id.author_text);
        TextView publisherTextView = view.findViewById(R.id.publisher_text);

        String title = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COL_2));
        String author = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COL_3));
        String publisher = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COL_4));

        titleTextView.setText(title);
        authorTextView.setText(author);
        publisherTextView.setText(publisher);
    }
}
