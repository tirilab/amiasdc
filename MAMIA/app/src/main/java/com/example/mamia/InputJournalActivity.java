package com.example.mamia;

import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.text.SimpleDateFormat;

public class InputJournalActivity extends AppCompatActivity {

    Spinner journal_spinner;
    Button previous_entries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_journal);

        TextView journalDate = (TextView) findViewById(R.id.journal_title);
        long date = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("MMM-dd");
        String dateString = sdf.format(date);
        journalDate.setText("Journal, " + dateString);

        journal_spinner = findViewById(R.id.journal_spinner);

        // style and population spinner
        ArrayAdapter<String> a1 = new ArrayAdapter<String>(InputJournalActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.journalArray));
        // dropdown and layout style
        a1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        journal_spinner.setAdapter(a1);

        previous_entries = findViewById(R.id.button4);
        previous_entries.setOnClickListener(view -> {
            Intent i = new Intent(InputJournalActivity.this, InputJournalPreviousActivity.class);
            startActivity(i);
        });
    }
}