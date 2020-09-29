package com.example.fishbuoy.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TableBuoyTest {
    @Autowired
    private TableBuoyRepository table_buoyRepository;
    @Test
    void findAll(){
        System.out.println(table_buoyRepository.findAll());
    }
}
