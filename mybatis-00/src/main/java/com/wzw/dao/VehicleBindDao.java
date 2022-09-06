package com.wzw.dao;

import com.wzw.pojo.VehicleBind;

import java.util.List;

public interface VehicleBindDao {
    //查询所有绑定信息
    List<VehicleBind> getVehicleBindList();

    //根据uid查询车辆绑定信息
    VehicleBind getVehicleBindByUID(int uid);

    //根据vid查询车辆绑定信息
    VehicleBind getVehicleBindByVID(int vid);

    //注册车辆绑定信息
    int addVehicleBind(VehicleBind vehiclebind);

    //根据uid更新车辆绑定信息
    void updateVehicleBind(VehicleBind vehiclebind);

    //根据uid删除车辆绑定信息
    void deleteVehicleBind(int vid);

}
