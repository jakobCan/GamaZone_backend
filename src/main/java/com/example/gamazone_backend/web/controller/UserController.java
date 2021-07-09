package com.example.gamazone_backend.web.controller;

import com.example.gamazone_backend.data.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController implements com.example.gamazone_backend.web.api.UserApi {

    @Override
    @GetMapping()
    public ArrayList<User> getUsers(){
        return null;
    }

    @Override
    @GetMapping("/{userId}")
    public User getUser(@PathVariable int userId){
        return null;
    }

    @Override
    @PostMapping
    public void createUser(@RequestBody User newUser){
        // create new user
    }

    @Override
    @PutMapping("/{userId}")
    public void updateUser(@PathVariable int userId){
        // update user
    }

    @Override
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable int userId){
        // delete user
    }
}
