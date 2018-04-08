package com.dishesMS.controller;

import com.dishesMS.model.DishesVariety;
import com.dishesMS.service.IDishesVarietyService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by aa123 on 2018/2/26.
 */
@Controller
@RequestMapping("dishesVariety")
public class DishesVarietyController {
    @Resource
    private IDishesVarietyService dishesVarietyService;

    @RequestMapping("jumpAdd")
    public String jumpAdd()
    {
        return "/system/dishesMng/addDishesVariety";
    }
    @RequestMapping("add")
    public String addDishesVariety(DishesVariety dishesVariety)
    {
        if(dishesVarietyService.saveDishesVariety(dishesVariety))
        {
            return "新建种类成功";
        }
        return "新建种类失败";
    }
    @RequestMapping("jumpDishesVariety")
    public ModelAndView jumpDishesVariety()
    {
        ModelAndView modelAndView = new ModelAndView();
        List<DishesVariety> dishesVarieties = dishesVarietyService.findAllDishesVariety();
        modelAndView.addObject("dishesVarieties",dishesVarieties);
        modelAndView.setViewName("/system/dishesMng/dishesVarietyPage");
        return modelAndView;
    }
    @RequestMapping("jumpEditPage")
    public ModelAndView jumpEditPage(@Param("id")int id)
    {
        ModelAndView modelAndView = new ModelAndView();
        DishesVariety dishesVariety = dishesVarietyService.findDishesVarietyById(id);
        modelAndView.addObject("dishesVariety",dishesVariety);
        modelAndView.setViewName("/system/dishesMng/editDishesVariety"); //////
        return modelAndView;
    }
    @RequestMapping("edit")
    public String editDishesVariety(DishesVariety dishesVariety)
    {
        if(dishesVarietyService.reviseDishesVariety(dishesVariety))
            return "菜品种类修改成功";
        return "菜品种类修改失败";
    }

    @RequestMapping("drop")
    public String dropDishesVariety(@Param("id") int id)
    {
        if(dishesVarietyService.removeDishesVariety(id))
            return "菜品种类删除成功";
        return "菜品种类删除失败";
    }
}
