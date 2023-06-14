package com.yt.ziroom.mapper;

import com.yt.ziroom.domain.Attribute;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
@Mapper
public interface AttributeMapper {
    List<Attribute> findAttr();
}
