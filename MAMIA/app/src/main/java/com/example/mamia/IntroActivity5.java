package com.example.mamia;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class IntroActivity5 extends AppCompatActivity {

    Button nextButton;
    EditText nameInput;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro5);

        nameInput = (EditText) findViewById(R.id.name);

        nextButton = findViewById(R.id.button5);
        // when click next button
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = nameInput.getText().toString();
                Intent i = new Intent(IntroActivity5.this, InputActivity.class);
                i.putExtra("myName", name);
                startActivity(i);
            }
        });
    }
}