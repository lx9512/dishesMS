package com.dishesMS.service.imp;

import com.dishesMS.common.ServicePanel;
import com.dishesMS.dao.IServiceTableDAO;
import com.dishesMS.model.Order;
import com.dishesMS.model.ServiceTable;
import com.dishesMS.model.Staff;
import com.dishesMS.service.IServicePanelService;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by aa123 on 2018/4/16.
 */
@Service
public class ServicePanelServiceImp implements IServicePanelService {
    private ServicePanel servicePanel = ServicePanel.getServicePanel();
    @Resource
    IServiceTableDAO serviceTableDAO;

    /**
     *
     * 将菜品加入到服务列表
     * @param order
     */
    public void pushOrderToServicePanel(Order order) {
        servicePanel.pushServiceListMember(order);
    }

    /**
     * @param orderId
     * 服务员响应对应菜品配送服务
     * 将菜品从服务列表移除，在数据库中记录上菜时间，服务人员id，订单详情id，上菜份数（订单详情完成份数）
     * @return
     */
    public Order popOrderFromServicePanel(int orderId) {
        Order order;
        if(null != (order = servicePanel.popServiceListMember(orderId)))
        {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
            Staff staff =  (Staff) SecurityUtils.getSubject().getPrincipal();
            Date date = new Date();
            try{
                date = simpleDateFormat.parse(simpleDateFormat.format(date));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Timestamp timestamp = new Timestamp(date.getTime());
            ServiceTable serviceTable = new ServiceTable(order.getId(),timestamp,order.getCompleteStatus(),staff.getId());
            serviceTableDAO.insertServiceTable(serviceTable);
            return order;
        }
        return null;
    }

    /**
     * @return
     * 获取服务列表
     */
    public List<Order> findAllOrderFromServicePanel() {
        return servicePanel.getServiceList();
    }


    /**
     *服务员获取自己已经响应的订单记录
     *  @param staffId
     * @return
     */
    public List<ServiceTable> findServiceTableByStaffId(int staffId) {
        List<ServiceTable> serviceTableList = serviceTableDAO.selectServiceTableByStaffId(staffId);
        return serviceTableList;
    }


}
