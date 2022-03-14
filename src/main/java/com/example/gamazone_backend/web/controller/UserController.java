package com.example.gamazone_backend.web.controller;

import com.example.gamazone_backend.model.User;
import com.example.gamazone_backend.repository.UserRepository;
import com.example.gamazone_backend.web.security.service.CustomUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "Http://localhost:8080")
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder BCryptPasswordEncoder;

    @Autowired
    private CustomUserDetailService customUserDetailService;

    @GetMapping("")
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/{userId}")
    public Optional<User> getUserById(@PathVariable long userId){
        return userRepository.findById(userId);
    }

    @GetMapping("/username/{username}")
    public User getUserByUsername(@PathVariable String username){
        return userRepository.findByUsername(username);
    }

    @RequestMapping(value = "/username", method = RequestMethod.GET)
    @ResponseBody
    public String currentUserName(Authentication authentication) {
        return authentication.getName();
    }

    @PutMapping("/admin/{userId}")
    public User updateUser(@PathVariable Long userId, @Valid @RequestBody User userDetails) {
        User user = userRepository.findById(userId).orElse(null);
        assert user != null;
        user.setUsername(userDetails.getUsername());
        user.setPassword(userDetails.getPassword());
        user.setEmail(userDetails.getEmail());
        user.setLastName(userDetails.getLastName());
        user.setFirstName(userDetails.getFirstName());
        user.setRole(userDetails.getRole());
        user.setActive(userDetails.isActive());
        userRepository.save(user);
        return user;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable User userId){
       userRepository.delete(userId);
        return userId + "was deleted.";
    }
    @GetMapping("/roles")
    public Collection<? extends GrantedAuthority> getCurrentAuthorities() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(auth);
        return auth.getAuthorities();
    }
    @PostMapping("/register")
    public @ResponseBody User createUser(@RequestBody @Valid User user) {
        String encodedPassword = BCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        return userRepository.save(user);
    }

/*    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("errorMsg", "Your username and password are invalid.");

        if (logout != null)
            model.addAttribute("msg", "You have been logged out successfully.");

        return "login";
    }*/
}
