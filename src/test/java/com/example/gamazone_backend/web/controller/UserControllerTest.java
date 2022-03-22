package com.example.gamazone_backend.web.controller;

import com.example.gamazone_backend.model.User;
import com.example.gamazone_backend.repository.UserRepository;
import com.example.gamazone_backend.web.security.service.CustomUserDetailService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.GrantedAuthority;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

class UserControllerTest {
    @Mock
    UserRepository userRepository;
    @Mock
    org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder BCryptPasswordEncoder;
    @Mock
    CustomUserDetailService customUserDetailService;
    @InjectMocks
    UserController userController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

/*    @Test
    void testGetUsers() {
        when(userRepository.findAll()).thenReturn(Arrays.<User>asList(new User(Long.valueOf(999), "username", "password", "ROLE_USER", "firstName", "lastName", "email@email.com", true)));

        List<User> result = userController.getUsers();
        result.get(1).getUsername().equals()
        Assertions.assertEquals(Arrays.<User>asList(new User(Long.valueOf(999), "username", "password", "ROLE_USER", "firstName", "lastName", "email@email.com", true)), result);
    }*/

    @Test
    void testGetUserById() {
        Optional<User> result = userController.getUserById(0L);
        Assertions.assertEquals(Optional.empty(), result);
    }

/*    @Test
    void testGetUserByUsername() {
        when(userRepository.findByUsername(anyString())).thenReturn(new User(Long.valueOf(1), "username", "password", "role", "firstName", "lastName", "email", true));

        User result = userController.getUserByUsername("username");
        Assertions.assertEquals(new User(Long.valueOf(1), "username", "password", "role", "firstName", "lastName", "email", true), result);
    }*/


    @Test
    void testCurrentUserRole() {
        String result = userController.currentUserRole(new User(null, null, null, "USER_ROLE", null, null, null, true));
        Assertions.assertEquals("USER_ROLE", result);
    }

    @Test
    void testUpdateUser() {
        //User result = userController.updateUser(Long.valueOf(1), new User(Long.valueOf(1), "username", "password", "role", "firstName", "lastName", "email", true));
        //Assertions.assertEquals(new User(Long.valueOf(1), "username", "password", "role", "firstName", "lastName", "email", true), result);
    }

    @Test
    void testDeleteUser() {
        User result = userController.createUser(new User(99L, "username", "passworded", "role", "firstName", "lastName", "email@email.com", true));
        userController.deleteUser(new User(99L, "username", "password", "role", "firstName", "lastName", "email", true));
        Assertions.assertEquals(null, result);
    }


/*    @Test
    void testCreateUser() {
        User result = userController.createUser(new User(99L, "username", "passworded", "role", "firstName", "lastName", "email@email.com", true));
        Assertions.assertEquals(new User(99L, "username", "passworded", "role", "firstName", "lastName", "email@email.com", true), result);
    }*/
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme