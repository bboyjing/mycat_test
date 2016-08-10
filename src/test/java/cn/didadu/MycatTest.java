package cn.didadu;

import cn.didadu.mapper.OrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by zhangjing on 16-8-10.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MycatTestApplication.class)
@WebAppConfiguration
public class MycatTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void findOrderTest(){
        List<Order> orderList = orderMapper.findOrder();
        System.out.println(orderList.size());
    }

}
