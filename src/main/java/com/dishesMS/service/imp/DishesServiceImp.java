package com.dishesMS.service.imp;

import com.dishesMS.dao.IDishesDAO;
import com.dishesMS.model.Dishes;
import com.dishesMS.service.IDishesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by aa123 on 2018/2/26.
 */
@Service
public class DishesServiceImp implements IDishesService {
    @Resource
    private IDishesDAO dishesDAO;

    public boolean saveDishes(Dishes dishes){
        if(dishesDAO.selectDishesByName(dishes.getName()) == null)
        {
            dishesDAO.insertDishes(dishes);
            return true;
        }
        return false;
    }

    public List<Dishes> findAllDishes() {
        return dishesDAO.selectAllDishes();
    }

    public List<Dishes> findAllByDescribe(String describe) {
        return dishesDAO.selectAllByDescribe(describe);
    }

    public Dishes findDishesById(int id) {
        return dishesDAO.selectDishesById(id);
    }

    public boolean removeDishes(int id) {
        try{
            dishesDAO.deleteDishes(id);
            return true;
        }catch (Exception e) {
            System.out.println("delete dishes error " + e.getMessage());
        }
        return false;
    }

    public boolean reviseDishes(Dishes dishes) {
        try {
            dishesDAO.updateDishes(dishes);
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }

    }
}
