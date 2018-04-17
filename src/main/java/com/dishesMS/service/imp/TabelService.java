package com.dishesMS.service.imp;

import com.dishesMS.dao.ITableDAO;
import com.dishesMS.model.Table;
import com.dishesMS.service.ITableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by aa123 on 2018/3/28.
 */
@Service
public class TabelService implements ITableService {
    @Resource
    private ITableDAO tableDAO;
    public Table findTableByAN(Table table) {
        return tableDAO.selectTableByAN(table.getAreaName(),table.getNumber());
    }

    public boolean addTable(Table table) {
        try{
            tableDAO.insertTable(table);
        }catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public List<Table> findAllTable() {
        return tableDAO.selectTable();
    }

    public Table findTableById(int id) {
        return tableDAO.selectTableById(id);
    }

    public boolean reviseTable(Table table) {
        try{
            tableDAO.updateTable(table);
        }catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean removeTable(int id) {
        try{
            tableDAO.deleteTable(id);
        }catch (Exception e)
        {
            System.out.println("error for remove table");
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
