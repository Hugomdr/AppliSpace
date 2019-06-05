package com.example.applispace.model;

import java.util.List;

public class RestPlanetResponse {
    private int count;
    private String next;
    private List<Planet> results;

    public int getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public List<Planet> getResults() {
        return results;
    }
}
