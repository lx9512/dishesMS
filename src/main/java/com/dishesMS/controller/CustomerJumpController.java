package com.dishesMS.controller;

import com.dishesMS.dao.IOrderDao;
import com.dishesMS.dao.ITableDAO;
import com.dishesMS.model.*;
import com.dishesMS.service.*;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
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
    @Resource
    private IOrderService orderService;
    @Resource
    private IOrderMainService orderMainService;
    @Resource
    private ITableService tableService;

    @RequestMapping("/getTop")
    public String getTop() {
        return "customer/top";
    }

    /**
     * 这里为测试数据得到ID为19903的用户
     * 返回到个人信息页面
     *
     * @return
     */
    @RequestMapping("/selfMsg")
    public ModelAndView jumpSelfMsg(@CookieValue String id) {
        ModelAndView modelAndView = new ModelAndView();
        Customer customer = customerService.getCustomerById(Integer.valueOf(id));
        modelAndView.setViewName("customer/selfCenter/selfMsg");
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    /**
     * 修改个人信息
     *
     * @return
     */
    @RequestMapping("/checkMsg")
    public ModelAndView jumpCheckMsg() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/selfCenter/checkMsg");
        return modelAndView;
    }

    /**
     * 重置密码
     *
     * @return
     */
    @RequestMapping("/checkPwd")
    public ModelAndView jumpCheckPwd() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/selfCenter/resetPwd");
        return modelAndView;
    }

    /**
     * 查看已点菜单 得到消费金额 并显示已点内容 获得结账按钮
     *
     * @return
     */
    @RequestMapping("/viewSpend")
    public ModelAndView jumpViewSpeng() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/selfCenter/getSpendRecord");
        return modelAndView;
    }

    /**
     * 得到菜品的所有类型并返回到查看菜品页面
     *
     * @return
     */
    @RequestMapping("/viewDishes")
    public ModelAndView jumpViewDishes(@CookieValue(required = false) String id) {
        ModelAndView modelAndView = new ModelAndView();
        Integer haveTable = null;
        if (id != null) {
            OrderMain orderMain = orderMainService.getRunOrderMain(Integer.valueOf(id));
            if (orderMain != null)
                haveTable = orderMain.getTableId();
            else {
                List<Table> tables = tableService.findAllTable();
                modelAndView.addObject("Tables", tables);
            }

        }
        List<Dishes> dishes = dishesService.findAllDishes();
        modelAndView.setViewName("moban/productlist");
        modelAndView.addObject("DishesList", dishes);
        modelAndView.addObject("haveTable", haveTable);
        return modelAndView;
    }

    /**
     * 查看自己历史点单记录
     * 判断是否有订单，是否登录
     *
     * @return
     */
    @RequestMapping("/viewOrder")
    public ModelAndView jumpViewOrder(@CookieValue(required = false) String id) {
        ModelAndView modelAndView = new ModelAndView();
        if (id != null) {
            OrderMain orderMain = orderMainService.getRunOrderMain(Integer.valueOf(id));
            List<Order> orders = null;
            if (orderMain != null) {
                orders = orderService.getAllDetailByOrderId(orderMain.getId());
                modelAndView.addObject("orderList", orders);
                modelAndView.setViewName("moban/order");
            } else {
                modelAndView.addObject("orderList", orders);
                modelAndView.setViewName("moban/order");
            }

        } else {
            modelAndView.setViewName("moban/login");

        }
        return modelAndView;
    }

    /**
     * 推荐分析个人喜好
     *
     * @return
     */
    @RequestMapping("/viewLike")
    public ModelAndView jumpViewLike() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer/selfCenter/selfLike");
        return modelAndView;
    }

    /**
     * 主页
     *
     * @return
     */
    @RequestMapping("/homepage")
    public String jumpNoMsg() {
        return "moban/index";
    }

    @RequestMapping("/login")
    public String jumpLogin() {
        return "moban/login";
    }

    @RequestMapping("/register")
    public String jumpRegister() {
        return "/moban/register";
    }

    @RequestMapping("/selfPage")
    public ModelAndView jumpSelfPage(@CookieValue(required = false) String id) {
        ModelAndView modelAndView = new ModelAndView();
        if (id != null) {
            modelAndView.setViewName("/moban/selfPage");
            Customer customer = customerService.getCustomerById(Integer.valueOf(id));
            modelAndView.addObject("Customer",customer);
        //    modelAndView.addObject("only","readonly");
        } else
            modelAndView.setViewName("/moban/login");
        return modelAndView;
    }

    @RequestMapping("/contact")
    public String jumpContact() {
        return "/moban/contact";
    }

}


