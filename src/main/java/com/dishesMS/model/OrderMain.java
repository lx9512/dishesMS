package com.dishesMS.model;

import java.util.Date;
import java.util.List;

public class OrderMain {
    private Integer id;

    private Integer customerId;

//    private Date date;
    private Integer tableId;

    private Integer money;
//这里的账单状态用来表示是否结账 0 为未结账 1为线上已结账 2表示前台已结账
    private Integer orderStatus;

    private List<Order> orderInfo;

    /**20180414 by lx
     * 下单日期
     */
    private Date orderDate;

    /**20180414 by lx
     * 结账日期
     */
    private Date checkoutDate;

    /**20180414 by lx
     * 收银员信息
     */
    private Staff staff;

    /** 20180414 by lx
     * 桌台信息
     */
    private Table table;

    /** 20180414 by lx
     * 客户信息
     */
    private Customer customer;

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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }


    //    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }

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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

        public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }


}