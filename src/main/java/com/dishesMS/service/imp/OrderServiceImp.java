package com.dishesMS.service.imp;

import com.dishesMS.dao.IOrderDao;
import com.dishesMS.model.Order;
import com.dishesMS.service.IOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yzp on 2018/4/3.
 */
@Service
public class OrderServiceImp implements IOrderService {

    @Resource
    private IOrderDao iOrderDao;

    public Order getOrderByDishesAndOrderId(Integer dishesinfoID, Integer orderId) {
        return iOrderDao.selectOrderByDishesIdAndOrderMainID(dishesinfoID,orderId);
    }

    public Order getOrderByIdDAndOrderId(Integer orderId, Integer id) {
        return iOrderDao.selectOrderByOrderIdAndOrderMainId(orderId,id);
    }

    public List<Order> getAllDetailByOrderId(Integer orderId) {
        return iOrderDao.selectAllDetailOrderByOrderId(orderId);
    }

    public List<Order> getAllOrderByOrderId(Integer orderId) {
        return iOrderDao.selectAllOrderByOrderId(orderId);
    }

    public List<Order> getIncompleteOrders() {
        return iOrderDao.selectIncompleteOrders();
    }

    /**
     * 添加一个订单
     * @param order
     * @return
     */
    public int insertOrder(Order order) {
        return this.iOrderDao.insert(order);
    }

    /**
     *更新订单
     * @param order
     * @return
     */
    public int updateOrder(Order order) {
        return this.iOrderDao.updateByPrimaryKeySelective(order);
    }

    public int deleteOrderById(Integer id) {
        return iOrderDao.deleteByPrimaryKey(id);
    }

}
