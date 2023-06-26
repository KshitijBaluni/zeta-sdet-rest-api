package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * User Service Implementation.
 *
 * @author kshitijbaluni
 * @since 25 June 2023
 */
@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;

    /**
     * Get list of users.
     *
     * @return iterable users list.
     */
    @Override
    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    /**
     * Get user with id.
     *
     * @param id user id
     * @return user
     */
    @Override
    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    /**
     * Create user.
     *
     * @param user user
     */
    @Override
    public void createUser(User user) {
        if (user != null)
            userRepository.save(user);
        else
            System.out.println("User Invalid or null");
    }
}
