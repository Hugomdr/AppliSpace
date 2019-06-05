package com.example.applispace.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.applispace.R;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private static final String SelectedPlanet = "selected_planet";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);
        showDescription();
    }

    public void showDescription() {

        // Get the text view where the description is displayed
        TextView descriptionView = findViewById(R.id.description);
        // Get the text view where the title is displayed
        TextView titleView = findViewById(R.id.title);

        //String planet = getIntent().getStringExtra(SelectedPlanet);
        ArrayList<String> planet = getIntent().getStringArrayListExtra(SelectedPlanet);

        titleView.setText(planet.get(0));
        descriptionView.setText(planet.get(1));
    }
}
