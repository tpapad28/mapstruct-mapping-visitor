
package com.cascader.so65090611;

import com.cascader.so65090611.dto.ProductDto;

/**
 *
 * @author tpapad
 */
public interface MappableEntity {

    public ProductDto map(EntityMapper mapper);
}
