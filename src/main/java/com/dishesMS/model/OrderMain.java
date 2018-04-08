package com.dishesMS.model;

import java.util.Date;
import java.util.List;

public class OrderMain {
    private Integer id;

    private Integer customerId;

    private Date date;

    private Integer tableId;

    private Integer money;

    private Integer orderStatus;

    private List<Order> orderInfo;

    public List<Order> getOrderInfo(){
        return this.orderInfo;
    }
    public void setOrderInfo(List<Order> orderInfo){
        this.orderInfo =orderInfo;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }


    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}