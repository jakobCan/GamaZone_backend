package com.example.gamazone_backend.web.controller;

import com.example.gamazone_backend.data.model.User;
import com.example.gamazone_backend.repository.UserRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

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
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("errorMsg", "Your username and password are invalid.");

        if (logout != null)
            model.addAttribute("msg", "You have been logged out successfully.");

        return "login";
    }
}
