package com.example.gamazone_backend.repository;

import com.example.gamazone_backend.data.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.username = :username")
    public User getUserByUsername(@Param("username") String username);

    User findByUsername(String username);   // TODO: 10.09.2021 Whaaaaat?

    List<User> findAll();

    User findByEmail(String email);

    User findUserByEmail(String email);

}

// TODO: 17.09.2021 CONTINUE HERE:
// TODO: 17.09.2021 Create repository for SpaceObject
