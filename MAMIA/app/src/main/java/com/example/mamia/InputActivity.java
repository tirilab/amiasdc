package com.example.mamia;

import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class InputActivity extends AppCompatActivity {

    Button bJournal, bDashboard, bRecommendations, bFitbit;
    TextView myName;
    String my_name, welcome;
    private static String LOG_TAG = "log";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        myName = (TextView) findViewById(R.id.myName);
//        welcome = getString(R.string.welcome_message, my_name);
        welcome = getString(R.string.welcome_message, "Jane");
        myName.setText(welcome);

        bJournal = findViewById(R.id.button_input_journal);
        bJournal.setOnClickListener(view -> {
            Intent i = new Intent(InputActivity.this, InputJournalActivity.class);
            startActivity(i);
        });

        bDashboard = findViewById(R.id.button_input_dashboard);
        bDashboard.setOnClickListener(view -> {
            Intent i = new Intent(InputActivity.this, InputDashboardActivity.class);
            startActivity(i);
        });

        bRecommendations = findViewById(R.id.button_input_recommendations);
        bRecommendations.setOnClickListener(view -> {
            Intent i = new Intent(InputActivity.this, InputRecommendationsActivity.class);
            startActivity(i);
        });

        bFitbit = findViewById(R.id.button_input_fitbit);
        bFitbit.setOnClickListener(view -> {
            Intent i = new Intent(InputActivity.this, InputFitbitActivity.class);
            startActivity(i);
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(LOG_TAG, "in saved instance state");
        CharSequence writtenData = welcome;
        outState.putCharSequence("savedData", writtenData);
        outState.putString("MyString", welcome);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(LOG_TAG, "in restore instance state");
        CharSequence storedData = savedInstanceState.getCharSequence("savedData");
        myName = (TextView) findViewById(R.id.myName);
//        myName.setText(storedData);
        String a = savedInstanceState.getString("MyString");
        myName.setText(a);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settingsMenu:
                Intent i = new Intent(this, Preferences.class);
                startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}