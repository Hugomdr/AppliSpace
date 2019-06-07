package com.example.applispace;

import com.example.applispace.model.Planet;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApiPlanet {

    @GET("api/planetes/planetesdata")
    Call<List<Planet>> getPlanetData();

}
