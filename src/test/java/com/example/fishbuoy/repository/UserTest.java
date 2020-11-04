package com.example.fishbuoy.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    void findAll(){
        System.out.println(userRepository.findAll());
    }
}
