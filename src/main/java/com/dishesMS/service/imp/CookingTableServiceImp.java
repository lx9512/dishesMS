package com.dishesMS.service.imp;

import com.dishesMS.common.DateFormtUtil;
import com.dishesMS.dao.ICookingTableDAO;
import com.dishesMS.dao.IOrderDao;
import com.dishesMS.model.CookingTable;
import com.dishesMS.model.Order;
import com.dishesMS.model.Staff;
import com.dishesMS.service.ICookingTableService;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by aa123 on 2018/4/18.
 */
@Service
public class CookingTableServiceImp implements ICookingTableService {

    @Resource
    ICookingTableDAO cookingTableDAO;
    @Resource
    IOrderDao orderDao;

    /**
     *将订单加入至烹饪列表内
     *  @param orderId
     */
    public void saveOrder(int orderId) {
        Order order = orderDao.selectByPrimaryKey(orderId);
        Date startDate = DateFormtUtil.dateFormt(new Date());
        CookingTable cookingTable = new CookingTable(order.getId(),order.getUntreateStatus(),startDate);
        cookingTableDAO.insertCookingTable(cookingTable);

    }

    /**
     *获取正在烹饪所有订单
     *  @return
     */
    public List<CookingTable> findCookingTable() {
        return cookingTableDAO.selectCookingTable();
    }

    /**
     * @param orderId
     *更新数据库中order_info cookingTable表 订单中菜品完成烹饪数量 及将完成数量写入未服务字段内（表示请求服务上菜数量）
     *
     *  @param completeNum
     */
    public void editOrderCookingNum(int orderId, int completeNum) {
        CookingTable cookingTable = cookingTableDAO.selectCookingTableByOrderInfoId(orderId);

        cookingTable.setCookingNum(cookingTable.getCookingNum() - completeNum);
        cookingTable.setNotServiceNum(cookingTable.getNotServiceNum() + completeNum);
        Staff staff = (Staff) SecurityUtils.getSubject().getPrincipal();

        if(cookingTable.getCookingNum() == 0)
        {
            cookingTable.setCookingStaffId(staff.getId());
            cookingTable.setEndDate(DateFormtUtil.dateFormt(new Date()));
        }
        cookingTableDAO.updateCookingNum(cookingTable);  //更新烹饪列表中菜品数量

        Order order = orderDao.selectByPrimaryKey(orderId);
        order.setCompleteStatus(order.getCompleteStatus() + completeNum);
        order.setUntreateStatus(order.getUntreateStatus() - completeNum);

        orderDao.updateByPrimaryKey(order);   //更新客户订单菜品完成数量
    }

    public List<CookingTable> findNotServiceOrders() {
        return cookingTableDAO.selectNotServiceOrders();
    }
}
