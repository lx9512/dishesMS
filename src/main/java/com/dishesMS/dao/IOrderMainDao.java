package com.dishesMS.dao;

import com.dishesMS.model.OrderMain;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;
@Repository
public interface IOrderMainDao {

    OrderMain selectByCustomerId(Integer customerId);

    OrderMain selectDetailOrderByCustomerId(Integer customerId);

    List<OrderMain> selectAllOldByCustomerId(Integer customerId);

    List<OrderMain> selectAllOrder();

    public List<OrderMain> selectAllDetailOrderMain();

//    public List<OrderMain> selectCookOrders();

    public void updateCheckoutInfo(@Param("orderId") int orderId, @Param("status") int status, @Param("staffId") int staffId, @Param("checkoutDate")Timestamp checkoutDate);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderMain record);

    int insertSelective(OrderMain record);

    OrderMain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderMain record);

    int updateByPrimaryKey(OrderMain record);
}