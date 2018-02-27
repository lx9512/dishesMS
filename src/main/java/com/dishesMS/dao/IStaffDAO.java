package com.dishesMS.dao;

import com.dishesMS.model.Staff;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by aa123 on 2018/2/24.
 */

@Repository("staffDAO")
public interface IStaffDAO {

    public int insertStaff(Staff staff);
    public List<Staff> selectAll();
}
