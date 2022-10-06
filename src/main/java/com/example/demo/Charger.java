package com.example.demo;

import javax.persistence.*;
@Entity
@Table
public class Charger {
    @Id
    @SequenceGenerator(
        name = "charger_sequence",
        sequenceName = "charger_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "charger_sequence"
    )
    private Integer id;
    private String statNm;
    private String statId;
    private Integer chgerId;
    private Integer chgerType;
    private String addr;
    private float lat;
    private float lng;
    private String useTime;
    private String busiId;
    private String busiNm;
    private String busiCall;
    private Integer stat;
    private String statUpdDt;
    private String powerType;
    private Integer zcode;
    private String parkingFree;
    private String note;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatNm() {
        return this.statNm;
    }

    public void setStatNm(String statNm) {
        this.statNm = statNm;
    }

    public String getStatId() {
        return this.statId;
    }

    public void setStatId(String statId) {
        this.statId = statId;
    }

    public Integer getChgerId() {
        return this.chgerId;
    }

    public void setChgerId(Integer chgerId) {
        this.chgerId = chgerId;
    }

    public Integer getChgerType() {
        return this.chgerType;
    }

    public void setChgerType(Integer chgerType) {
        this.chgerType = chgerType;
    }

    public String getAddr() {
        return this.addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public float getLat() {
        return this.lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLng() {
        return this.lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    public String getUseTime() {
        return this.useTime;
    }

    public void setUseTime(String useTime) {
        this.useTime = useTime;
    }

    public String getBusiId() {
        return this.busiId;
    }

    public void setBusiId(String busiId) {
        this.busiId = busiId;
    }

    public String getBusiNm() {
        return this.busiNm;
    }

    public void setBusiNm(String busiNm) {
        this.busiNm = busiNm;
    }

    public String getBusiCall() {
        return this.busiCall;
    }

    public void setBusiCall(String busiCall) {
        this.busiCall = busiCall;
    }

    public Integer getStat() {
        return this.stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }

    public String getStatUpdDt() {
        return this.statUpdDt;
    }

    public void setStatUpdDt(String statUpdDt) {
        this.statUpdDt = statUpdDt;
    }

    public String getPowerType() {
        return this.powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }

    public Integer getZcode() {
        return this.zcode;
    }

    public void setZcode(Integer zcode) {
        this.zcode = zcode;
    }

    public String getParkingFree() {
        return this.parkingFree;
    }

    public void setParkingFree(String parkingFree) {
        this.parkingFree = parkingFree;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Charger(
        Integer id,
        String statNm,
        String statId,
        Integer chgerId,
        Integer chgerType,
        String addr,
        float lat,
        float lng,
        String useTime,
        String busiId,
        String busiNm,
        String busiCall,
        Integer stat,
        String statUpdDt,
        String powerType,
        Integer zcode,
        String parkingFree,
        String note
    ){
        this.id = id ;
        this.statNm = statNm ;
        this.statId = statId ;
        this.chgerId = chgerId ;
        this.chgerType = chgerType ;
        this.addr = addr ;
        this.lat = lat ;
        this.lng = lng ;
        this.useTime = useTime ;
        this.busiId = busiId ;
        this.busiNm = busiNm ;
        this.busiCall = busiCall ;
        this.stat = stat ;
        this.statUpdDt = statUpdDt ;
        this.powerType = powerType ;
        this.zcode = zcode ;
        this.parkingFree = parkingFree ;
        this.note = note ;
    }
    public Charger(
        String statNm,
        String statId,
        Integer chgerId,
        Integer chgerType,
        String addr,
        float lat,
        float lng,
        String useTime,
        String busiId,
        String busiNm,
        String busiCall,
        Integer stat,
        String statUpdDt,
        String powerType,
        Integer zcode,
        String parkingFree,
        String note
    ){
        this.statNm = statNm ;
        this.statId = statId ;
        this.chgerId = chgerId ;
        this.chgerType = chgerType ;
        this.addr = addr ;
        this.lat = lat ;
        this.lng = lng ;
        this.useTime = useTime ;
        this.busiId = busiId ;
        this.busiNm = busiNm ;
        this.busiCall = busiCall ;
        this.stat = stat ;
        this.statUpdDt = statUpdDt ;
        this.powerType = powerType ;
        this.zcode = zcode ;
        this.parkingFree = parkingFree ;
        this.note = note ;
    }
    public Charger(
    ){
        this.id = 0 ;
    }
    
}


