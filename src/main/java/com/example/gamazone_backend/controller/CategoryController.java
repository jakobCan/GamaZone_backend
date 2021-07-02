package com.example.gamazone_backend.controller;

import com.example.gamazone_backend.model.Category;
import com.example.gamazone_backend.model.Planet;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    /**
     * returns all categories
     * @return categories as an ArrayList
     */
    @GetMapping()
    public ArrayList<Category> getCategories(){
        return null;
    }

    /**
     * Returns all planets of a specific category
     * @param categoryId id of the specific category
     * @return requested planets as an ArrayList
     */
    @GetMapping("/{categoryId}")
    public ArrayList<Planet> getAllPlanetsOfCategory(@PathVariable int categoryId){
        return null;
    }

    /**
     * creates a new category
     * @param newCategory the category to be created
     */
    @PostMapping()
    public void createCategory(@RequestBody Category newCategory){
        // create category
    }

    /**
     * updates a category
     * @param categoryId id of the category to be updated
     */
    @PutMapping("/{categoryId}")
    public void updateCategory(@PathVariable int categoryId){
        // update category
    }

    /**
     * deletes a category
     * @param categoryId id of the category to be deleted
     */
    @DeleteMapping("/{categoryId}")
    public void deleteCategory(@PathVariable int categoryId){
        // delete category
    }
}
