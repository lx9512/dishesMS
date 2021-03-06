package com.dishesMS.dao;

import com.dishesMS.model.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrderDao {

    //得到单个订单的信息
    Order selectOrderByDishesIdAndOrderMainID(Integer dishesinfoId,Integer orderId);

    Order selectOrderByOrderIdAndOrderMainId(Integer orderId,Integer id);

    List<Order>  selectAllOrderByOrderId(Integer orderId);

    List<Order> selectAllDetailOrderByOrderId(Integer orderId);

    List<Order> selectIncompleteOrders();

    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    int updateCompleteStatus(@Param("completStatus") int completeStatus,@Param("id") int id);
}