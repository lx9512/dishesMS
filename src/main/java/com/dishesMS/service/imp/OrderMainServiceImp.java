package com.dishesMS.service.imp;

import com.dishesMS.dao.IOrderMainDao;
import com.dishesMS.model.OrderMain;
import com.dishesMS.service.IOrderMainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by yzp on 2018/4/3.
 */
@Service
public class OrderMainServiceImp implements IOrderMainService{

    @Resource
    private IOrderMainDao iOrderMainDao;

    /**
     *
     * 锁桌绑定用户等操作使用该方法
     */
    public int insertOrderMain(OrderMain orderMain){
        return this.iOrderMainDao.insert(orderMain);
    }

    /**
     *只找到当前用户的活跃主订单，判断用户是否锁桌等信息，结果集中不包括订单的详细信息
     * @param customerId
     * @return
     */
    public OrderMain getRunOrderMain(Integer customerId) {
        return iOrderMainDao.selectByCustomerId(customerId);
    }

    /**
     * 得到订单的详细信息，用来打印账单
     * @param customerId
     * @return
     */
    public OrderMain getDetailByCustomerId(Integer customerId) {
        return iOrderMainDao.selectDetailOrderByCustomerId(customerId);
    }

    /**
     *这个是用来的到一个用户的所有账单信息
     * @param customerId
     * @return
     */
    public List<OrderMain> getAllOldOrderMain(Integer customerId) {
        return iOrderMainDao.selectAllOldByCustomerId(customerId);
    }

    /**
     * 这个参数用来得到所有用户的所有账单信息
     * @return
     */
    public List<OrderMain> getAllOrderMain() {
        return iOrderMainDao.selectAllOrder();
    }

    public List<OrderMain> getAllDetailOrderMain() {

        return iOrderMainDao.selectAllDetailOrderMain();
    }

    public boolean editCheckoutInfo(int orderId, int status, int staffId , Timestamp checkoutDate) {
        try{
            iOrderMainDao.updateCheckoutInfo(orderId,status,staffId,checkoutDate);
        }catch(Exception e)
        {
            e.printStackTrace();
            return false;

        }
        return true;
    }
}
