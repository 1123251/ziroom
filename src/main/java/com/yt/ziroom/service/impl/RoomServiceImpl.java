package com.yt.ziroom.service.impl;

import com.yt.ziroom.domain.Room;
import com.yt.ziroom.domain.User;
import com.yt.ziroom.mapper.RoomMapper;
import com.yt.ziroom.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    RoomMapper roomMapper;
    @Override
    public List<Room> getAll() {

        return roomMapper.getAll();
    }

    @Override
    public List<Room> getByKey(String key) {
        return roomMapper.getByKey(key);
    }

    @Override
    public Room getById(Integer id) {
        return roomMapper.getById(id);
    }

    @Override
    public List<String> getImgsById(Integer id) {
        return roomMapper.getImgsById(id);
    }

    @Override
    public User getOrder(Integer id) {
        return roomMapper.getOrder(id);
    }


}
