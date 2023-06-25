package com.example.demo.service;

import com.example.demo.domain.User;

import java.util.Optional;

/**
 * User Service Interface.
 *
 * @author kshitijbaluni
 * @since 25 June 2023
 */
public interface UserService {
    Iterable<User> getUsers();

    Optional<User> getUser(Long id);

    void createUser(User user);

}
