package com.dishesMS.controller;

import com.dishesMS.common.CookingPanel;
import com.dishesMS.model.Dishes;
import com.dishesMS.model.Order;
import com.dishesMS.model.OrderMain;
import com.dishesMS.model.Staff;
import com.dishesMS.service.*;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by yzp on 2018/4/2.
 */
@Controller
@RequestMapping("/Order")
public class OrderController {
    @Resource
    private IDishesService dishesService;
    @Resource
    private ICustomerService customerService;
    @Resource
    private IOrderService orderService;
    @Resource
    private IOrderMainService orderMainService;


    /**
     * 通过前台传参确定返回类型
     * 主要是通过前台参数来确定显示菜品类别（主菜，蔬菜，饮品，甜点）
     *
     * @param describe
     * @return
     */
    @RequestMapping("/getDishesByDescribe/{describe}")
    public ModelAndView getDishesByDescribe(@PathVariable String describe) {
        ModelAndView modelAndView = new ModelAndView();
        List<Dishes> list = dishesService.findAllByDescribe(describe);
        modelAndView.setViewName("moban/productlist");
        modelAndView.addObject("DishesList", list);
        return modelAndView;
    }

    /**
     * 得到所有已点菜单信息
     * 需求判定是否登录（权限）
     * 给用户自己查看账单记录
     */
    public void getAllOrder() {


    }

    /**
     * 添加菜单需求判定：
     * 1.是否登录（权限）
     * 2.是否有桌号（扫座位锁桌，也可以后台进行锁桌【当进行排队时进行此模式】）
     * 3.是否已经创建好总单信息
     * 4.是否是点订单已存在（主要是让最后的账单页面看上去简洁）
     * 1-否-跳转登录页面 1-是-判定二
     * 2-否-打开扫码锁桌（创建总账单信息） 2-是-判定三
     * 3-否-创建总单信息页面（重定向至扫码锁桌） 2-是-获得总单号，创建order的信息
     * 4-否-直接添加进账单 3-是-进行更新份数加一
     *
     * @param dishesId 点单菜品
     */
    @RequestMapping("/addOrder/{dishesId}")
    public ModelAndView addOrder(@PathVariable Integer dishesId) {
        ModelAndView modelAndView = new ModelAndView();
        //判定一

        //判定二

        //判定三
        OrderMain orderMain = orderMainService.getRunOrderMain(19903);

        //判定四添加或是更新
        Order order = orderService.getOrderByDishesAndOrderId(dishesId, orderMain.getId());
        if (order == null) {
            order = new Order();
            order.setNumber(1);
            order.setOrderId(orderMain.getId());
            order.setDishesinfoId(dishesId);
            order.setUntreateStatus(1);
            order.setCompleteStatus(0);
            orderService.insertOrder(order);
        } else {
            order.setNumber(order.getNumber() + 1);
            order.setUntreateStatus(order.getUntreateStatus() + 1);
            orderService.updateOrder(order);
        }
        modelAndView.setViewName("redirect:/customerJump/viewDishes");
        return modelAndView;

    }

    /**
     * 菜单份数的增删
     *
     * @param orderId
     * @return
     */
    @RequestMapping("/addNumber/{orderId}")
    public String addNumber(@PathVariable Integer orderId) {
        OrderMain orderMain = orderMainService.getRunOrderMain(19903);
        Order order = orderService.getOrderByIdDAndOrderId(orderMain.getId(), orderId);
        order.setNumber(order.getNumber()+1);
        order.setUntreateStatus(order.getUntreateStatus()+1);
        orderService.updateOrder(order);
        return "redirect:/customerJump/viewOrder";
    }

    @RequestMapping("/subNumber/{orderId}")
    public String subNumber(@PathVariable Integer orderId) {
        OrderMain orderMain = orderMainService.getRunOrderMain(19903);
        Order order = orderService.getOrderByIdDAndOrderId(orderMain.getId(), orderId);
        if (order.getUntreateStatus() > 0) {
            order.setNumber(order.getNumber() - 1);
            order.setUntreateStatus(order.getUntreateStatus() - 1);
            orderService.updateOrder(order);
        }
        return "redirect:/customerJump/viewOrder";
    }

    /**
     * 删除菜单判定（已上的菜的部分不可以取消）
     * 1.是否为不可删除订单（避免直接传参修改）
     * 1-否-返回到原来界面，不做任何操作  2-是-删除后返回记录日志
     */
    @RequestMapping("/deleteOrder/{orderId}")
    public String deleteOrder(@PathVariable Integer orderId) {
        OrderMain orderMain = orderMainService.getRunOrderMain(19903);
        Order order = orderService.getOrderByIdDAndOrderId(orderMain.getId(), orderId);
        if(order.getCompleteStatus()==0){
            orderService.deleteOrderById(order.getId());
        } else{
            order.setNumber(order.getNumber()-order.getUntreateStatus());
            order.setUntreateStatus(0);
            orderService.updateOrder(order);
        }
        return "redirect:/customerJump/viewOrder";
    }

    /**
     * @return
     * 跳转至订单页面
     */
    @RequestMapping("/jumpOrder")
    public ModelAndView jumpOrderPage()
    {
        ModelAndView modelAndView = new ModelAndView();
        List<OrderMain> orderMainList = orderMainService.getAllDetailOrderMain();
        modelAndView.addObject("orderMainList",orderMainList);
        modelAndView.setViewName("/system/orderMng/orderPage");
        return modelAndView;
    }

    /**
     * @param orderId
     * @return
     *  结账功能
     */
    @RequestMapping("checkout")
    public String checkout(int orderId)
    {
        /*
        获取当前登录员工信息
         */
        Staff staffUser =  (Staff) SecurityUtils.getSubject().getPrincipal();
//        System.out.println(staffUser.getAccount());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        Date date = new Date();
        try{
            date = simpleDateFormat.parse(simpleDateFormat.format(date));
        }catch (ParseException e) {
            System.out.println("结账日期格式转换出错！");
            e.printStackTrace();
        }
        /*
        更新结账信息记录,订单id,订单状态,员工id,结账日期
         */
        Timestamp checkoutDate = new Timestamp(date.getTime());
        if( orderMainService.editCheckoutInfo(orderId,2,staffUser.getId(),checkoutDate) )
            return "redirect:/Order/jumpOrderPage";
        else
            return "error";
    }

}
