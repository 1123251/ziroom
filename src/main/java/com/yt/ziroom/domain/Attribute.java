package com.yt.ziroom.domain;

import lombok.Data;

import java.util.List;
@Data
public class Attribute {
    private int attrId;
    private String attrName;

    private List<AttrValue> attrValueList;
}
