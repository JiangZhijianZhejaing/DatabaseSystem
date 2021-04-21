package com.agricultural.products.controller;

import com.agricultural.products.dto.ProductInfoDto;
import com.agricultural.products.entity.ProductInfo;
import com.agricultural.products.enums.ProductInfoStateEnum;
import com.agricultural.products.service.ProductInfoService;
import com.agricultural.products.util.RequestUtil;
import com.agricultural.products.util.ResultUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 *
 * @author lqh
 * @date 2021/04/13/22:38
 */

@RestController
@RequestMapping("/product")
@Slf4j
public class ProductInfoList {


    @Autowired
    private ProductInfoService productInfoService;
    /**
     * 通过类型（多种类型）查询商品
     *
     * @param reqMap
     * @return
     */
    @PostMapping("/product_info/list")
    public Object productList(@RequestBody Map<String, Object> reqMap) {

        //获取参数
        Integer type = RequestUtil.getInt(reqMap.get("category_type").toString());
        String pageString = RequestUtil.getMapString(reqMap.get("page").toString());
        String sizeString = RequestUtil.getMapString(reqMap.get("size").toString());
        if (type == -1 || pageString == null || sizeString == null) {
            return ResultUtil.badArgumentValue();
        }
        try {
            //转换数据类型
            Integer page = Integer.parseInt(pageString);
            Integer size = Integer.parseInt(sizeString);
            //String typeString = JSON.toJSONString(typeObject);
            //Integer type = JSONObject.parseInt(typeString, Integer.class);

            //查询数据
            //find返回一个一个list
            ProductInfoDto productInfoDto = new ProductInfoDto(ProductInfoStateEnum.SUCCESS,productInfoService.findByProductCategoryTpye(type));

            return ResultUtil.ok(productInfoDto.getProductInfoList());

        } catch (Exception e) {
            log.error("查询商品失败：{}", e.getMessage());
            return ResultUtil.fail();
        }

    }
}
