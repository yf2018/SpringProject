package com.example.fishbuoy.entity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
// 实体类，对应一张数据表
@Data
// 绑定 数据表（aqi table)
public class Aqi {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String quality;
    private String location;
    private String province;
    private String aqi;
    private String pm25;
}
