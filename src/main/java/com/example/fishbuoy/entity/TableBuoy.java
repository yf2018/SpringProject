package com.example.fishbuoy.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Data
public class TableBuoy {
    private String time;
    private String temperature;
    private String conductivity;
    private String dO;
    private String pH;
    private String turbidity;

    public void setTime(String time) {
        this.time = time;
    }
    @Id //设置主键
    public String getTime() {
        return time;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getConductivity() {
        return conductivity;
    }

    public void setConductivity(String conductivity) {
        this.conductivity = conductivity;
    }

    public String getdO() {
        return dO;
    }

    public void setdO(String dO) {
        this.dO = dO;
    }

    public String getpH() {
        return pH;
    }

    public void setpH(String pH) {
        this.pH = pH;
    }

    public String getTurbidity() {
        return turbidity;
    }

    public void setTurbidity(String turbidity) {
        this.turbidity = turbidity;
    }
}
