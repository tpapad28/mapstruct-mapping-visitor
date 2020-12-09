
package com.cascader.so65090611.mapper;

import com.cascader.so65090611.dto.FurnitureDto;
import com.cascader.so65090611.entity.Furniture;
import org.mapstruct.Mapper;

/**
 *
 * @author tpapad
 */
@Mapper
public interface FurnitureMapper {

    FurnitureDto map(Furniture product);

}
