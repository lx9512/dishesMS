package com.dishesMS.service;

import com.dishesMS.model.Table;

import java.util.List;

/**
 * Created by aa123 on 2018/3/28.
 */
public interface ITableService {
    public Table findTableByAN(Table table);
    public boolean addTable(Table table);
    public List<Table> findAllTable();
    public Table findTableById(int id);
    public boolean reviseTable(Table table);
    public boolean removeTable(int id);
}
