package com.dishesMS.common;

import com.dishesMS.model.Order;

import java.util.List;

/**
 * Created by aa123 on 2018/4/16.
 */
public class ServicePanel {
    private static final ServicePanel SERVICE_PANEL = new ServicePanel();
    private List<Order> serviceList;
    private ServicePanel(){
        super();
    }
    public static ServicePanel getServicePanel()
    {
        return  SERVICE_PANEL;
    }

    public List getServiceList() {
        return serviceList;
    }

    public void setServiceList(List serviceList) {
        this.serviceList = serviceList;
    }

    public void pushServiceListMember(Order order)
    {
        serviceList.add(order);
    }

    public Order popServiceListMember(int orderId)
    {
        for (Order order: serviceList) {
            if(order.getId() == orderId)
            {
                serviceList.remove(order);
                return order;
            }
        }
        return null;
    }

}
