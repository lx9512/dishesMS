package com.dishesMS.dao;

import com.dishesMS.model.OrderMain;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IOrderMainDao {

    OrderMain selectByCustomerId(Integer customerId);

    OrderMain selectDetailOrderByCustomerId(Integer customerId);

    List<OrderMain> selectAllOldByCustomerId(Integer customerId);

    List<OrderMain> selectAllOrder();

    int deleteByPrimaryKey(Integer id);

    int insert(OrderMain record);

    int insertSelective(OrderMain record);

    OrderMain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderMain record);

    int updateByPrimaryKey(OrderMain record);
}