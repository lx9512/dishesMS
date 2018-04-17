package com.dishesMS.service;

import com.dishesMS.model.Staff;

import java.util.List;

/**
 * Created by aa123 on 2018/2/24.
 */
public interface IStaffService {
    public boolean saveStaff(Staff staff);
    public List<Staff> findAllStaff();
    public Staff findStaffByAccount(String account);
    public Staff findStaffById(int id);
    public boolean reviseStaff(Staff staff);
    public boolean removeStaff(int id);
    public boolean reviseStaffPassword(String account,String password);
    public boolean reviseStaffByAccount(Staff staff);
}
