
package com.cascader.so65090611.dto;

/**
 *
 * @author tpapad
 */
public class ProductDto {

    private long id;
    private String productName;

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
    public String toString() {
        return "ProductDto {" + "id=" + id + ", productName=" + productName + '}';
    }

}
