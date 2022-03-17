package com.example.gamazone_backend.web.controller;

import com.example.gamazone_backend.model.SpaceObject;
import com.example.gamazone_backend.repository.SpaceObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/products")
public class SpaceObjectController {


        @Autowired
        private SpaceObjectRepository spaceObjectRepository;

        @GetMapping()
        public Iterable<SpaceObject> getSpaceObjects(){
                return spaceObjectRepository.findAll();
        }

        @GetMapping("/{id}")
        public SpaceObject getSpaceObject(@PathVariable Long id){
                return spaceObjectRepository.findSpaceObjectById(id);
        }

        @PreAuthorize("hasRole('ROLE_ADMIN')")
        @PostMapping("/create")
        public @ResponseBody SpaceObject createSpaceObject(@RequestBody @Valid SpaceObject newSpaceObject){
                return spaceObjectRepository.save(newSpaceObject);
        }

        @PreAuthorize("hasRole('ROLE_ADMIN')")
        @PutMapping("/{id}")
        public SpaceObject updateSpaceObject(@PathVariable Long id, @Valid @RequestBody SpaceObject spaceObjectDetails){
            SpaceObject spaceObject = spaceObjectRepository.findSpaceObjectById(id); //.orElse(null); why you not work?
            assert(spaceObject != null);
            spaceObject.setName(spaceObjectDetails.getName());
            spaceObject.setDescription(spaceObjectDetails.getDescription());
            spaceObject.setPrice(spaceObjectDetails.getPrice());
            spaceObject.setTagline(spaceObjectDetails.getTagline());
            spaceObject.setCategory(spaceObjectDetails.getCategory());
            spaceObjectRepository.save(spaceObjectDetails);
            return spaceObject;

        }
        @PreAuthorize("hasRole('ROLE_ADMIN')")
        @DeleteMapping("/{id}")
        public long deleteSpaceObject(@PathVariable Long id){
                spaceObjectRepository.deleteById(id);
                return id;
        }

        @GetMapping("/category/{category}")
        public List<SpaceObject> findSpaceObjectByCategory(@PathVariable String category){
                return spaceObjectRepository.findSpaceObjectByCategory(category);
        }

    }

