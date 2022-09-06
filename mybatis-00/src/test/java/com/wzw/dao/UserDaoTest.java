package com.wzw.dao;

import com.wzw.pojo.User;
import com.wzw.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void testGetUserList(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            List<User> userList = userDao.getUserList();
            //        List<User> userList = sqlSession.selectList("com.wzw.dao.UserDao.getUserList");

            //打印结果
            for (User user : userList){
                System.out.println(user);
            }
        }catch (Exception e){

        }finally {
            //关闭session 线程不安全
            sqlSession.close();
        }
    }

    @Test
    public void testGetUserByID(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            User user = userDao.getUserByID(001);
            //        List<User> userList = sqlSession.selectList("com.wzw.dao.UserDao.getUserList");

            //打印结果
            System.out.println(user);
        }catch (Exception e){

        }finally {
            //关闭session 线程不安全
            sqlSession.close();
        }
    }

    @Test
    public void testAddUser(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            UserDao userDao = sqlSession.getMapper(UserDao.class);


            int userid = userDao.addUser(new User("driver","33040220","IDcard","vivi","12312","CA","FICO","regType1","110011",
                                        "20001201","contracttype1","inactive","vivianna0124","u12345","14","CA",false));

            List<User> userList = userDao.getUserList();
            //打印结果
            for (User user : userList){
                System.out.println(user);
            }
        }catch (Exception e){

        }finally {
            sqlSession.commit();
            //关闭session 线程不安全
            sqlSession.close();
        }
    }

    @Test
    public void testUpdateUser(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            User user = userDao.getUserByID(001);
            user.setBanned(true);

            userDao.updateUser(user);

            List<User> userList = userDao.getUserList();
            //打印结果
            for (User userI : userList){
                System.out.println(userI);
            }
        }catch (Exception e){

        }finally {
            sqlSession.commit();
            //关闭session 线程不安全
            sqlSession.close();
        }
    }
    @Test
    public void testDeleteUser(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            UserDao userDao = sqlSession.getMapper(UserDao.class);

            userDao.deleteUser(001);
            List<User> userList = userDao.getUserList();
            //打印结果
            for (User userI : userList){
                System.out.println(userI);
            }
        }catch (Exception e){

        }finally {
            sqlSession.commit();
            //关闭session 线程不安全
            sqlSession.close();
        }
    }
}
