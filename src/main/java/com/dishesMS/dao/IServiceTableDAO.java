package com.dishesMS.dao;

import com.dishesMS.model.ServiceTable;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by aa123 on 2018/4/17.
 */
@Repository
public interface IServiceTableDAO {
    public void insertServiceTable(ServiceTable serviceTable);
    public List<ServiceTable> selectServiceTableByStaffId(int staffId);
}
