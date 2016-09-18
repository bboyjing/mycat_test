package cn.didadu.service;

import cn.didadu.entity.Order;
import cn.didadu.entity.OrderDetail;
import cn.didadu.mapper.OrderDetailMapper;
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

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    public void addOrder(){
        Order order;
        for(int i = 1; i <= 2000; i++){
            order = new Order();
            order.setStatus(i % 2);
            order.setPrice(i);
            orderMapper.insertOrder(order);
        }
    }

    public void addOrderDetail(){
        OrderDetail orderDetail;
        for(int i = 1; i <=10; i++){
            orderDetail = new OrderDetail();
            int orderId = i % 2 == 1 ? 1 : 2;
            orderDetail.setOrderId(orderId);
            orderDetail.setRemark("this is detail from order--" + orderId);
            orderDetailMapper.insertOrderDetail(orderDetail);
        }
    }

}
