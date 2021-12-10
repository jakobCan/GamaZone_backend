package com.example.gamazone_backend.repository;

import com.example.gamazone_backend.data.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);   // TODO: 10.09.2021 Whaaaaat?
}

// TODO: 17.09.2021 CONTINUE HERE:
// TODO: 17.09.2021 Create repository for SpaceObject