package com.example.mamia;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class IntroActivity3 extends AppCompatActivity {

    DBmain dBmain;
    SQLiteDatabase sqLiteDatabase;
    Spinner s1,s2,s3;
    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro3);
        // https://youtu.be/gKSn6X05BkI
        dBmain = new dBmain(IntroActivity3.this);
        getInput();
        insertData();

    }

    private void insertData() {
        // when click next button
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("", s1.getItemAtPosition(s1.getSelectedItemPosition()).toString());
                sqLiteDatabase = dBmain.getWritableDatabase();
                Long rec = sqLiteDatabase.insert("course", null, contentValues);
                if (rec!=null) {
                    Toast.makeText(IntroActivity3.this, "data inserted", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(IntroActivity3.this, "data not inserted", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void getInput() {
        s1 = (Spinner) findViewById(R.id.age_spinner);
        // style and population spinner
        ArrayAdapter<String> a1 = new ArrayAdapter<String>(IntroActivity3.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ageArray));
        // dropdown and layout style
        a1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        s1.setAdapter(a1);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                Object ageInput = parent.getItemAtPosition(pos);
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        s2 = (Spinner) findViewById(R.id.race_spinner);
        ArrayAdapter<String> a2 = new ArrayAdapter<String>(IntroActivity3.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.raceArray));
        a2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(a2);
        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                Object raceInput = parent.getItemAtPosition(pos);
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        s3 = (Spinner) findViewById(R.id.ethnicity_spinner);
        ArrayAdapter<String> a3 = new ArrayAdapter<String>(IntroActivity3.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ethnicityArray));
        a3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s3.setAdapter(a3);
        s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                Object ethnicityInput = parent.getItemAtPosition(pos);
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    public void nextActivity(View v) {
        Intent i = new Intent(this, IntroActivity4.class);
        startActivity(i);
    }

}