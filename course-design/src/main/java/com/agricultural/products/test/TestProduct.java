package com.agricultural.products.test;

import com.agricultural.products.entity.ProductInfo;
import com.agricultural.products.mapper.ProductInfoMapper;
import com.agricultural.products.service.ProductInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 *
 * @author lqh
 * @date 2021/04/14/21:48
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TestProduct {
    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Autowired
    private ProductInfoService productInfoService;

    @Test
    public void testFindByProductCategoryType(){
        List<ProductInfo> productInfoList = productInfoService.findByProductCategoryTpye(1);
        log.info(productInfoList.toString());
    }
}
