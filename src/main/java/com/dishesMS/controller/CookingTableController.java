package com.dishesMS.controller;

import com.dishesMS.model.CookingTable;
import com.dishesMS.model.Order;
import com.dishesMS.service.ICookingTableService;
import com.dishesMS.service.IOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by aa123 on 2018/4/17.
 */
@Controller
@RequestMapping("cookingPanel")
public class CookingTableController {
    @Resource
    private ICookingTableService cookingTableService;
    @Resource
    private IOrderService orderService;

    @RequestMapping("jumpCookList")
    public ModelAndView jumpCookListPage()
    {
        ModelAndView modelAndView = new ModelAndView();
        List<Order> notCookingOrders = orderService.findIncompleteOrders();
        modelAndView.addObject("notCookingOrders",notCookingOrders);
        modelAndView.setViewName("system/orderMng/notCookingPage");
        return modelAndView;
    }

    @RequestMapping("addOrder")
    public String addCookingList(int id)
    {
//        cookingPanelService.pushOrderToCookingPanel(id);
        cookingTableService.saveOrder(id);
        return null;
    }

    @RequestMapping("getCookingTable")
    public ModelAndView getCookingTable()
    {
        ModelAndView modelAndView = new ModelAndView();
        List<CookingTable> cookingOrders = cookingTableService.findCookingTable();
        modelAndView.addObject("cookingOrders",cookingOrders);
        modelAndView.setViewName("system/orderMng/cookingPage");
        return modelAndView;
    }

    /**
     * @param orderId
     * @param completeNum
     *更新烹饪完成数量，及请求上菜
     *  @return
     */
    @RequestMapping("requestService")
    public String requestService(int orderId,int completeNum)
    {
        cookingTableService.editOrderCookingNum(orderId,completeNum);
        return "success";
    }
}
