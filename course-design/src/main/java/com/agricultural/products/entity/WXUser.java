package com.agricultural.products.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.sql.Date;

/**
 * Created with IntelliJ IDEA
 *
 * @author lqh
 * @date 2021/04/15/9:15
 */

// 商品详情
@Data
@TableName("ap_wx_account")   // 默认映射到ap_wx_account
public class WXUser {
    @TableId(type = IdType.ASSIGN_UUID)       //启动MP自带策略，使用MP插入数据库时自动生成32位字符串id
    private String id;

    @TableId
    private String openid;

    private int status; // 用户状态

    private int roles;  // 用户的角色

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date lastLoginTime;
}
