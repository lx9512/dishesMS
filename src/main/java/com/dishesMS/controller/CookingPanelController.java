package com.dishesMS.controller;

import com.dishesMS.model.Order;
import com.dishesMS.service.ICookingPanelService;
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
public class CookingPanelController {
    @Resource
    private ICookingPanelService cookingPanelService;
    @Resource
    private IOrderService orderService;

    @RequestMapping("jumpCookList")
    public ModelAndView jumpCookListPage()
    {
        ModelAndView modelAndView = new ModelAndView();
        List<Order> noCookList = orderService.getIncompleteOrders();
        modelAndView.addObject("cookList",noCookList);
        modelAndView.setViewName("/system/orderMng/cookListPage");
        return modelAndView;
    }

    @RequestMapping("addOrder")
    public String addCookingList(int id)
    {
        cookingPanelService.pushOrderToCookingPanel(id);
        return null;
    }

    @RequestMapping("getCookingPanel")
    public ModelAndView getCookingPanle()
    {
        ModelAndView modelAndView = new ModelAndView();
        List<Order> cookingPanelOrders = cookingPanelService.findALLOrderFromCookingPanel();
        modelAndView.addObject("cookingOrders",cookingPanelOrders);
        modelAndView.setViewName(""); ///////
        return modelAndView;
    }
}
