package com.example.gamazone_backend.web.controller;

import com.example.gamazone_backend.data.model.Category;
import com.example.gamazone_backend.data.model.Planet;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/categories")
public class CategoryController implements com.example.gamazone_backend.web.api.CategoryApi {

    @Override
    @GetMapping()
    public ArrayList<Category> getCategories(){
        return null;
    }

    @Override
    @GetMapping("/{categoryId}")
    public ArrayList<Planet> getAllPlanetsOfCategory(@PathVariable int categoryId){
        return null;
    }

    @Override
    @PostMapping()
    public void createCategory(@RequestBody Category newCategory){
        // create category
    }

    @Override
    @PutMapping("/{categoryId}")
    public void updateCategory(@PathVariable int categoryId){
        // update category
    }

    @Override
    @DeleteMapping("/{categoryId}")
    public void deleteCategory(@PathVariable int categoryId){
        // delete category
    }
}
