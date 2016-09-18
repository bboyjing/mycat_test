package cn.didadu.mapper;

import cn.didadu.entity.OrderDetail;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zhangjing on 16-8-16.
 */

@Mapper
public interface OrderDetailMapper {
    @Insert("<script>"+
            "insert into `order_detail`(id, order_id,remark) "
            + "values "
            + "(next value for MYCATSEQ_ORDER_DETAIL,#{orderDetail.orderId},#{orderDetail.remark}) "
            + "</script>")
    void insertOrderDetail(@Param("orderDetail") OrderDetail orderDetail);
}
