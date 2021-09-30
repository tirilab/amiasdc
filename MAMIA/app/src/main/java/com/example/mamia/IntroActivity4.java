package com.example.mamia;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class IntroActivity4 extends AppCompatActivity {

    CalendarView calendarView;
    String date;
    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro4);

//        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
//            @Override
//            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
//                date = (i1 +1 ) + "/" + i2 + "/" + i;
//            }
//        });

        nextButton = findViewById(R.id.button4);
        // when click next button
        nextButton.setOnClickListener(view -> {
            Intent i = new Intent(IntroActivity4.this, InputActivity.class);
            startActivity(i);
        });

    }
}