package com.agricultural.products.service.impl;

import com.agricultural.products.dto.ProductInfoDto;
import com.agricultural.products.entity.ProductInfo;
import com.agricultural.products.mapper.ProductInfoMapper;
import com.agricultural.products.service.ProductInfoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 *
 * @author lqh
 * @date 2021/04/13/23:24
 */
@Service
public class ProductInfoServiceImpl extends ServiceImpl<ProductInfoMapper, ProductInfo> implements ProductInfoService {
    @Autowired
    private ProductInfoMapper productInfoMapper;
    @Override
    public List<ProductInfo> findByProductCategoryTpye(int type) {
        QueryWrapper<ProductInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("category_type",type);    // 这是指数据库中的字段category_type(驼峰命名)，不是java写的实体类categoryType
        //ProductInfo productInfo = productInfoMapper.selectOne(wrapper); //selectOne是要返回数据库一个数据，返回两个及以上将报错
        List<ProductInfo> productInfoList = productInfoMapper.selectList(wrapper);
        System.out.println(productInfoList);
        return productInfoList;
    }
}
