
package com.cascader.so65090611.mapper;

import com.cascader.so65090611.dto.ProductDto;
import com.cascader.so65090611.entity.Product;
import org.mapstruct.Mapper;

/**
 *
 * @author tpapad
 */
@Mapper
public interface ProductMapper {

    ProductDto map(Product product);

}
