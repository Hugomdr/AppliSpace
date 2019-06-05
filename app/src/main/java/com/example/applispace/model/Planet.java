package com.example.applispace.model;

import com.google.gson.annotations.SerializedName;

public class Planet {

    @SerializedName("planete")
    private String name;

    @SerializedName("decouverte")
    private String datedecouvert;

    @SerializedName("diametre")
    private String diametre;

    @SerializedName("distmoy")
    private String distmoysun;

    @SerializedName("distmoy2")
    private String distmoy;

    public String getName() {
        return name;
    }

    public String getDatedecouvert() {
        return datedecouvert;
    }

    public String getDiametre() {
        return diametre;
    }

    public String getDistmoysun() {
        return distmoysun;
    }

    public String getDistmoy() {
        return distmoy;
    }
}