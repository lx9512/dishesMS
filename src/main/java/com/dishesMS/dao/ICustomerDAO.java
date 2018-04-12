package com.dishesMS.dao;

import com.dishesMS.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

}