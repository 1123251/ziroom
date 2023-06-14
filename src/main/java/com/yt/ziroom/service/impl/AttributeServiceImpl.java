package com.yt.ziroom.service.impl;


import com.yt.ziroom.domain.Attribute;
import com.yt.ziroom.mapper.AttributeMapper;
import com.yt.ziroom.service.AttributeService;
import com.yt.ziroom.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttributeServiceImpl implements AttributeService {
    @Autowired
    AttributeMapper attributeMapper;

    @Override
    public JsonResult show() {

        List<Attribute> attr = attributeMapper.findAttr();

        JsonResult jsonResult = new JsonResult();

        jsonResult.setCode(1);
        jsonResult.setInfo(attr);

        return jsonResult;
    }
}
