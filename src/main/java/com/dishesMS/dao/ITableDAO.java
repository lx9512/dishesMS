package com.dishesMS.dao;

import com.dishesMS.model.Table;
import javafx.scene.control.Tab;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by aa123 on 2018/3/28.
 */
@Repository
public interface ITableDAO {
    public Table selectTableByAN(@Param("areaName")String areaName,@Param("number")String number);
    public void insertTable(Table table);
    public List<Table> selectTable();
    public Table selectTableById(int id);
    public void updateTable(Table table);
    public void deleteTable(int id);
}
