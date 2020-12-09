
package com.cascader.so65090611;

import com.cascader.so65090611.dto.ProductDto;
import com.cascader.so65090611.entity.Product;
import com.cascader.so65090611.mapper.ProductMapper;
import java.util.ArrayList;
import java.util.List;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author tpapad
 */
public class TheService {

    public List<ProductDto> mapProducts(List<Product> listOfEntities) {
        MasterMapper mm = new MasterMapper();
        List<ProductDto> listOfProducts = new ArrayList<>(listOfEntities.size());
        listOfEntities.forEach(i -> {
            if (i instanceof MappableEntity) {
                MappableEntity me = i;
                ProductDto dto = me.map(mm);
                listOfProducts.add(dto);
            } else {
                // Throw an AssertionError during development (who would run server VMs with -ea ?!?!)
                assert false : "Can't properly map " + i.getClass() + " as it's not implementing MappableEntity";
                // Use default mapper as a fallback
                final ProductDto defaultDto = Mappers.getMapper(ProductMapper.class).map(i);
                listOfProducts.add(defaultDto);
            }

        });
        return listOfProducts;
    }

}
