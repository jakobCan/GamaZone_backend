package com.example.gamazone_backend.web.controller;

import com.example.gamazone_backend.data.model.SpaceObject;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/products")
public class SpaceObjectController {

        @GetMapping()
        public ArrayList<SpaceObject> getSpaceObjects(){
                ArrayList<SpaceObject> spaceObjects = new ArrayList<>();
                spaceObjects.add(new SpaceObject("Terra", 100, "Lorem Ipsum", "afafoiajf", "Planet"));
                spaceObjects.add(new SpaceObject("Terra", 100, "Lorem Ipsum", "afafoiajf", "Planet"));
                spaceObjects.add(new SpaceObject("Terra", 100, "Lorem Ipsum", "afafoiajf", "Planet"));
                spaceObjects.add(new SpaceObject("Terra", 100, "Lorem Ipsum", "afafoiajf", "Planet"));
                spaceObjects.add(new SpaceObject("Terra", 100, "Lorem Ipsum", "afafoiajf", "Planet"));
                spaceObjects.add(new SpaceObject("Terra", 100, "Lorem Ipsum", "afafoiajf", "Planet"));
                spaceObjects.add(new SpaceObject("Terra", 100, "Lorem Ipsum", "afafoiajf", "Planet"));
                spaceObjects.add(new SpaceObject("Terra", 100, "Lorem Ipsum", "afafoiajf", "Planet"));
                spaceObjects.add(new SpaceObject("Terra", 100, "Lorem Ipsum", "afafoiajf", "Planet"));
                spaceObjects.add(new SpaceObject("Terra", 100, "Lorem Ipsum", "afafoiajf", "Planet"));
                return spaceObjects;
//              return spaceObjectRepository.findAll();
        }

        @GetMapping("/{id}")
        public SpaceObject getSpaceObject(@PathVariable Long id){
                return null;
//                return spaceObjectRepository.find(id);
        }
        
        @PostMapping()
        public void createSpaceObject(@RequestBody SpaceObject newSpaceObject){
            // create new SpaceObject
        }
        
        @PutMapping("/{id}")
        public void updateSpaceObject(@PathVariable Long id){
            // update SpaceObject
        }
        
        @DeleteMapping("/{id}")
        public void deleteSpaceObject(@PathVariable Long id){
            //delete SpaceObject
        }
        
//        @GetMapping("/{id}/categories")
//        public ArrayList<SpaceObject> getCategoriesOfSpaceObject(@PathVariable Long id){
//            return null;
//        }
}
