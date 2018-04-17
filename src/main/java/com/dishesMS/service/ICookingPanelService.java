package com.dishesMS.service;

import com.dishesMS.model.Order;

import java.util.List;

/**
 * Created by aa123 on 2018/4/16.
 */
public interface ICookingPanelService {
    public void pushOrderToCookingPanel(int orderId);
    public Order popOrderFromCookingPanel(int orderId);
    public boolean findOrderFromCookingPanel(int orderId);
    public List<Order> findALLOrderFromCookingPanel();
}
