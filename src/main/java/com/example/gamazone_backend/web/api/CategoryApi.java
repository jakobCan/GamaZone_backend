package com.example.gamazone_backend.web.api;

import com.example.gamazone_backend.data.model.Category;
import com.example.gamazone_backend.data.model.Planet;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public interface CategoryApi {

    /**
     * returns all categories
     * @return categories as an ArrayList
     */
    ArrayList<Category> getCategories();

    /**
     * Returns all planets of a specific category
     * @param categoryId id of the specific category
     * @return requested planets as an ArrayList
     */
    ArrayList<Planet> getAllPlanetsOfCategory(@PathVariable int categoryId);

    /**
     * creates a new category
     * @param newCategory the category to be created
     */
    void createCategory(@RequestBody Category newCategory);

    /**
     * updates a category
     * @param categoryId id of the category to be updated
     */
    void updateCategory(@PathVariable int categoryId);

    /**
     * deletes a category
     * @param categoryId id of the category to be deleted
     */
    void deleteCategory(@PathVariable int categoryId);
}
