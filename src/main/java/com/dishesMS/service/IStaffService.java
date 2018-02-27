package com.dishesMS.service;

import com.dishesMS.model.Staff;

import java.util.List;

/**
 * Created by aa123 on 2018/2/24.
 */
public interface IStaffService {
    public void saveStaff(Staff staff);
    public List<Staff> findAllStaff();
}
