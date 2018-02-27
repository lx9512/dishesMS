package com.dishesMS.service.imp;

import com.dishesMS.dao.IStaffDAO;
import com.dishesMS.model.Staff;
import com.dishesMS.service.IStaffService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by aa123 on 2018/2/24.
 */
@Service("staffService")
public class StaffServiceImp implements IStaffService{

    @Resource
    private IStaffDAO staffDAO;

    public void saveStaff(Staff staff)
    {
        staffDAO.insertStaff(staff);
    }

    public List<Staff> findAllStaff() {
        return staffDAO.selectAll();
    }
}
