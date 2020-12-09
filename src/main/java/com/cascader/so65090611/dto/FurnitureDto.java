
package com.cascader.so65090611.dto;

/**
 *
 * @author tpapad
 */
public class FurnitureDto extends ProductDto {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "FurnitureDto {" + "color=" + color + '}';
    }

}
