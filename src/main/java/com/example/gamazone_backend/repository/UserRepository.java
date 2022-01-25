package com.example.gamazone_backend.repository;

import com.example.gamazone_backend.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    //@Query("SELECT u FROM User u WHERE u.username = :username")
    //public User getUserByUsername(@Param("username") String username);

    User findByUsername(String username);   // Tells JPA we need a name/String

    List<User> findAll();

    User findByEmail(String email);

    User findUserByEmail(String email);

}
