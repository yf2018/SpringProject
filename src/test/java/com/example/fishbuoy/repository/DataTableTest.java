package com.example.fishbuoy.repository;
import com.example.fishbuoy.entity.Data_table;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
@SpringBootTest
public class DataTableTest {
    @Autowired
    private DataTableRepository dataTableRepository;
    @Test
    void findAll(){
        System.out.println(dataTableRepository.findAll());
    }
    @Test
    void findAllById(){
        String id = "2";
        System.out.print(dataTableRepository.findById(id));
    }
    @Test
    void findAlldevId(){
        List<Data_table> data_tableList = dataTableRepository.findAll();
        List<String> dataTableList = new ArrayList<>();
        for(int i = 0; i < data_tableList.size(); i++){
            String stringList = data_tableList.get(i).getDev_id();
            dataTableList.add(stringList);
        }
        HashSet hashSet = new HashSet(dataTableList);
        dataTableList.clear();
        dataTableList.addAll(hashSet);
        System.out.print(dataTableList);
    }
}
