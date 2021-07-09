package com.example.gamazone_backend.web.api;

import com.example.gamazone_backend.data.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public interface UserApi {

    /**
     * returns all users
     * @return users as an ArrayList
     */
    ArrayList<User> getUsers();

    /**
     * returns a specific user
     * @param userId id of the requested user
     * @return the requested user
     */
    User getUser(@PathVariable int userId);

    /**
     * creates a new user
     * @param newUser the user to be created
     */
    void createUser(@RequestBody User newUser);

    /**
     * updates an existing user
     * @param userId id of the requested user
     */
    void updateUser(@PathVariable int userId);

    /**
     * deletes a specific user
     * @param userId id of the user to be deleted
     */
    void deleteUser(@PathVariable int userId);
}
