package com.dishesMS.service.imp;

import com.dishesMS.common.DateFormtUtil;
import com.dishesMS.common.LoginUtil;
import com.dishesMS.dao.ICookingTableDAO;
import com.dishesMS.dao.IServiceTableDAO;
import com.dishesMS.model.CookingTable;
import com.dishesMS.model.ServiceTable;
import com.dishesMS.model.Staff;
import com.dishesMS.service.IServiceTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by aa123 on 2018/4/18.
 */
@Service
public class serviceTableServiceImp implements IServiceTableService {
    @Resource
    ICookingTableDAO cookingTableDAO;
    @Resource
    IServiceTableDAO serviceTableDAO;
    public void saveResponseOrder(int orderId, int serviceNum) {
        CookingTable cookingTable = cookingTableDAO.selectCookingTableByOrderInfoId(orderId);
        cookingTable.setNotServiceNum(cookingTable.getNotServiceNum() - serviceNum);
        cookingTableDAO.updateNotServiceNum(cookingTable);   // 更新未服务菜品份数

        Staff staff = LoginUtil.getLoginStaff();
        ServiceTable serviceTable = new ServiceTable(orderId, DateFormtUtil.dateFormt(new Date()),serviceNum,staff.getId());

        serviceTableDAO.insertServiceTable(serviceTable); //新增服务记录
    }

    /**
     * @param staffId
     * @return
     * 获取当前用户已服务菜品
     */
    public List<ServiceTable> findServiceOrdersByStaffId(int staffId) {
        return serviceTableDAO.selectServiceTableByStaffId(staffId);
    }
}
