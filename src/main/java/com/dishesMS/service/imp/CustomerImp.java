package com.dishesMS.service.imp;

import com.dishesMS.dao.ICustomerDAO;
import com.dishesMS.model.Customer;
import com.dishesMS.service.ICustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yzp on 2018/3/14.
 */
@Service
public class CustomerImp implements ICustomerService {

    @Resource
    private ICustomerDAO ICustomerDAO;

    public Customer getCustomerByTokon(String name,String password) {
        return ICustomerDAO.selectCustomerByNameAndPwd(name,password);
    }

    public Customer getCustomerById(Integer id) {
        return ICustomerDAO.selectByPrimaryKey(id);
    }

    public int updateById(Customer customer) {
        return ICustomerDAO.updateByPrimaryKey(customer);
    }

    public List<Customer> getAllCustomer() {
        return ICustomerDAO.selectAllCustomer();
    }
}
