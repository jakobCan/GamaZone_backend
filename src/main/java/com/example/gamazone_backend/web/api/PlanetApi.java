package com.example.gamazone_backend.web.api;

import com.example.gamazone_backend.data.model.Category;
import com.example.gamazone_backend.data.model.Planet;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public interface PlanetApi {

    /**
     * returns all planets
     * @return planets as an ArrayList
     */
    ArrayList<Planet> getPlanets();

    /**
     * returns a specific planet
     * @param planetId id of requested planet
     * @return the requested planet
     */
    Planet getPlanet(@PathVariable int planetId);

    /**
     * creates a new planet
     * @param newPlanet the new planet to be created
     */
    void createPlanet(@RequestBody Planet newPlanet);

    /**
     * updates a specific planet
     * @param planetId id of the requested planet
     */
    void updatePlanet(@PathVariable int planetId);

    /**
     * deletes a specific planet
     * @param planetId id of the planet to be deleted
     */
    void deletePlanet(@PathVariable int planetId);

    /**
     * returns all categories of a specific planet
     * @param planetId id of requested planet
     * @return all the planets categories as an ArrayList
     */
    ArrayList<Category> getCategoriesOfPlanet(@PathVariable int planetId);
}
