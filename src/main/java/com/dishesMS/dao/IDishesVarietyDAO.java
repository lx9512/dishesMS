package com.dishesMS.dao;

import com.dishesMS.model.DishesVariety;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by aa123 on 2018/2/25.
 */

@Repository
public interface IDishesVarietyDAO {
    //public DishesVariety selectDishesVarietyById();
    public void insertDishesVariety(DishesVariety dishesVariety);
    public List<DishesVariety> selectAllDishesVariety();
    public DishesVariety selectDishesVarietyById(int id);
    public DishesVariety selectDishesVarietyByName(String name);
    public void updateDishesVariety(DishesVariety dishesVariety);
    public void deleteDishesVariety(int id);
}
