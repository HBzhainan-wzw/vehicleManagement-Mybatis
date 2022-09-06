package com.wzw.dao;

import com.wzw.pojo.Vehicle;

import java.util.List;

public interface VehicleDao {
    //查询所有车辆
    List<Vehicle> getVehicleList();

    //根据id查询车辆
    Vehicle getVehicleByID(int vid);

    //注册车辆
    int addVehicle(Vehicle vehicle);

    //更新车辆信息
    void updateVehicle(Vehicle vehicle);

    //删除车辆
    void deleteVehicle(int vid);
}
