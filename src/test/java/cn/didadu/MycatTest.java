package cn.didadu;

import cn.didadu.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by zhangjing on 16-8-10.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MycatTestApplication.class)
@WebAppConfiguration
public class MycatTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void addOrderTest(){
        orderService.addOrder();
        System.out.println("OK");
    }

    @Test
    public void addOrderDetailTest(){
        orderService.addOrderDetail();
        System.out.println("OK");

    }
}
