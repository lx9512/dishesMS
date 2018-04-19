package com.dishesMS.service;

import com.dishesMS.model.ServiceTable;

import java.util.List;

/**
 * Created by aa123 on 2018/4/18.
 */
public interface IServiceTableService {
    public void saveResponseOrder(int orderId,int serviceNum);
    public List<ServiceTable> findServiceOrdersByStaffId(int staffId);
}
