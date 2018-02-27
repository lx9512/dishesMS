package com.dishesMS.service;

import com.dishesMS.model.DishesVariety;

import java.util.List;

/**
 * Created by aa123 on 2018/2/25.
 */
public interface IDishesVarietyService {
    public void saveDishesVariety(DishesVariety dishesVariety);
    public List<DishesVariety> findAllDishesVariety();
}
