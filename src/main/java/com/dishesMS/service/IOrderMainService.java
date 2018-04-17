package com.dishesMS.service;

import com.dishesMS.model.OrderMain;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by yzp on 2018/4/3.
 */

public interface IOrderMainService {
    public OrderMain getRunOrderMain(Integer customerId);
    public OrderMain getDetailByCustomerId(Integer customerId);
    public List<OrderMain> getAllOldOrderMain(Integer customerId);
    public List<OrderMain> getAllOrderMain();
    public List<OrderMain> getAllDetailOrderMain();
    public boolean editCheckoutInfo(int orderId, int status, int staffId, Timestamp checkoutDate);
}
