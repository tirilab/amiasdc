package com.example.mamia;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class InputActivity extends AppCompatActivity {

    Button bJournal, bDashboard, bRecommendations, bSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

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

        bSettings = findViewById(R.id.button_input_settings);
        bSettings.setOnClickListener(view -> {
            Intent i = new Intent(InputActivity.this, InputSettingsActivity.class);
            startActivity(i);
        });
    }



}