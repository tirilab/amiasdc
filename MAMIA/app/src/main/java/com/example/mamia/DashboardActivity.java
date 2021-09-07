package com.example.mamia;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DashboardActivity extends AppCompatActivity {

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        aSwitch = findViewById(R.id.switch1);
        aSwitch.setChecked(true);

        Intent i = new Intent(DashboardActivity.this, InputActivity.class);
        if (!aSwitch.isChecked()) {
            startActivity(i);
        }
    }
}