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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/datatable")
public class DataTableController {
    @Autowired
    private DataTableRepository dataTableRepository;
    @GetMapping("/findAll")
//    查询所有的数据
    public List<Data_table> findAll(){

        return dataTableRepository.findAll();
    }
    @GetMapping("/findAll/{page}/{size}")
//    分页查询数据
    public Page<Data_table> findAll(@PathVariable("page") String page, @PathVariable("size") String size){
        Pageable pageable = PageRequest.of(Integer.parseInt(page)-1,Integer.parseInt(size));
        return dataTableRepository.findAll(pageable);
    }
    @GetMapping("/findAll/{dev_id}")
    public List<Data_table> findAll(@PathVariable("dev_id") String dev_id){
        List<Data_table> data_tableList = dataTableRepository.findAll();
        List<Data_table> dataTableList = new ArrayList<>();
        for(int i = 0; i < data_tableList.size(); i++){
            Data_table data_table = data_tableList.get(i);
            if (data_table.getDev_id().equals(dev_id)){
                dataTableList.add(data_table);
            }
        }
        return dataTableList;
    }
    @GetMapping("/findAll/devId")
    public List<String> findAlldevId(){
        List<Data_table> data_tableList = dataTableRepository.findAll();
        List<String> dataTableList = new ArrayList<>();
        for(int i = 0; i < data_tableList.size(); i++){
            String stringList = data_tableList.get(i).getDev_id();
            dataTableList.add(stringList);
        }
        HashSet hashSet = new HashSet(dataTableList);
        dataTableList.clear();
        dataTableList.addAll(hashSet);
        return dataTableList;
    }
}
