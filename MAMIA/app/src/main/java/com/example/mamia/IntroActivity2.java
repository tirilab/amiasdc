package com.example.mamia;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class IntroActivity2 extends AppCompatActivity {
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro2);

        b1 = findViewById(R.id.button21);
        b1.setOnClickListener(view -> {
            Intent i = new Intent(IntroActivity2.this, MainActivity.class);
            startActivity(i);
        });

        b2 = findViewById(R.id.button22);
        b2.setOnClickListener(view -> {
            Intent i = new Intent(IntroActivity2.this, IntroActivity3.class);
            startActivity(i);
        });

    }
}