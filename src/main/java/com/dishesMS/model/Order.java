package com.dishesMS.model;

public class Order {
    private Integer id;

    private Integer dishesinfoId;

    private Integer orderId;

    private Integer number;
//status用来保存当前账单的状态，状态为：0-未下单，1-未处理，2-未上传，3-已完成，4-删除订单
    private Integer infoStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDishesinfoId() {
        return dishesinfoId;
    }

    public void setDishesinfoId(Integer dishesinfoId) {
        this.dishesinfoId = dishesinfoId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getInfoStatus() {
        return infoStatus;
    }

    public void setInfoStatus(Integer infoStatus) {
        this.infoStatus = infoStatus;
    }
}