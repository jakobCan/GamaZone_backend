package com.example.gamazone_backend.web.controller;

import com.example.gamazone_backend.data.model.Category;
import com.example.gamazone_backend.data.model.Planet;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@CrossOrigin
@RequestMapping("/planets")
public class PlanetController implements com.example.gamazone_backend.web.api.PlanetApi {

    @Override
    @GetMapping()
    public ArrayList<Planet> getPlanets(){  // TODO: 29.06.2021 where does the list come from?
        return null;
    }

    @Override
    @GetMapping("/{planetId}")
    public Planet getPlanet(@PathVariable int planetId){
        return null;
    }

    @Override
    @PostMapping()
    public void createPlanet(@RequestBody Planet newPlanet){
        // create new Planet
    }

    @Override
    @PutMapping("/{planetId}")
    public void updatePlanet(@PathVariable int planetId){
        // update planet
    }

    @Override
    @DeleteMapping("/{planetId}")
    public void deletePlanet(@PathVariable int planetId){
        //delete planet
    }

    @Override
    @GetMapping("/{planetId}/categories")
    public ArrayList<Category> getCategoriesOfPlanet(@PathVariable int planetId){
        return null;
    }
}
