package com.dishesMS.service.imp;

import com.dishesMS.dao.ICustomerDAO;
import com.dishesMS.model.Customer;
import com.dishesMS.service.ICustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yzp on 2018/3/14.
 */
@Service
public class CustomerImp implements ICustomerService {

    @Resource
    private ICustomerDAO ICustomerDAO;

    public Customer getCustomerById(Integer id) {
        return ICustomerDAO.selectByPrimaryKey(id);
    }

    public int updateById(Customer customer) {
        return ICustomerDAO.updateByPrimaryKey(customer);
    }
}
