package com.example.gamazone_backend.controller;

import com.example.gamazone_backend.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping()
    public ArrayList<User> getUsers(){
        return null;
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable int userId){
        return null;
    }

    @PostMapping
    public void createUser(@RequestBody User newUser){
        // create new user
    }

    @PutMapping("/{userId}")
    public void updateUser(@PathVariable int userId){
        // update user
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable int userId){
        // delete user
    }
}
