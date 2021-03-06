/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.builtin.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ap.test.builtin.bean.DateProperty;
import org.mapstruct.ap.test.builtin.bean.XmlGregorianCalendarProperty;
import org.mapstruct.factory.Mappers;

@Mapper
public interface XmlGregCalToDateMapper {

    XmlGregCalToDateMapper INSTANCE = Mappers.getMapper( XmlGregCalToDateMapper.class );

    DateProperty map( XmlGregorianCalendarProperty source);
}
