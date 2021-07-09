package com.example.gamazone_backend.business.service;

import com.example.gamazone_backend.data.model.Category;
import com.example.gamazone_backend.data.model.Planet;
import com.example.gamazone_backend.web.api.PlanetApi;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PlanetService implements PlanetApi {

    @Override
    public ArrayList<Planet> getPlanets() {
        return null;
    }

    @Override
    public Planet getPlanet(int planetId) {
        return null;
    }

    @Override
    public void createPlanet(Planet newPlanet) {

    }

    @Override
    public void updatePlanet(int planetId) {

    }

    @Override
    public void deletePlanet(int planetId) {

    }

    @Override
    public ArrayList<Category> getCategoriesOfPlanet(int planetId) {
        return null;
    }
}
