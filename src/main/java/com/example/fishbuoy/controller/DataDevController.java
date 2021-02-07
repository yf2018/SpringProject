package com.example.fishbuoy.controller;

import com.example.fishbuoy.entity.Data_dev;
import com.example.fishbuoy.repository.DataDevRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/datadev")
public class DataDevController {
    @Autowired
    private DataDevRepository dataDevRepository;
    @GetMapping("/findAll")
    public List<Data_dev> findAll(){
        return dataDevRepository.findAll();
    }
}
