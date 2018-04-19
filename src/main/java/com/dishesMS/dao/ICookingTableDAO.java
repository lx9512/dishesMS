package com.dishesMS.dao;

import com.dishesMS.model.CookingTable;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by aa123 on 2018/4/18.
 */
@Repository
public interface ICookingTableDAO {
    public void insertCookingTable(CookingTable cookingTable);
    public void updateCookingNum(CookingTable cookingTable);
    public List<CookingTable> selectCookingTable();
    public CookingTable selectCookingTableByOrderInfoId(int orderInfoId);
    public List<CookingTable> selectNotServiceOrders();
    public void updateNotServiceNum(CookingTable cookingTable);
}
