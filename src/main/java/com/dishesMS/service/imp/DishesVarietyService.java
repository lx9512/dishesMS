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
public class DishesVarietyService implements IDishesVarietyService {
    @Resource
    private IDishesVarietyDAO dishesVarietyDAO;

    public void saveDishesVariety(DishesVariety dishesVariety){
        dishesVarietyDAO.insertDishesVariety(dishesVariety);
    }

    public List<DishesVariety> findAllDishesVariety() {
        return dishesVarietyDAO.selectAllDishesVariety();
    }
}
