package com.dishesMS.model;

/**
 * Created by aa123 on 2018/3/28.
 */
public class Table {
    private int id;
    private String areaName;  //区域名
    private String number;    //序号
    private int peopleNum;    //桌台容纳人数
    private int status = 0;       //是否在用状态,默认为0
    //private String QRCodePath;  //桌台二维码路径
    private String describe;    //桌台描述

    public Table(int id,String areaName,String number,int peopleNum,int status,String describe)
    {
        this.id = id;
        this.areaName = areaName;
        this.number = number;
        this.peopleNum = peopleNum;
        this.describe = describe;
        this.status = status;
    }

    public Table(String areaName,String number,int peopleNum,String describe)
    {
        this.areaName = areaName;
        this.number = number;
        this.peopleNum = peopleNum;
        this.describe = describe;
    }

    public Table()
    {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public int getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(int peopleNum) {
        this.peopleNum = peopleNum;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
