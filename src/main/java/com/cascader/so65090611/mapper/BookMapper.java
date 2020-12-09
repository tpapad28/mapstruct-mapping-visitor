
package com.cascader.so65090611.mapper;

import com.cascader.so65090611.dto.BookDto;
import com.cascader.so65090611.entity.Book;
import org.mapstruct.Mapper;

/**
 *
 * @author tpapad
 */
@Mapper
public interface BookMapper {

    BookDto map(Book product);

}
