package com.example.fishbuoy.controller;
import com.example.fishbuoy.entity.Data_table;
import com.example.fishbuoy.repository.DataTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/datagraph")
public class GraphController {
    @Autowired
    private DataTableRepository dataTableRepository;
//    String dev_id = "10038";
    @GetMapping("/findAll")
    public List<String>  findAll(){
        List<Data_table> dataTableList = dataTableRepository.findAll().subList(0,20);
        List<String> echoList = new ArrayList<>();
        List<String> timeList = new ArrayList<>();
        List<String> waterDepthList = new ArrayList<>();
        waterDepthList.add("0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20");
        String str = String.join(",", waterDepthList);
        for(int i = 0 ; i < dataTableList.size();i++){
            timeList.add(dataTableList.get(i).getDatetime());// x坐标
            echoList.add(dataTableList.get(i).getEcho());// y坐标
        }
        return(timeList);
    }
}
