package com.example.mamia;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class InputJournalPreviousActivity extends AppCompatActivity {

    TextView myTextView;
    String s1[], s2[];
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_journal_previous);

        recyclerView = (RecyclerView) findViewById(R.id.recycle);
        String[] s1 = getResources().getStringArray(R.array.journalArray);
        String[] s2 = getResources().getStringArray(R.array.journalArray);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}