
package com.cascader.so65090611.entity;

import com.cascader.so65090611.MappableEntity;
import com.cascader.so65090611.dto.ProductDto;
import com.cascader.so65090611.EntityMapper;

/**
 *
 * @author tpapad
 */
public class Product implements MappableEntity {

    private long id;
    private String productName;

    public Product(long id, String productName) {
        this.id = id;
        this.productName = productName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public ProductDto map(EntityMapper mapper) {
        return mapper.map(this);
    }

}
