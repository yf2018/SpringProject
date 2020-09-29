package com.example.fishbuoy.repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class DataTableTest {
    @Autowired
    private DataTableRepository dataTableRepository;
    @Test
    void findAll(){
        System.out.println(dataTableRepository.findAll());
    }
}
