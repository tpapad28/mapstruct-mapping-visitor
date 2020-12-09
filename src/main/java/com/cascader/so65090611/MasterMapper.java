
package com.cascader.so65090611;

import com.cascader.so65090611.dto.BookDto;
import com.cascader.so65090611.dto.FurnitureDto;
import com.cascader.so65090611.dto.ProductDto;
import com.cascader.so65090611.entity.Book;
import com.cascader.so65090611.entity.Furniture;
import com.cascader.so65090611.entity.Product;
import com.cascader.so65090611.mapper.BookMapper;
import com.cascader.so65090611.mapper.FurnitureMapper;
import com.cascader.so65090611.mapper.ProductMapper;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author tpapad
 */
public class MasterMapper implements EntityMapper {

    @Override
    public ProductDto map(Product product) {
        System.out.println("MasterMapper: Mapping Product " + product);
        ProductMapper productMapper = Mappers.getMapper(ProductMapper.class);
        return productMapper.map(product);
    }

    @Override
    public BookDto map(Book product) {
        System.out.println("MasterMapper: Mapping Book " + product);
        BookMapper productMapper = Mappers.getMapper(BookMapper.class);
        return productMapper.map(product);
    }

    @Override
    public FurnitureDto map(Furniture product) {
        System.out.println("MasterMapper: Mapping Furniture " + product);
        FurnitureMapper productMapper = Mappers.getMapper(FurnitureMapper.class);
        return productMapper.map(product);
    }

}
