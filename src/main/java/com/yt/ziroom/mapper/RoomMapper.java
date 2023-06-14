package com.yt.ziroom.mapper;

import com.yt.ziroom.domain.Room;
import com.yt.ziroom.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RoomMapper {
    @Select("select *from rooms ")
    List<Room> getAll();

    @Select("select *from rooms where roomName like  CONCAT('%', #{key}, '%') or subway like  CONCAT('%', #{key}, '%')")
    List<Room> getByKey(String key);
    @Select("select *from rooms where roomId=#{id}")
    Room getById(Integer id);
    @Select("select pictureURL from roompicture where roomId=#{id}")
    List<String> getImgsById(Integer id);
    @Select("select * from users where uid=#{id}")
    User getOrder(Integer id);


    List<Room> getByKeyList(List<Integer> keys);




}
