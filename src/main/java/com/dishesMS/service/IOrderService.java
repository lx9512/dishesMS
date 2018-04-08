package com.dishesMS.service;

import com.dishesMS.model.Order;
import org.springframework.stereotype.Service;

/**
 * Created by yzp on 2018/4/3.
 */

public interface IOrderService {
    public Order getOrderByDishesAndOrderId(Integer dishesinfoID,Integer orderId);
    public int insertOrder(Order order);
    public int updateOrder(Order order);
}
