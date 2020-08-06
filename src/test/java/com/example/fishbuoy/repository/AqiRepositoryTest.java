package com.example.fishbuoy.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AqiRepositoryTest {
    @Autowired
    private AqiRepository aqiRepository;
    @Test
    void findAll(){
        System.out.println(aqiRepository.findAll());
    }
    @Test
    void delete(){
        String id = "888";
        aqiRepository.deleteById(id);
    }
    @Test
    void findById(){
        String id = "30";
        System.out.println(aqiRepository.findById(id));
    }
}