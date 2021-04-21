package com.agricultural.products.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA
 *
 * @author lqh
 * @date 2021/04/13/22:56
 */
// 商品详情
@Data
@TableName("ap_product_info")   // 默认映射到product_info
public class ProductInfo {

    //@TableId(type = IdType.ASSIGN_UUID)       //启动MP自带策略，使用MP插入数据库时自动生成32位字符串id
    private String productId;

    /** 名字. (必填) */
    private String productName;

    /** 现在单价. (必填)*/
    private BigDecimal productCurrentPrice;

    /** 单价.*/
    private BigDecimal productOriginalPrice;

    /** 库存. */
    private Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 状态, 0正常1下架. (必填)*/
    private Integer productStatus;

    /** 状态, 0正常状态 1轮播图 2热销商品 3新品. */
    private Integer productShow;

    /** 类目编号. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}
