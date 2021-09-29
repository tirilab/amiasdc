package com.example.mamia;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class IntroActivity3 extends AppCompatActivity {

    Spinner age_spinner,race_spinner,ethnicity_spinner;
    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro3);

        age_spinner = findViewById(R.id.age_spinner);
        race_spinner = findViewById(R.id.race_spinner);
        ethnicity_spinner = findViewById(R.id.ethnicity_spinner);

        getInput();
        nextButton = findViewById(R.id.button3);
        // when click next button
        nextButton.setOnClickListener(view -> {
//            UserModel userModel = new UserModel(-1,
//                    age_spinner.getSelectedItem().toString(),
//                    race_spinner.getSelectedItem().toString(),
//                    ethnicity_spinner.getSelectedItem().toString(), "-1");
//            DataBaseHelper dataBaseHelper = new DataBaseHelper(IntroActivity3.this);
//            boolean success = dataBaseHelper.addOne(userModel);

            Intent i = new Intent(IntroActivity3.this, IntroActivity4.class);
            startActivity(i);
        });
    }

    private void getInput() {
        age_spinner = findViewById(R.id.age_spinner);
        // style and population spinner
        ArrayAdapter<String> a1 = new ArrayAdapter<String>(IntroActivity3.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ageArray));
        // dropdown and layout style
        a1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        age_spinner.setAdapter(a1);

        race_spinner = findViewById(R.id.race_spinner);
        ArrayAdapter<String> a2 = new ArrayAdapter<String>(IntroActivity3.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.raceArray));
        a2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        race_spinner.setAdapter(a2);

        ethnicity_spinner = findViewById(R.id.ethnicity_spinner);
        ArrayAdapter<String> a3 = new ArrayAdapter<String>(IntroActivity3.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ethnicityArray));
        a3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ethnicity_spinner.setAdapter(a3);
    }

}