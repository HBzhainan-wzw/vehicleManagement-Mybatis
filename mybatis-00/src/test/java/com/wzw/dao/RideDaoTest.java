package com.wzw.dao;

import com.wzw.pojo.Ride;
import com.wzw.pojo.Ride;
import com.wzw.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class RideDaoTest {

    @Test
    public void testGetRideList(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            RideDao rideDao = sqlSession.getMapper(RideDao.class);
            List<Ride> rideList = rideDao.getRideList();
            //        List<Ride> rideList = sqlSession.selectList("com.wzw.dao.RideDao.getRideList");

            //打印结果
            for (Ride ride : rideList){
                System.out.println(ride);
            }
        }catch (Exception e){

        }finally {
            //关闭session 线程不安全
            sqlSession.close();
        }
    }

    @Test
    public void testGetRideByID(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            RideDao rideDao = sqlSession.getMapper(RideDao.class);
            Ride ride = rideDao.getRideByID(283713);
            //        List<Ride> rideList = sqlSession.selectList("com.wzw.dao.RideDao.getRideList");

            //打印结果
            System.out.println(ride);
        }catch (Exception e){

        }finally {
            //关闭session 线程不安全
            sqlSession.close();
        }
    }

    @Test
    public void testAddRide(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            RideDao rideDao = sqlSession.getMapper(RideDao.class);


            int rideID = rideDao.addRide(new Ride("time",003,002,"MQTT_chanel","ride_type",
                    "start_coordinate","start_address","end_coordinate","end_address",
                    "ride_status","ride_accept_time","pick_up_time","arrive_time","ride_cancel_time",
                    "ride_distance","ride_order_id","ride_alarm_status","warranty_status",
                    3,"ride_comment","formed_order_id",25, 4,5,5,
                    6,5,"order_status","payment_platform", "payment_id",
                    "payment_result","ride_trace_id","time_form","GPS_trace",4,3));

            List<Ride> rideList = rideDao.getRideList();
            //打印结果
            for (Ride ride : rideList){
                System.out.println(ride);
            }
        }catch (Exception e){

        }finally {
            sqlSession.commit();
            //关闭session 线程不安全
            sqlSession.close();
        }
    }
    @Test
    public void testUpdateRide(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();


        //执行sql
        RideDao rideDao = sqlSession.getMapper(RideDao.class);
        Ride ride = rideDao.getRideByID(283713);
        ride.setPassenger_id(001);
        rideDao.updateRide(ride);

        List<Ride> rideList = rideDao.getRideList();
        //打印结果
        for (Ride rideI : rideList){
            System.out.println(rideI);
        }

        sqlSession.commit();
        //关闭session 线程不安全
        sqlSession.close();

    }

    @Test
    public void testDeleteRide(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            RideDao rideDao = sqlSession.getMapper(RideDao.class);

            rideDao.deleteRide(283713);
            List<Ride> rideList = rideDao.getRideList();
            //打印结果
            for (Ride rideI : rideList){
                System.out.println(rideI);
            }
        }catch (Exception e){

        }finally {
            sqlSession.commit();
            //关闭session 线程不安全
            sqlSession.close();
        }
    }
}
