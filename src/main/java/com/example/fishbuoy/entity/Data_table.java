package com.example.fishbuoy.entity;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Data_table {
    @Id
    private String datetime;
    private String tmp;
    private String ecm;
    private String phg;
    private String rdo;
    private String tss;

}
