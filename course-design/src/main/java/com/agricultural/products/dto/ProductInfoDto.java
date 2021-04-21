package com.agricultural.products.dto;

import com.agricultural.products.entity.ProductInfo;
import com.agricultural.products.enums.ProductInfoStateEnum;
import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 *
 * @author lqh
 * @date 2021/04/13/22:55
 */
// 接口:  /product/product_info/list
@Data
public class ProductInfoDto {

    private Integer state;

    private String stateInfo;

    private Integer count;  // stock

    private ProductInfo productInfo;

    private List<ProductInfo> productInfoList;

    public ProductInfoDto(){}

    public ProductInfoDto(ProductInfo productInfo){
        this.productInfo = productInfo;
    }

    //构造器
    public ProductInfoDto(ProductInfoStateEnum productInfoStateEnum){
        this.state = productInfoStateEnum.getState();
        this.stateInfo = productInfoStateEnum.getStateInfo();
    }

    public ProductInfoDto(ProductInfoStateEnum productInfoStateEnum,ProductInfo productInfo){
        this.state = productInfoStateEnum.getState();
        this.stateInfo = productInfoStateEnum.getStateInfo();
        this.productInfo = productInfo;
    }
    public ProductInfoDto(ProductInfoStateEnum productInfoStateEnum,List<ProductInfo> productInfoList){
        this.state = productInfoStateEnum.getState();
        this.stateInfo = productInfoStateEnum.getStateInfo();
        this.productInfoList = productInfoList;
    }

}
