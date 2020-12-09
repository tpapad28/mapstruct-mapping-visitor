
package com.cascader.so65090611.entity;

import com.cascader.so65090611.dto.ProductDto;
import com.cascader.so65090611.EntityMapper;

/**
 *
 * @author tpapad
 */
public class Furniture extends Product {

    private String color;

    public Furniture(long id, String productName, String color) {
        super(id, productName);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public ProductDto map(EntityMapper mapper) {
        System.out.println("Furniture: Mapping " + this + " using " + mapper);
        return mapper.map(this);
    }

}
