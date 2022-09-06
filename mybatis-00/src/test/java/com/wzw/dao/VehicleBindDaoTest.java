package com.wzw.dao;

import com.wzw.pojo.VehicleBind;
import com.wzw.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class VehicleBindDaoTest {
    @Test
    public void testGetVehicleBindList(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            VehicleBindDao vehicleBindDao = sqlSession.getMapper(VehicleBindDao.class);
            List<VehicleBind> vehicleBindList = vehicleBindDao.getVehicleBindList();
            //        List<VehicleBind> vehicleBindList = sqlSession.selectList("com.wzw.dao.VehicleBindDao.getVehicleBindList");

            //打印结果
            for (VehicleBind vehicleBind : vehicleBindList){
                System.out.println(vehicleBind);
            }
        }catch (Exception e){

        }finally {
            //关闭session 线程不安全
            sqlSession.close();
        }
    }

    @Test
    public void testGetVehicleBindByID(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            VehicleBindDao vehicleBindDao = sqlSession.getMapper(VehicleBindDao.class);
            //通过uid搜索
            VehicleBind vehicleBind = vehicleBindDao.getVehicleBindByUID(001);
                //打印结果
            System.out.println(vehicleBind);
            //通过vid搜索
            vehicleBind = vehicleBindDao.getVehicleBindByVID(001);
            //打印结果
            System.out.println(vehicleBind);
        }catch (Exception e){

        }finally {
            //关闭session 线程不安全
            sqlSession.close();
        }
    }

    @Test
    public void testAddVehicleBind(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            VehicleBindDao vehicleBindDao = sqlSession.getMapper(VehicleBindDao.class);

            int vehicleBindid = vehicleBindDao.addVehicleBind(new VehicleBind(738044,006));

            List<VehicleBind> vehicleBindList = vehicleBindDao.getVehicleBindList();
            //打印结果
            for (VehicleBind vehicleBind : vehicleBindList){
                System.out.println(vehicleBind);
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
    public void testUpdateVehicleBind(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            VehicleBindDao vehicleBindDao = sqlSession.getMapper(VehicleBindDao.class);
            VehicleBind vehicleBind = vehicleBindDao.getVehicleBindByUID(001);
            vehicleBind.setVid(004);
            vehicleBindDao.updateVehicleBind(vehicleBind);

            List<VehicleBind> vehicleBindList = vehicleBindDao.getVehicleBindList();
            //打印结果
            for (VehicleBind vehicleBindI : vehicleBindList){
                System.out.println(vehicleBindI);
            }
        }catch (Exception e){

        }finally {
            sqlSession.commit();
            //关闭session 线程不安全
            sqlSession.close();
        }
    }
    @Test
    public void testDeleteVehicleBind(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            VehicleBindDao vehicleBindDao = sqlSession.getMapper(VehicleBindDao.class);

            vehicleBindDao.deleteVehicleBind(002);
            List<VehicleBind> vehicleBindList = vehicleBindDao.getVehicleBindList();
            //打印结果
            for (VehicleBind vehicleBindI : vehicleBindList){
                System.out.println(vehicleBindI);
            }
        }catch (Exception e){

        }finally {
            sqlSession.commit();
            //关闭session 线程不安全
            sqlSession.close();
        }
    }
}
