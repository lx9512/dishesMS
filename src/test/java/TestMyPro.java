import com.dishesMS.model.Customer;
import com.dishesMS.model.Dishes;
import com.dishesMS.model.Order;
import com.dishesMS.model.OrderMain;
import com.dishesMS.service.ICustomerService;
import com.dishesMS.service.IDishesService;
import com.dishesMS.service.IOrderMainService;
import com.dishesMS.service.IOrderService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yzp on 2018/3/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mvc.xml", "classpath:spring-mybatis.xml" })
public class TestMyPro {
    private static final Logger logger = Logger.getLogger(TestMyPro.class);

    @Resource
    private IDishesService dishesService;

    @Resource
    private ICustomerService customerService;

    @Resource
    private IOrderMainService iOrderMainService;

    @Resource
    private IOrderService orderService;
    @Test
    public void test(){
        Customer customer = customerService.getCustomerById(19903);
        logger.info(customer);
        List<Dishes> dishes = dishesService.findAllDishes();
        logger.info(dishes.get(0).getName());
        OrderMain orderMain = iOrderMainService.getDetailByCustomerId(19903);
        logger.info(orderMain.getOrderInfo());
        Order order=orderService.getOrderByDishesAndOrderId(3,2);
        logger.info(order.getId());
        List<Order> order1 = orderService.getAllDetailByOrderId(2);
        logger.info(order1.get(0).getDishes().getDishesVariety().getDescribe());
    }
}
