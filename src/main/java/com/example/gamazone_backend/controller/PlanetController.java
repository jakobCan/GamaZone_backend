package com.example.gamazone_backend.controller;

import com.example.gamazone_backend.model.Planet;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/planet")
public class PlanetController {

    @CrossOrigin    // TODO: 29.06.2021 do we need this?
    @GetMapping()
    public ArrayList<Planet> getPlanets(){  // TODO: 29.06.2021 where does the list come from?
        return null;
    }

    @GetMapping("/{planetId}")
    public Planet getPlanet(@PathVariable int planetId){
        return null;
    }

    @PostMapping()
    public void createPlanet(@RequestBody Planet newPlanet){
        // create new Planet
    }

    @PutMapping("/{planetId}")
    public void updatePlanet(@PathVariable int planetId){
        // update planet
    }

    @DeleteMapping("/{planetId}")
    public void deletePlanet(@PathVariable int planetId){
        //delete planet
    }
}
