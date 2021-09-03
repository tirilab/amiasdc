package com.example.mamia;

import android.content.Intent;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class IntroActivity4 extends AppCompatActivity {

    CalendarView calendarView;
    TextView myDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro4);

        calendarView = (CalendarView) findViewById(R.id.intro4_calendar);

    }

    public void nextActivity(View v) {
        Intent i = new Intent(this, IntroActivity4.class);
        startActivity(i);
    }
}