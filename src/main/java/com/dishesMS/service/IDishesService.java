package com.dishesMS.service;

import com.dishesMS.model.Dishes;

import java.util.List;

/**
 * Created by aa123 on 2018/2/25.
 */
public interface IDishesService {
    public boolean saveDishes(Dishes dishes);
    public List findAllDishes();
    public Dishes findDishesById(int id);
    public boolean removeDishes(int id);
}
