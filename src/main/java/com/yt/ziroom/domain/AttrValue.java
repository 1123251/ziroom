package com.yt.ziroom.domain;

import lombok.Data;

import java.util.List;
@Data
public class AttrValue {
    private int id;
    private int attrId;
    private String valueName;

    private List<String> nameList;
}
