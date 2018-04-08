package com.dishesMS.controller;

import com.dishesMS.model.Customer;
import com.dishesMS.model.Dishes;
import com.dishesMS.service.ICustomerService;
import com.dishesMS.service.IDishesService;
import com.sun.org.apache.xpath.internal.operations.Mod;
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

    @RequestMapping("/getTop")
    public String getTop(){
        return "customer/top";
    }

    /**
     * 这里为测试数据得到ID为19903的用户
     * 返回到个人信息页面
     * @return
     */
    @RequestMapping("/selfMsg")
    public ModelAndView jumpSelfMsg(){
        ModelAndView modelAndView = new ModelAndView();
        Customer customer = customerService.getCustomerById(19903);
        modelAndView.setViewName("customer/selfCenter/selfMsg");
        modelAndView.addObject("customer",customer);
        return modelAndView;
    }

    /**
     *修改个人信息
     * @return
     */
    @RequestMapping("/checkMsg")
    public ModelAndView jumpCheckMsg(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/selfCenter/checkMsg");
        return modelAndView;
    }

    /**
     * 重置密码
     * @return
     */
    @RequestMapping("/checkPwd")
    public ModelAndView jumpCheckPwd(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/selfCenter/resetPwd");
        return modelAndView;
    }

    /**
     * 查看已点菜单 得到消费金额 并显示已点内容 获得结账按钮
     * @return
     */
    @RequestMapping("/viewSpend")
    public ModelAndView jumpViewSpeng(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/selfCenter/getSpendRecord");
        return modelAndView;
    }

    /**
     * 得到菜品的所有类型并返回到查看菜品页面
     * @return
     */
    @RequestMapping("/viewDishes")
    public ModelAndView jumpViewDishes(){
        ModelAndView modelAndView = new ModelAndView();
        List<Dishes> dishes = dishesService.findAllDishes();
        modelAndView.setViewName("moban/productlist");
        modelAndView.addObject("DishesList",dishes);
        return modelAndView;
    }

    /**
     *查看自己历史点单记录
     * @return
     */
    @RequestMapping("/viewOrder")
    public ModelAndView jumpViewOrder(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("moban/order");
        return modelAndView;
    }

    /**
     * 推荐分析个人喜好
     * @return
     */
    @RequestMapping("/viewLike")
    public ModelAndView jumpViewLike(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/selfCenter/selfLike");
        return modelAndView;
    }

    /**
     * 主页
     * @return
     */
    @RequestMapping("/homepage")
    public String jumpNoMsg(){
        return "moban/index";
    }

}


