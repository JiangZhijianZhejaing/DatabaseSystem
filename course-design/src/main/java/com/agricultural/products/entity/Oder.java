package com.agricultural.products.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created with IntelliJ IDEA
 *
 * @author lqh
 * @date 2021/04/15/14:00
 */

@Data
@TableName("ap_order")
public class Oder {
    @TableId(type = IdType.ASSIGN_ID)
    private Integer id;

    @TableId(type = IdType.ASSIGN_UUID)
    private String userId;

    private String name;

    private String region;

    private String address;

    private String telephone;

    private Date orderTime;

    private Date payTime;

    private Date pickupTime;

    private Date deliveredTime;

    private Date receivedTime;

    private BigDecimal totalFee;

    private BigDecimal refundFee;

    private Integer status;

    private String comment;

    private String transactionId;

    private Date lastUpdateTime;
}
