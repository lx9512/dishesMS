package com.dishesMS.model;

import java.util.List;

/**
 * Created by aa123 on 2018/2/25.
 */
public class DishesVariety {
    private int id;
    private String name;
    private String describe;


    public DishesVariety()
    {
        super();
    }
    public DishesVariety(int id)
    {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

}
