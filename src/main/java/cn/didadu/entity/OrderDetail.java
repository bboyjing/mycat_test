package cn.didadu.entity;

import lombok.Data;

/**
 * Created by zhangjing on 16-8-16.
 */

@Data
public class OrderDetail {
    private Integer id;
    private Integer orderId;
    private String remark;
}
