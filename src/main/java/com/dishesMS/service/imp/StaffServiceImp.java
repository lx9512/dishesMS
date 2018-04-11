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

    public boolean saveStaff(Staff staff)
    {
        // 对新增的用户进行验证是否存在，依据为身份证号码及员工号
        Staff staffDB = staffDAO.selectStaffByAccountOrIdCard(staff.getAccount(),staff.getIdCard());
        if(null == staffDB)
        {
            staffDAO.insertStaff(staff);
            return true;
        }else{
            return false;
        }
    }

    public List<Staff> findAllStaff() {
        return staffDAO.selectAll();
    }

    public Staff findStaffByAccount(String account) {
        return staffDAO.selectStaffByAccount(account);
    }

    public Staff findStaffById(int id) {
        return staffDAO.selectStaffById(id);
    }

    public boolean reviseStaff(Staff staff) {
        try {
            staffDAO.updateStaff(staff);
        }catch (Exception e){
            System.out.println("staff update error" + e.getMessage());
            return false;
        }
        return true;
    }

    public boolean removeStaff(int id) {
        try {
            staffDAO.deleteStaff(id);
        }catch (Exception e){
            System.out.println("staff delete error" + e.getMessage());
            return false;
        }
        return true;
    }

}
