package com.dishesMS.controller;

import com.dishesMS.model.Customer;
import com.dishesMS.model.Dishes;
import com.dishesMS.service.ICustomerService;
import com.dishesMS.service.IDishesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yzp on 2018/3/12.
 */
@Controller
@RequestMapping("/customerJump")
public class CustomerJumpController {
    @Resource
    private IDishesService dishesService;
    @Resource
    private ICustomerService customerService;


    @RequestMapping("/selfMsg")
    public ModelAndView jumpSelfMsg(){
        ModelAndView modelAndView = new ModelAndView();
        Customer customer = customerService.getCustomerById(19903);
        modelAndView.setViewName("customer/selfCenter/selfMsg");
        modelAndView.addObject("customer",customer);
        return modelAndView;
    }

    @RequestMapping("/checkMsg")
    public ModelAndView jumpCheckMsg(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/selfCenter/checkMsg");
        return modelAndView;
    }
    @RequestMapping("/checkPwd")
    public ModelAndView jumpCheckPwd(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/selfCenter/resetPwd");
        return modelAndView;
    }
    @RequestMapping("/viewSpend")
    public ModelAndView jumpViewSpeng(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/selfCenter/getSpendRecord");
        return modelAndView;
    }
    @RequestMapping("/viewDishes")
    public ModelAndView jumpViewDishes(){
        ModelAndView modelAndView = new ModelAndView();
        List<Dishes> dishes = dishesService.findAllDishes();
        modelAndView.setViewName("customer/orderDishes/reviewDishes");
        modelAndView.addObject("DishesList",dishes);
        return modelAndView;
    }
    @RequestMapping("/viewOrder")
    public ModelAndView jumpViewOrder(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/orderDishes/spendMoney");
        return modelAndView;
    }
    @RequestMapping("/viewLike")
    public ModelAndView jumpViewLike(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/selfCenter/selfLike");
        return modelAndView;
    }
    @RequestMapping("/homepage")
    public String jumpNoMsg(){
        return "customer/noMessage";
    }

}


