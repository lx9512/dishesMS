package com.dishesMS.model;

public class Order {
    private Integer id;

    private Integer dishesinfoId;

    private Integer orderId;

    private Integer number;
//旧用户体验好：（不使用）status用来保存当前账单的状态，状态为：0-未下单，1-未处理，2-未上传，3-已完成，4-删除订单

    //分别使用 untreateStatus，completeStatus来表示未完成和已完成的数量
    private Integer untreateStatus;
    private Integer completeStatus;

    private Dishes dishes;

    private OrderMain orderMain;

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

    public Integer getCompleteStatus() {
        return completeStatus;
    }

    public void setCompleteStatus(Integer completeStatus) {
        this.completeStatus = completeStatus;
    }

    public Integer getUntreateStatus() {
        return untreateStatus;
    }

    public void setUntreateStatus(Integer untreateStatus) {
        this.untreateStatus = untreateStatus;
    }

    public Dishes getDishes() {
        return dishes;
    }

    public void setDishes(Dishes dishes) {
        this.dishes = dishes;
    }

    public OrderMain getOrderMain() {
        return orderMain;
    }

    public void setOrderMain(OrderMain orderMain) {
        this.orderMain = orderMain;
    }
}