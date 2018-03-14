package com.dishesMS.controller;

import com.dishesMS.model.Dishes;
import com.dishesMS.model.DishesVariety;
import com.dishesMS.service.IDishesService;
import com.dishesMS.service.IDishesVarietyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by aa123 on 2018/2/26.
 */
@Controller
@RequestMapping("dishes")
public class DishesController {

    @Resource
    private IDishesService dishesService;

    @Resource
    private IDishesVarietyService dishesVarietyService;

    @RequestMapping("jumpAdd")
    public ModelAndView jumpAdd()
    {
        ModelAndView modelAndView = new ModelAndView();
        List<DishesVariety> list = dishesVarietyService.findAllDishesVariety();
        modelAndView.addObject("varietyList",list);
        modelAndView.setViewName("/system/dishesMng/addDishes");
        return modelAndView;
    }
    @RequestMapping("add")
    public void addDishes(Dishes dishes ,int varietyId)
    {
        dishes.setDishesVariety(new DishesVariety(varietyId));
        dishesService.saveDishes(dishes);
    }
    @RequestMapping("getALL")
    public void getAllDishes()
    {
        List<Dishes> list = dishesService.findAllDishes();
    }
}
