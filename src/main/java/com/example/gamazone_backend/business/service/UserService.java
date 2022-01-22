package com.example.gamazone_backend.business.service;

import com.example.gamazone_backend.data.model.User;
import com.example.gamazone_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    
    public ArrayList<User> getUsers() {
        return null;
    }
    
    public User getUser(int userId) {
        return null;
    }

    public void createUser(User newUser) {

    }

    public void updateUser(int userId) {

    }

    public void deleteUser(int userId) {

    }
}
