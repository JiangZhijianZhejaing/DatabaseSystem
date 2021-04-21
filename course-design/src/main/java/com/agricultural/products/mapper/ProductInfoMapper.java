package com.agricultural.products.mapper;

import com.agricultural.products.entity.ProductInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA
 *
 * @author lqh
 * @date 2021/04/13/23:23
 */
// 直接使用mybatis-plus的实体类，CURD不用写了
@Mapper
public interface ProductInfoMapper extends BaseMapper<ProductInfo> {
}
