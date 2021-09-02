package com.example.mamia;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class IntroActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro1);
    }

    public void nextActivity(View v) {
        Intent i = new Intent(this, IntroActivity2.class);
        startActivity(i);
    }

    public void prevActivity(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}