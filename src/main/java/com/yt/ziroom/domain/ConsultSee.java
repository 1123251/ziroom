package com.yt.ziroom.domain;

import lombok.Data;

@Data
public class ConsultSee {
    private int id;
    private int uId;
    private int roomId;
    private String seeTime;
    private String seePhone;
}
