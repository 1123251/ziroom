package com.yt.ziroom.domain;

import lombok.Data;

@Data
public class RoomPicture {
    private int id;
    private int roomId;
    private String pictureUrl;
}
