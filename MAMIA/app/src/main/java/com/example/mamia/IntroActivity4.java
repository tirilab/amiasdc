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

        calendarView = (CalendarView) findViewById(R.id.intro4_calendar);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                date = (i1 +1 ) + "/" + i2 + "/" + i;
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            // when click next button
            @Override
            public void onClick(View view) {

            }
        });

    }

    public void nextActivity(View v) {
        Intent i = new Intent(this, InputActivity.class);
        startActivity(i);
    }
}