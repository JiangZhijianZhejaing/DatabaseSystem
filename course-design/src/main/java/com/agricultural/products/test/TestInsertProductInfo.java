package com.agricultural.products.test;

import com.agricultural.products.entity.ProductInfo;
import com.agricultural.products.mapper.ProductInfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA
 *
 * @author lqh
 * @date 2021/04/14/21:29
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TestInsertProductInfo {

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Test
    public void insertProductInfo(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductDescription("这只是一个测试");
        productInfo.setCategoryType(1); // 种类1
        productInfo.setProductName("Test3");
        productInfo.setProductCurrentPrice(BigDecimal.valueOf(10000.2));
        productInfo.setProductStatus(1);
        productInfo.setProductIcon("/image/products/img/7-pic.jpg");
        int state = productInfoMapper.insert(productInfo);
        log.info("插入状态:"+state);
    }
}
