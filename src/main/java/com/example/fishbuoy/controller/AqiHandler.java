package com.example.fishbuoy.controller;

import com.example.fishbuoy.entity.Aqi;
import com.example.fishbuoy.repository.AqiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aqi")
public class AqiHandler {
    @Autowired
    private AqiRepository aqiRepository;
    @GetMapping("/findAll/{page}/{size}")
    public Page<Aqi> findAll(@PathVariable("page") String page, @PathVariable("size") String size){
        Pageable pageable = PageRequest.of(Integer.parseInt(page)-1,Integer.parseInt(size));
        return aqiRepository.findAll(pageable);
    }
    @PostMapping("/add")
    public String save(@RequestBody Aqi aqi){
        Aqi result = aqiRepository.save(aqi);
        return "success";
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") String id){
        aqiRepository.deleteById(id);
    }
    @GetMapping("/findById/{id}")
    public Aqi findById(@PathVariable("id") String id){
        return aqiRepository.findById(id).get();
    }
}
