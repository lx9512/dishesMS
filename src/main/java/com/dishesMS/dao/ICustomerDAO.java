package com.dishesMS.dao;

import com.dishesMS.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    Customer selectCustomerByNameAndPwd(String name,String password);

    List<Customer> selectAllCustomer();

}