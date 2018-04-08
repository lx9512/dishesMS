package com.dishesMS.controller;

import com.dishesMS.model.Dishes;
import com.dishesMS.model.DishesVariety;
import com.dishesMS.service.IDishesService;
import com.dishesMS.service.IDishesVarietyService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by aa123 on 2018/2/26.
 */
@Controller
@RequestMapping("dishes")
@Scope("prototype")
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
    public String addDishes(Dishes dishes ,int varietyId)
    {
        dishes.setDishesVariety(new DishesVariety(varietyId));
        if(dishesService.saveDishes(dishes))
            return "success";
        return "error";
    }
    @RequestMapping("jumpDishes")
    public ModelAndView jumpDishesPage()
    {
        ModelAndView modelAndView = new ModelAndView();
        List<Dishes> dishesList = dishesService.findAllDishes();
        modelAndView.addObject("dishesList",dishesList);
        modelAndView.setViewName("/system/dishesMng/dishesPage");
        return modelAndView;
    }
    @RequestMapping("jumpEdit")
    public ModelAndView jumpEdit(int id){
        ModelAndView modelAndView = new ModelAndView();
        Dishes dishes = dishesService.findDishesById(id);
        modelAndView.addObject("dishes",dishes);
        modelAndView.setViewName("/system/dishesMng/editDishes");
        return modelAndView;
    }
    @RequestMapping("getALL")
    public void getAllDishes() {
        List<Dishes> list = dishesService.findAllDishes();
    }

    @RequestMapping(value="upImage",method = RequestMethod.POST,produces = {"text/html;charset=UTF-8","application/json;"})
    @ResponseBody
    public String upImage(HttpServletRequest request, @RequestParam("file")
                        MultipartFile file)
    {
        String path  = "D:\\JavaWebObject\\dishesMS\\src\\main\\webapp\\resource\\images\\dishes";//= request.getServletContext().getRealPath("/images/dishes");
        System.out.println(path);
        if(!file.isEmpty())
        {
            String filename = file.getOriginalFilename();
            System.out.println(filename);
            File filepath = new File(path,filename);
            if(!filepath.getParentFile().exists())
            {
                filepath.getParentFile().mkdirs();
            }
            try {
                file.transferTo(new File(path + File.separator + filename));
            }catch(IOException ioe){
                System.out.println("图片保存失败"+ioe.getMessage());

            }
            //System.out.println(filepath.toString());
            return "../images/dishes/"+filename;
        }else
            return "error";
    }
    @RequestMapping("drop")
    public String dropDishes(int id)
    {
        if(dishesService.removeDishes(id))
            return "success";
        return "error";
    }
}
