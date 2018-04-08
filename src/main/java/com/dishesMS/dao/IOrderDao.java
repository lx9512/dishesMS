package com.dishesMS.dao;

import com.dishesMS.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderDao {

    Order selectOrderByDishesIdAndOrderMainID(Integer dishesinfoId,Integer orderId);

    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}