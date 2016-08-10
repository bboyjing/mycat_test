package cn.didadu.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.core.annotation.Order;

import java.util.List;

/**
 * Created by zhangjing on 16-8-10.
 */

@Mapper
public interface OrderMapper {

    @Select("select * from `order`")
    List<Order> findOrder();

}
