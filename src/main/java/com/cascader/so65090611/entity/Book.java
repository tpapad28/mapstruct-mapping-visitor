
package com.cascader.so65090611.entity;

import com.cascader.so65090611.dto.ProductDto;
import com.cascader.so65090611.EntityMapper;

/**
 *
 * @author tpapad
 */
public class Book extends Product {

    private String author;

    public Book(long id, String name, String author) {
        super(id, name);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public ProductDto map(EntityMapper mapper) {
        System.out.println("Book: Mapping " + this + " using " + mapper);
        return mapper.map(this);
    }

}
