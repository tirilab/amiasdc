package com.example.mamia;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.text.SimpleDateFormat;

public class InputJournalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_journal);

//        TextView journalDate = (TextView) findViewById(R.id.date);
//
//        long date = System.currentTimeMillis();
//
//        SimpleDateFormat sdf = new SimpleDateFormat("MMM MM dd, yyyy h:mm a");
//        String dateString = sdf.format(date);
//        journalDate.setText(dateString);
    }
}