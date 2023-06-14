package com.yt.ziroom.service;

import com.yt.ziroom.domain.Room;
import com.yt.ziroom.domain.User;

import java.util.List;

public interface RoomService {
    List<Room> getAll();
    List<Room> getByKey(String key);
    Room getById(Integer id);

    List<String> getImgsById(Integer id);
    User getOrder(Integer id);

}
