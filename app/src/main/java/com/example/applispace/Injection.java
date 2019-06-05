package com.example.applispace;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//Cette classe permet de me retourner des instances d'objets
public class Injection {
    private static RestApiPlanet restApiPlanet;

    //Singleton
    public static RestApiPlanet getRestApi(){
        if(restApiPlanet == null){
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://bridge.buddyweb.fr/")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

            restApiPlanet = retrofit.create(RestApiPlanet.class);
        }
        return restApiPlanet;
    }
}
