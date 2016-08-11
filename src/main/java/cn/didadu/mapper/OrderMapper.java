package cn.didadu.mapper;

import cn.didadu.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by zhangjing on 16-8-10.
 */

@Mapper
public interface OrderMapper {

    @Select("select * from `order`")
    List<Order> findOrder();

    /**
     * 批量新增订单
     * @param orderList
     */
    @Insert("<script>"+
            "insert into `order`(id, status, price, create_time) "
            + "values "
            + "<foreach collection =\"orderList\" item=\"order\" index= \"index\" separator =\",\"> "
            + "(next value for MYCATSEQ_ORDER,#{order.status},#{order.price},NOW()) "
            + "</foreach > "
            + "</script>")
    void batchInsertOrder(@Param("orderList") List<Order> orderList);

    /**
     * 新增订单
     * @param order
     */
    @Insert("<script>"+
            "insert into `order`(id, status, price, create_time) "
            + "values "
            + "(next value for MYCATSEQ_ORDER,#{order.status},#{order.price},NOW()) "
            + "</script>")
    void insertOrder(@Param("order") Order order);
}
