package com.dishesMS.controller;

import com.dishesMS.model.DishesVariety;
import com.dishesMS.service.IDishesVarietyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by aa123 on 2018/2/26.
 */
@Controller
@RequestMapping("dishesVariety")
public class DishesVarietyController {
    @Resource
    private IDishesVarietyService dishesVarietyService;

    @RequestMapping("add")
    public void addDishesVariety(DishesVariety dishesVariety)
    {
        dishesVarietyService.saveDishesVariety(dishesVariety);
    }
}
