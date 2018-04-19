package com.dishesMS.model;

import java.util.Date;

/**
 * Created by aa123 on 2018/4/18.
 */
public class CookingTable {
    private int id;
    private int orderInfoId;
    private int cookingNum;
    private Date startDate;
    private Date endDate;
    private int cookingStaffId;
    private  int notServiceNum;

    private Order order;

    public CookingTable()
    {
        super();
    }

    public CookingTable(int orderInfoId,int cookingNum,Date startDate)
    {
        this.orderInfoId = orderInfoId;
        this.cookingNum = cookingNum;
        this.startDate = startDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderInfoId() {
        return orderInfoId;
    }

    public void setOrderInfoId(int orderInfoId) {
        this.orderInfoId = orderInfoId;
    }

    public int getCookingNum() {
        return cookingNum;
    }

    public void setCookingNum(int cookingNum) {
        this.cookingNum = cookingNum;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getCookingStaffId() {
        return cookingStaffId;
    }

    public void setCookingStaffId(int cookingStaffId) {
        this.cookingStaffId = cookingStaffId;
    }

    public int getNotServiceNum() {
        return notServiceNum;
    }

    public void setNotServiceNum(int notServiceNum) {
        this.notServiceNum = notServiceNum;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
