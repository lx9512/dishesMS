package com.dishesMS.dao;

import com.dishesMS.model.Dishes;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by aa123 on 2018/2/25.
 */
@Repository
public interface IDishesDAO {
    public void insertDishes(Dishes dishes);
    public List<Dishes> selectAllDishes();
    public Dishes selectDishesById(int id);
    public Dishes selectDishesByName(String name);
    public void deleteDishes(int id);
}
