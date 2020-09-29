package com.example.fishbuoy.controller;

import com.example.fishbuoy.entity.Data_table;
import com.example.fishbuoy.repository.DataTableRepository;
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
@RequestMapping("/datatable")
public class DataTableController {
    @Autowired
    private DataTableRepository dataTableRepository;
    @GetMapping("/findAll")
    public List<Data_table> findAll(){
        return dataTableRepository.findAll();
    }
    @GetMapping("/findAll/{page}/{size}")
    public Page<Data_table> findAll(@PathVariable("page") String page, @PathVariable("size") String size){
        Pageable pageable = PageRequest.of(Integer.parseInt(page)-1,Integer.parseInt(size));
        return dataTableRepository.findAll(pageable);
    }

}
