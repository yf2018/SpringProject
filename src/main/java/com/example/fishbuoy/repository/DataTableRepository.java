package com.example.fishbuoy.repository;
import com.example.fishbuoy.entity.Data_table;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface DataTableRepository extends JpaRepository<Data_table,String>{
}
