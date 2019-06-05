package com.example.applispace.controller;

import com.example.applispace.RestApiPlanet;
import com.example.applispace.model.RestPlanetResponse;
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
        Call<RestPlanetResponse> call = restApiPlanet.getPlanetData();
        call.enqueue(new Callback<RestPlanetResponse>() {
            @Override
            public void onResponse(Call<RestPlanetResponse> call, Response<RestPlanetResponse> response) {
                RestPlanetResponse restPlanetResponse = response.body();
                List<Planet> planetList = restPlanetResponse.getResults();
                view.showList(planetList);
            }

            @Override
            public void onFailure(Call<RestPlanetResponse> call, Throwable t) {

            }
        });
    }
}
