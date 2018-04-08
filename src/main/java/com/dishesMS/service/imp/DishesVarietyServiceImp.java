package com.dishesMS.service.imp;

import com.dishesMS.dao.IDishesVarietyDAO;
import com.dishesMS.model.DishesVariety;
import com.dishesMS.service.IDishesVarietyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by aa123 on 2018/2/26.
 */
@Service
public class DishesVarietyServiceImp implements IDishesVarietyService {
    @Resource
    private IDishesVarietyDAO dishesVarietyDAO;

    public boolean saveDishesVariety(DishesVariety dishesVariety){
        DishesVariety dishesVariety1 = dishesVarietyDAO.selectDishesVarietyByName(dishesVariety.getName());
        if(null == dishesVariety1)
        {
            dishesVarietyDAO.insertDishesVariety(dishesVariety);
            return true;
        }
        return false;
    }

    public List<DishesVariety> findAllDishesVariety() {
        return dishesVarietyDAO.selectAllDishesVariety();
    }

    public DishesVariety findDishesVarietyById(int id) {
        return dishesVarietyDAO.selectDishesVarietyById(id);
    }

    public boolean reviseDishesVariety(DishesVariety dishesVariety) {
        try{
            dishesVarietyDAO.updateDishesVariety(dishesVariety);
            System.out.println("种类修改成功");
            return true;
        }catch (Exception e)
        {
            System.out.println("菜品种类修改错误"+e.getMessage());
        }
        return false;
    }

    public boolean removeDishesVariety(int id) {
        try{
            dishesVarietyDAO.deleteDishesVariety(id);
            return true;
        }catch (Exception e)
        {
            System.out.println("菜品种类删除失败"+e.getMessage());
        }
        return false;
    }
}
