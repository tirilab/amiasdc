package com.example.mamia;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class InputRecommendationsActivity extends AppCompatActivity {

    String[] items;
    ArrayList<String> listItems;
    ArrayAdapter<String> adapter;
    ListView listView;
    EditText editText;
    int length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_recommendations);


        listView = (ListView) findViewById(R.id.listview);

        editText = (EditText) findViewById(R.id.search_recommendations);
        initList();
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                listView.setVisibility(View.VISIBLE);
                length = charSequence.toString().length();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                listView.setVisibility(View.VISIBLE);
                if (charSequence.toString().equals("")) {
                    listView.setVisibility(View.GONE);
                    initList();
                }
                else {
                    searchItem(charSequence.toString());
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {
                listView.setVisibility(View.VISIBLE);
                if (editable.toString().length() < length) {
                    initList();
                    for (String item:items) {
                        if (!item.toLowerCase().contains(editable.toString().toLowerCase())) {
                            listItems.remove(item);
                        }
                    }
                }
            }
        });
    }



    public void initList() {
        items = new String[]{
                "CDC daily nutrition guidelines",
                "foods to avoid during pregnancy",
                "WHO guideline exercises",
                "moderate intensity activities",
                "emotions and mental wellness",
                "environmental exposures",
                "vaccinations"
        };
        listItems = new ArrayList<>(Arrays.asList(items));
        adapter = new ArrayAdapter<String>(this, R.layout.search_list, R.id.searchList, listItems);
        listView.setAdapter(adapter);
    }

    public void searchItem(String textToSearch) {
        for (String item:items) {
            if (!item.toLowerCase().contains(textToSearch.toString().toLowerCase())) {
                listItems.remove(item);
            }
        }
        adapter.notifyDataSetChanged();
    }
}