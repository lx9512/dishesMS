package com.dishesMS.model;

import java.util.Date;

/**
 * Created by aa123 on 2018/4/17.
 */
public class ServiceTable {
    private Integer id;
    private Integer orderInfoId;
    private Date serviceTime;
    private Integer serviceNumber;
    private Integer serviceStaffId;
    private Order order;

    public ServiceTable()
    {
        super();
    }
    public ServiceTable(int orderInfoId,Date serviceTime,int serviceNumber,int serviceStaffId)
    {
        this.orderInfoId = orderInfoId;
        this.serviceTime = serviceTime;
        this.serviceNumber = serviceNumber;
        this.serviceStaffId = serviceStaffId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderInfoId() {
        return orderInfoId;
    }

    public void setOrderInfoId(Integer orderInfoId) {
        this.orderInfoId = orderInfoId;
    }

    public Date getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(Date serveTime) {
        this.serviceTime = serveTime;
    }

    public Integer getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(Integer serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public Integer getServiceStaffId() {
        return serviceStaffId;
    }

    public void setServiceStaffId(Integer serviceStaffId) {
        this.serviceStaffId = serviceStaffId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
