package cn.didadu.service;

import cn.didadu.entity.Order;
import cn.didadu.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangjing on 16-8-11.
 */

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public void addOrder(){
        Order order;
        for(int i = 1; i <= 2000; i++){
            order = new Order();
            order.setStatus(i % 2);
            order.setPrice(i);
            orderMapper.insertOrder(order);
        }
    }

}
