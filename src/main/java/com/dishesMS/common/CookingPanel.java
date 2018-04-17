package com.dishesMS.common;

import com.dishesMS.model.Order;

import java.util.List;

/**
 * Created by aa123 on 2018/4/16.
 */
public class CookingPanel {
    private static final CookingPanel COOKING_PANEL = new CookingPanel();
    private List<Order> cookingList;
    private CookingPanel(){
        super();
    }
    public static CookingPanel getCookingPanel()
    {
        return COOKING_PANEL;
    }

    public List<Order> getCookingList() {
        return cookingList;
    }

    public void setCookingList(List<Order> cookingList) {
        this.cookingList = cookingList;
    }

    public void pushCookingMumber(Order order)
    {
        cookingList.add(order);
    }

    public Order popCookingMumber(int orderId)
    {
        for (Order order : cookingList)
        {
            if (order.getId() == orderId)
            {
                cookingList.remove(order);
                return order;
            }
        }
        return null;
    }

    public boolean findOrderFromCookingList(int orderId)
    {
        for (Order order : cookingList)
        {
            if (order.getId() == orderId)
            {
                return true;
            }
        }
        return false;
    }
}
