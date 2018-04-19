package com.dishesMS.service;

import com.dishesMS.model.CookingTable;

import java.util.List;

/**
 * Created by aa123 on 2018/4/18.
 */
public interface ICookingTableService {
    public void saveOrder(int orderId);
    public List<CookingTable> findCookingTable();
    public void editOrderCookingNum(int orderId,int completeNum);
    public  List<CookingTable> findNotServiceOrders();
}
