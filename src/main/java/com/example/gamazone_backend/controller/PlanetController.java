package com.example.gamazone_backend.controller;

import com.example.gamazone_backend.model.Category;
import com.example.gamazone_backend.model.Planet;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/planets")
public class PlanetController {

    /**
     * returns all planets
     * @return planets as an ArrayList
     */
    @GetMapping()
    public ArrayList<Planet> getPlanets(){  // TODO: 29.06.2021 where does the list come from?
        return null;
    }

    /**
     * returns a specific planet
     * @param planetId id of requested planet
     * @return the requested planet
     */
    @GetMapping("/{planetId}")
    public Planet getPlanet(@PathVariable int planetId){
        return null;
    }

    /**
     * creates a new planet
     * @param newPlanet the new planet to be created
     */
    @PostMapping()
    public void createPlanet(@RequestBody Planet newPlanet){
        // create new Planet
    }

    /**
     * updates a specific planet
     * @param planetId id of the requested planet
     */
    @PutMapping("/{planetId}")
    public void updatePlanet(@PathVariable int planetId){
        // update planet
    }

    /**
     * deletes a specific planet
     * @param planetId id of the planet to be deleted
     */
    @DeleteMapping("/{planetId}")
    public void deletePlanet(@PathVariable int planetId){
        //delete planet
    }

    /**
     * returns all categories of a specific planet
     * @param planetId id of requested planet
     * @return all the planets categories as an ArrayList
     */
    @GetMapping("/{planetId}/categories")
    public ArrayList<Category> getCategoriesOfPlanet(@PathVariable int planetId){
        return null;
    }
}
