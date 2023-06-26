package com.example.demo.user;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
@SpringBootTest
public class UserTest {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;
    
    public UserTest(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @Test
    public void testAllUsers() {
        User user = User.builder().id(1).email("test@email").name("Test").status("Active").gender("male").build();
        //userService.createUser(user);
        userRepository.save(user);
        Assert.notNull(userRepository.findAll(), "Users are null");
    }
}
