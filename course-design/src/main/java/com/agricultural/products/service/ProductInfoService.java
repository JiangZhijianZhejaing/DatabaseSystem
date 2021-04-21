package com.agricultural.products.service;

import com.agricultural.products.dto.ProductInfoDto;
import com.agricultural.products.entity.ProductInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 *
 * @author lqh
 * @date 2021/04/13/23:24
 */
@Component
public interface ProductInfoService extends IService<ProductInfo> {
    public List<ProductInfo> findByProductCategoryTpye(int type);
}
