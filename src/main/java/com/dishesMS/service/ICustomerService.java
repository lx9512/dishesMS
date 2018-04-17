package com.dishesMS.service;

import com.dishesMS.model.Customer;


/**
 * Created by yzp on 2018/3/14.
 */
public interface ICustomerService {

    public Customer getCustomerByTokon(String name,String password);

    public Customer getCustomerById(Integer id);

    public int updateById(Customer customer);
}
