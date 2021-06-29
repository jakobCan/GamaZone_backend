package com.example.gamazone_backend.controller;

import com.example.gamazone_backend.model.Category;
import com.example.gamazone_backend.model.Planet;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @GetMapping()
    public ArrayList<Category> getCategories(){
        return null;
    }

    @GetMapping("/{categoryId}")
    public ArrayList<Planet> getAllPlanetsOfCategory(@PathVariable int categoryId){
        return null;
    }

    @PostMapping()
    public void createCategory(@RequestBody Category newCategory){
        // create category
    }

    @PutMapping("/{categoryId}")
    public void updateCategory(@PathVariable int categoryId){
        // update category
    }

    @DeleteMapping("/{categoryId}")
    public void deleteCategory(@PathVariable int categoryId){
        // delete category
    }
}
