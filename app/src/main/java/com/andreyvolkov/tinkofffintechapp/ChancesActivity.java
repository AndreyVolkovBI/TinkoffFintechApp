package com.andreyvolkov.tinkofffintechapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class ChancesActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner chancesNameSpinner;
    private Spinner chancesInternshipSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chances);
        init();
    }

    private void init() {
        chancesNameSpinner = findViewById(R.id.chances_name_spinner);
        chancesNameSpinner = findViewById(R.id.chances_internship_spinner);

        @SuppressLint("ResourceType")
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adapter.add("Hello");
        adapter.add("Whoho");

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        chancesNameSpinner.setAdapter(adapter);
        chancesNameSpinner.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
