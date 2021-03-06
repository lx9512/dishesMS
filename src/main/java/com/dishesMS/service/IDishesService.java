package com.dishesMS.service;

import com.dishesMS.model.Dishes;
import com.dishesMS.model.Order;

import java.util.List;

/**
 * Created by aa123 on 2018/2/25.
 */
public interface IDishesService {
//    public void saveDishes(Dishes dishes);
    public List<Dishes> findAllDishes();
    public List<Dishes> findAllByDescribe(String describe);
    public boolean saveDishes(Dishes dishes);
//    public List findAllDishes();
    public Dishes findDishesById(int id);
    public boolean removeDishes(int id);
    public boolean reviseDishes(Dishes dishes);
    public List<Dishes> findBySearchKey(String searchKey);
}
