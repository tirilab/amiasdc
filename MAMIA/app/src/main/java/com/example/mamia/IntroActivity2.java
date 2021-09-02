package com.example.mamia;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class IntroActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro2);
    }

    public void nextActivity(View v) {
        Intent i = new Intent(this, IntroActivity3.class);
        startActivity(i);
    }

    public void prevActivity(View v) {
        Intent i = new Intent(this, IntroActivity1.class);
        startActivity(i);
    }
}