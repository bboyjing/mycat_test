package cn.didadu.entity;

import lombok.Data;

/**
 * Created by zhangjing on 16-8-10.
 */

@Data
public class Order{
    private Integer id;
    private Integer status;
    private Integer price;
    private Long createTime;
}
