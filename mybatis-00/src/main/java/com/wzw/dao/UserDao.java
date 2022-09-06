package com.wzw.dao;

import com.wzw.pojo.User;

import java.util.List;

public interface UserDao {
    //查询所有用户
    List<User> getUserList();

    //根据id查询用户
    User getUserByID(int uid);

    //注册用户
    int addUser(User user);

    //更新用户信息
    void updateUser(User user);

    //删除用户
    void deleteUser(int uid);
}
