package com.dishesMS.service.imp;

import com.dishesMS.common.CookingPanel;
import com.dishesMS.dao.IOrderDao;
import com.dishesMS.model.Order;
import com.dishesMS.service.ICookingPanelService;
import com.dishesMS.service.IServicePanelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by aa123 on 2018/4/17.
 */
@Service

public class CookingPanelServiceImp implements ICookingPanelService {
    private CookingPanel cookingPanel = CookingPanel.getCookingPanel();
    @Resource
    IOrderDao orderDao;
    @Resource
    IServicePanelService servicePanelService;

    /**
     * @param orderId
     * 将订单菜品加入到菜品烹饪列表
     */
    public void pushOrderToCookingPanel(int orderId) {
        Order order = orderDao.selectByPrimaryKey(orderId);
        cookingPanel.pushCookingMumber(order);
    }

    /**
     * @param orderId
     * 在数据库中对已烹饪完成的菜品更新状态，并将菜品加入服务列表
     * @return
     */
    public Order popOrderFromCookingPanel(int orderId) {
        Order order;
        if(null != (order = cookingPanel.popCookingMumber(orderId))){
            orderDao.updateCompleteStatus(order.getNumber(),order.getId());
            servicePanelService.pushOrderToServicePanel(order);
            return order;
        }
        return null;
    }

    public boolean findOrderFromCookingPanel(int orderId) {

        return cookingPanel.findOrderFromCookingList(orderId);
    }

    /**
     *获取烹饪列表
     *  @return
     */
    public List<Order> findALLOrderFromCookingPanel() {
        return cookingPanel.getCookingList();
    }
}
