package com.wzw.dao;

import com.wzw.pojo.Vehicle;
import com.wzw.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class VehicleDaoTest {
    @Test
    public void testGetVehicleList(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            VehicleDao vehicleDao = sqlSession.getMapper(VehicleDao.class);
            List<Vehicle> vehicleList = vehicleDao.getVehicleList();
            //        List<Vehicle> vehicleList = sqlSession.selectList("com.wzw.dao.VehicleDao.getVehicleList");

            //打印结果
            for (Vehicle vehicle : vehicleList){
                System.out.println(vehicle);
            }
        }catch (Exception e){

        }finally {
            //关闭session 线程不安全
            sqlSession.close();
        }
    }

    @Test
    public void testGetVehicleByID(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            VehicleDao vehicleDao = sqlSession.getMapper(VehicleDao.class);
            Vehicle vehicle = vehicleDao.getVehicleByID(001);
            //        List<Vehicle> vehicleList = sqlSession.selectList("com.wzw.dao.VehicleDao.getVehicleList");

            //打印结果
            System.out.println(vehicle);
        }catch (Exception e){

        }finally {
            //关闭session 线程不安全
            sqlSession.close();
        }
    }

    @Test
    public void testAddVehicle(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            VehicleDao vehicleDao = sqlSession.getMapper(VehicleDao.class);


                int vehicleid = vehicleDao.addVehicle(new Vehicle("mut7s","0204","audi","A4","white","XL",5,"0204",2018,false));

            List<Vehicle> vehicleList = vehicleDao.getVehicleList();
            //打印结果
            for (Vehicle vehicle : vehicleList){
                System.out.println(vehicle);
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            sqlSession.commit();
            //关闭session 线程不安全
            sqlSession.close();
        }
    }

    @Test
    public void testUpdateVehicle(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            VehicleDao vehicleDao = sqlSession.getMapper(VehicleDao.class);
            Vehicle vehicle = vehicleDao.getVehicleByID(001);
            vehicle.setColor("diamond");

            vehicleDao.updateVehicle(vehicle);

            List<Vehicle> vehicleList = vehicleDao.getVehicleList();
            //打印结果
            for (Vehicle vehicleI : vehicleList){
                System.out.println(vehicleI);
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            sqlSession.commit();
            //关闭session 线程不安全
            sqlSession.close();
        }
    }
    @Test
    public void testDeleteVehicle(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            VehicleDao vehicleDao = sqlSession.getMapper(VehicleDao.class);

            vehicleDao.deleteVehicle(001);
            List<Vehicle> vehicleList = vehicleDao.getVehicleList();
            //打印结果
            for (Vehicle vehicleI : vehicleList){
                System.out.println(vehicleI);
            }
        }catch (Exception e){

        }finally {
            sqlSession.commit();
            //关闭session 线程不安全
            sqlSession.close();
        }
    }
}
