package com.example.gamazone_backend.data.model;

public class Planet {
    private SpaceObjectDetails details;

    public Planet(String name, int price) {
        details = new SpaceObjectDetails(name, price);
    }

    public Planet(String name, int price, String description, String tagline) {
        details = new SpaceObjectDetails(name, price, description, tagline);
    }

    public SpaceObjectDetails getDetails() {
        return details;
    }
}
