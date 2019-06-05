package com.example.applispace;

import com.example.applispace.model.RestPlanetResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApiPlanet {

    @GET("api/planetes/planetesdata")
    Call<RestPlanetResponse> getPlanetData();

}
