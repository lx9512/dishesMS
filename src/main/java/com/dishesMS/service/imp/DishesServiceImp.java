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

    public void saveDishes(Dishes dishes){
        dishesDAO.insertDishes(dishes);
    }

    public List<Dishes> findAllDishes() {
        return dishesDAO.selectAllDishes();
    }
}
