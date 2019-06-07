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
        TextView diameterView = findViewById(R.id.description);
        // Get the text view where the title is displayed
        TextView titleView = findViewById(R.id.title);
        TextView distmoysun = findViewById(R.id.textView);
        TextView distmoyen = findViewById(R.id.textView2);
        TextView datedecouverte = findViewById(R.id.textView3);

        //String planet = getIntent().getStringExtra(SelectedPlanet);
        ArrayList<String> planet = getIntent().getStringArrayListExtra(SelectedPlanet);

        titleView.setText(planet.get(0));
        diameterView.setText("Diametre " + planet.get(1) + " km");
        distmoysun.setText("Distance moyenne soleil :" + planet.get(2) +" M km");
        distmoyen.setText("Distance moyenne terre :" + planet.get(3) + " M km");
        datedecouverte.setText("Date de découverte :" + planet.get(4));
    }
}
