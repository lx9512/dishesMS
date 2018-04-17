package com.dishesMS.service;

import com.dishesMS.model.Order;
import com.dishesMS.model.ServiceTable;

import java.util.List;

/**
 * Created by aa123 on 2018/4/16.
 */
public interface IServicePanelService {
    public void pushOrderToServicePanel(Order order);
    public Order popOrderFromServicePanel(int orderId);
    public List<Order> findAllOrderFromServicePanel();
    public List<ServiceTable> findServiceTableByStaffId(int staffId);
}
