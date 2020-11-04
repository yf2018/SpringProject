package com.example.fishbuoy.entity;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Data
public class Data_table {
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDev_id() {
        return dev_id;
    }
    public void setDev_id(String dev_id) {
        this.dev_id = dev_id;
    }
    public String getDatetime() {
        return datetime;
    }
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }
    public String getTmp() {
        return tmp;
    }
    public void setTmp(String tmp) {
        this.tmp = tmp;
    }
    public String getEcm() {
        return ecm;
    }
    public void setEcm(String ecm) {
        this.ecm = ecm;
    }
    public String getPhg() {
        return phg;
    }
    public void setPhg(String phg) {
        this.phg = phg;
    }
    public String getRdo() {
        return rdo;
    }
    public void setRdo(String rdo) {
        this.rdo = rdo;
    }
    public String getTss() {
        return tss;
    }
    public void setTss(String tss) {
        this.tss = tss;
    }
    public String getEcho() {
        return echo;
    }
    public void setEcho(String echo) {
        this.echo = echo;
    }
    public String getChl() {
        return chl;
    }
    public void setChl(String chl) {
        this.chl = chl;
    }
    public String getEcs() {
        return ecs;
    }
    public void setEcs(String ecs) {
        this.ecs = ecs;
    }
    public float getLat() {
        return lat;
    }
    public void setLat(float lat) {
        this.lat = lat;
    }
    public float getLng() {
        return lng;
    }
    public void setLng(float lng) {
        this.lng = lng;
    }
    @Id
    private String id;
    private String dev_id;
    private String datetime;
    private String tmp;
    private String ecm;
    private String phg;
    private String rdo;
    private String tss;
    private String echo;
    private String chl;
    private String ecs;
    private float lat;
    private float lng;
}
