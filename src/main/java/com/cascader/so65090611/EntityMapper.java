
package com.cascader.so65090611;

import com.cascader.so65090611.dto.BookDto;
import com.cascader.so65090611.dto.FurnitureDto;
import com.cascader.so65090611.dto.ProductDto;
import com.cascader.so65090611.entity.Book;
import com.cascader.so65090611.entity.Furniture;
import com.cascader.so65090611.entity.Product;

/**
 *
 * @author tpapad
 */
public interface EntityMapper {

    ProductDto map(Product entity);

    BookDto map(Book entity);

    FurnitureDto map(Furniture entity);
}
