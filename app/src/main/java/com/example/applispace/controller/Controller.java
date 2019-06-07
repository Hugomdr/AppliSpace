package com.example.applispace.controller;

import com.example.applispace.RestApiPlanet;
import com.example.applispace.model.Planet;
import com.example.applispace.view.MainActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Controller {

    public MainActivity view;
    private RestApiPlanet restApiPlanet;

    public Controller(MainActivity view, RestApiPlanet restApiPlanet) {
        this.view = view;
        this.restApiPlanet = restApiPlanet;
    }

    public void onCreate() {
        Call<List<Planet>> call = restApiPlanet.getPlanetData();
        call.enqueue(new Callback<List<Planet>>() {
            @Override
            public void onResponse(Call<List<Planet>> call, Response<List<Planet>> response) {
                List<Planet> planetList = response.body();
                view.showList(planetList);
            }

            @Override
            public void onFailure(Call<List<Planet>> call, Throwable t) {

            }
        });
    }
}
