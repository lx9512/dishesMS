package com.dishesMS.service;

import com.dishesMS.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yzp on 2018/4/3.
 */

public interface IOrderService {
    public Order getOrderByDishesAndOrderId(Integer dishesinfoID,Integer orderId);
    public Order getOrderByIdDAndOrderId(Integer orderId,Integer id);
    public List<Order> getAllDetailByOrderId(Integer orderId);
    public List<Order>  getAllOrderByOrderId(Integer orderId);
    public List<Order> findIncompleteOrders();
    public int insertOrder(Order order);
    public int updateOrder(Order order);
    public int deleteOrderById(Integer id);
}
