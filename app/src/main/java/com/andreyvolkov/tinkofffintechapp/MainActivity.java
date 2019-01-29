package com.andreyvolkov.tinkofffintechapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mainChancesButton;
    private Button mainStatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        mainChancesButton = findViewById(R.id.main_chances_button);
        mainStatButton = findViewById(R.id.main_stat_button);
        setListeners();
    }

    private void setListeners() {
        mainStatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ChancesActivity.class);
                startActivity(i);
            }
        });

    }
}
