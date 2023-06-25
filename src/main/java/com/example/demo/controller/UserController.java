package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * User Rest Controller.
 *
 * @author kshitijbaluni
 * @since 25 June 2023
 */
@RestController
@RequestMapping(value = "/public/v2/users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Iterable<User> getUsers() {
        return userService.getUsers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<User> getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }
}
