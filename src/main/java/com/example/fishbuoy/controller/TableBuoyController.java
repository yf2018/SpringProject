package com.example.fishbuoy.controller;

import com.example.fishbuoy.entity.TableBuoy;
import com.example.fishbuoy.repository.TableBuoyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tablebuoy")
public class TableBuoyController {
    @Autowired
    private TableBuoyRepository tableBuoyRepository;
    @GetMapping("/findAll")
    public List<TableBuoy> findAll(){
        return tableBuoyRepository.findAll();
    }
    @GetMapping("/findAll/{page}/{size}")
    public Page<TableBuoy> findAll(@PathVariable("page") String page, @PathVariable("size") String size){
        Pageable pageable = PageRequest.of(Integer.parseInt(page)-1,Integer.parseInt(size));
        return tableBuoyRepository.findAll(pageable);
    }
}
