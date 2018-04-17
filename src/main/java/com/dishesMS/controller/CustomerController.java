package com.dishesMS.controller;

import com.dishesMS.model.Customer;
import com.dishesMS.model.Dishes;
import com.dishesMS.service.ICustomerService;
import com.dishesMS.service.IDishesService;
import com.dishesMS.service.IOrderMainService;
import com.dishesMS.service.IOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by yzp on 2018/4/16.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Resource
    private IDishesService dishesService;
    @Resource
    private ICustomerService customerService;
    @Resource
    private IOrderService orderService;
    @Resource
    private IOrderMainService orderMainService;

    @RequestMapping("/register")
    public String doCustomer(){
        return "redirect:/customerJump/login";
    }

    @RequestMapping("/login")
    public String doLogin(@RequestParam String accountName, @RequestParam String accountPwd,HttpServletResponse response) {
        Customer customerController = customerService.getCustomerByTokon(accountName, accountPwd);

        if (customerController != null) {

            Cookie cookie = new Cookie("id", customerController.getId().toString());

            cookie.setMaxAge(30 * 60);// 设置存在时间为5分钟
            cookie.setPath("/");//设置作用域
            response.addCookie(cookie);//将cookie添加到response的cookie数组中返回给客户端
            return "moban/index";
        }
        return "moban/login";
    }
    /**
     * 搜索使用
     * @return
     */
    @RequestMapping("/searchDishes")
    public ModelAndView searchDishes(@RequestParam String searchKey){
        ModelAndView modelAndView = new ModelAndView();
        List<Dishes> dishes = dishesService.findBySearchKey(searchKey);
        if(dishes == null){
            modelAndView.setViewName("redirect:/customerJump/viewDishes");
        } else {
            modelAndView.setViewName("moban/productlist");
            modelAndView.addObject("DishesList", dishes);
        }
        return modelAndView;
    }

}
