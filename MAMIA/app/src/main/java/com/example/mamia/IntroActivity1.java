package com.example.mamia;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class IntroActivity1 extends AppCompatActivity {

    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro1);

        b1 = findViewById(R.id.button11);
        b1.setOnClickListener(view -> {
            Intent i = new Intent(IntroActivity1.this, MainActivity.class);
            startActivity(i);
        });

        b2 = findViewById(R.id.button12);
        b2.setOnClickListener(view -> {
            Intent i = new Intent(IntroActivity1.this, IntroActivity2.class);
            startActivity(i);
        });
    }
}