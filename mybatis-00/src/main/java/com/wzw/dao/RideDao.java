package com.wzw.dao;

import com.wzw.pojo.Ride;
import com.wzw.pojo.User;

import java.util.List;

public interface RideDao {
    //查询所有行程
    List<Ride> getRideList();

    //根据id查询行程
    Ride getRideByID(int rid);

    //注册行程
    int addRide(Ride ride);

    //更新行程信息
    void updateRide(Ride ride);

    //删除行程
    void deleteRide(int rid);
}
