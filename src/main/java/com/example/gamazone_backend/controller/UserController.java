package com.example.gamazone_backend.controller;

import com.example.gamazone_backend.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")
public class UserController {

    /**
     * returns all users
     * @return users as an ArrayList
     */
    @GetMapping()
    public ArrayList<User> getUsers(){
        return null;
    }

    /**
     * returns a specific user
     * @param userId id of the requested user
     * @return the requested user
     */
    @GetMapping("/{userId}")
    public User getUser(@PathVariable int userId){
        return null;
    }

    /**
     * creates a new user
     * @param newUser the user to be created
     */
    @PostMapping
    public void createUser(@RequestBody User newUser){
        // create new user
    }

    /**
     * updates an existing user
     * @param userId id of the requested user
     */
    @PutMapping("/{userId}")
    public void updateUser(@PathVariable int userId){
        // update user
    }

    /**
     * deletes a specific user
     * @param userId id of the user to be deleted
     */
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable int userId){
        // delete user
    }
}
