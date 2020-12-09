
package com.cascader.so65090611;

import com.cascader.so65090611.dto.BookDto;
import com.cascader.so65090611.dto.FurnitureDto;
import com.cascader.so65090611.dto.ProductDto;
import com.cascader.so65090611.entity.Book;
import com.cascader.so65090611.entity.Furniture;
import com.cascader.so65090611.entity.Product;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author tpapad
 */
public class TheServiceTest {

    public TheServiceTest() {
    }

    @Test
    public void testMapProducts() {

        List<Product> listOfEntities = new ArrayList<>();
        listOfEntities.add(new Book(1, "The Red Book", "Who knows?"));
        listOfEntities.add(new Furniture(2, "iPhone 14S", "Grey"));

        TheService service = new TheService();
        List<ProductDto> dtos = service.mapProducts(listOfEntities);
        Assertions.assertEquals(listOfEntities.size(), dtos.size());
        Assertions.assertEquals(dtos.stream().filter(b -> b.getId() == 1).findFirst().get().getClass(), BookDto.class);
        Assertions.assertEquals(dtos.stream().filter(f -> f.getId() == 2).findFirst().get().getClass(), FurnitureDto.class);
        dtos.forEach(d -> {
            System.out.println(d);
        });
    }

}
