
package com.cascader.so65090611.dto;

/**
 *
 * @author tpapad
 */
public class BookDto extends ProductDto {

    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookDto {" + "author=" + author + '}';
    }

}
