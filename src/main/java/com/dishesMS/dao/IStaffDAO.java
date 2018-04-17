package com.dishesMS.dao;

import com.dishesMS.model.Staff;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by aa123 on 2018/2/24.
 */

@Repository("staffDAO")
public interface IStaffDAO {

    public int insertStaff(Staff staff);
    public List<Staff> selectAll();
    public Staff selectStaffByAccount(String account);
    public Staff selectStaffByAccountOrIdCard(@Param("account") String account, @Param("idCard")String idCard);
    public Staff selectStaffById(int id);
    public void updateStaff(Staff staff);
    public void deleteStaff(int id);
    public void updateStaffPassword(@Param("account") String account,@Param("password") String password);
    public void updateStaffByAccount(Staff staff);
}
