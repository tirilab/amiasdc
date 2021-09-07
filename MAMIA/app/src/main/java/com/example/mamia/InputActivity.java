package com.example.mamia;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class InputActivity extends AppCompatActivity {

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        aSwitch = findViewById(R.id.switch1);
        aSwitch.setChecked(false);

        Intent i = new Intent(InputActivity.this, DashboardActivity.class);
        if (aSwitch.isChecked()) {
            startActivity(i);
        }
    }

    public void journalActivity(View v) {
        Intent i = new Intent(this, JournalActivity.class);
        startActivity(i);
    }
}