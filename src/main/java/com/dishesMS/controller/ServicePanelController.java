package com.dishesMS.controller;

import com.dishesMS.model.Order;
import com.dishesMS.model.ServiceTable;
import com.dishesMS.model.Staff;
import com.dishesMS.service.IServicePanelService;
import org.apache.shiro.SecurityUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by aa123 on 2018/4/17.
 */
@Scope("prototype")
@Controller
@RequestMapping("servicePanel")
public class ServicePanelController {
    @Resource
    IServicePanelService servicePanelService;

    @RequestMapping("getServicePanel")
    public ModelAndView getServicePanel()
    {
        ModelAndView modelAndView = new ModelAndView();
        List<Order> servicePanelOrders = servicePanelService.findAllOrderFromServicePanel();
        modelAndView.addObject("serviceOrders",servicePanelOrders);
        modelAndView.setViewName("/system/servicePanel/servicePanelPage");   ////
        return modelAndView;
    }
    @RequestMapping("responseOrderService")
    public String responseOrderService(int orderId)
    {
        servicePanelService.popOrderFromServicePanel(orderId);
        return null;
    }

    @RequestMapping("getResponseOrders")
    public ModelAndView getResponseOrders()
    {
        ModelAndView modelAndView = new ModelAndView();
        Staff staff = (Staff) SecurityUtils.getSubject().getPrincipal();
        List<ServiceTable> responseOrders = servicePanelService.findServiceTableByStaffId(staff.getId());
        modelAndView.addObject("responseOrders",responseOrders);
        modelAndView.setViewName("");   /////
        return modelAndView;
    }
}
