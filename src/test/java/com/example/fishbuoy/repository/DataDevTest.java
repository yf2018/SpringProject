package com.example.fishbuoy.repository;

import com.example.fishbuoy.entity.Data_dev;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootTest
public class DataDevTest {
    @Autowired
    private DataDevRepository dataDevRepository;
    @Test
    void findAll(){
        System.out.println(dataDevRepository.findAll());
    }
}
