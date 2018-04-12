package com.dishesMS.service.imp;

import com.dishesMS.dao.IOrderDao;
import com.dishesMS.model.Order;
import com.dishesMS.service.IOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
}
