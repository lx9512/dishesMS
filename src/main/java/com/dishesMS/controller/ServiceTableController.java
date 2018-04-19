package com.dishesMS.controller;

import com.dishesMS.common.LoginUtil;
import com.dishesMS.model.CookingTable;
import com.dishesMS.model.ServiceTable;
import com.dishesMS.model.Staff;
import com.dishesMS.service.ICookingTableService;
import com.dishesMS.service.IServiceTableService;
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
public class ServiceTableController {
    @Resource
    IServiceTableService serviceTableService;
    @Resource
    ICookingTableService cookingTableService;

    @RequestMapping("getNotServiceOrders")
    public ModelAndView getServicePanel()
    {
        ModelAndView modelAndView = new ModelAndView();
        List<CookingTable> notServiceOrders = cookingTableService.findNotServiceOrders();
        modelAndView.addObject("serviceOrders",notServiceOrders);
        modelAndView.setViewName("/system/servicePanel/servicePanelPage");   ////
        return modelAndView;
    }


    @RequestMapping("addServiceOrder")
    public String addServiceOrder(int orderId,int serviceNum)
    {
//        servicePanelService.popOrderFromServicePanel(orderId);
        serviceTableService.saveResponseOrder(orderId,serviceNum);
        return null;
    }

    @RequestMapping("getServiceOrders")
    public ModelAndView getServiceOrders()
    {
        ModelAndView modelAndView = new ModelAndView();
        Staff staff = LoginUtil.getLoginStaff();
        List<ServiceTable> responseOrders = serviceTableService.findServiceOrdersByStaffId(staff.getId());
        modelAndView.addObject("responseOrders",responseOrders);
        modelAndView.setViewName("");   /////
        return modelAndView;
    }
}
