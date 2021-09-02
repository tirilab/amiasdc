package com.example.mamia;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class IntroActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro3);

        Spinner s1 = (Spinner) findViewById(R.id.age_spinner);
        ArrayAdapter<String> a1 = new ArrayAdapter<String>(IntroActivity3.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ageArray));
        a1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(a1);

        Spinner s2 = (Spinner) findViewById(R.id.race_spinner);
        ArrayAdapter<String> a2 = new ArrayAdapter<String>(IntroActivity3.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.raceArray));
        a2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(a2);

        Spinner s3 = (Spinner) findViewById(R.id.ethnicity_spinner);
        ArrayAdapter<String> a3 = new ArrayAdapter<String>(IntroActivity3.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ethnicityArray));
        a3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s3.setAdapter(a3);
    }

}