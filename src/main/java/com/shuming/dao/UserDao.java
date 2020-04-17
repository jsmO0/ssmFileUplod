package com.shuming.dao;

import com.shuming.pojo.User;

import java.util.List;

public interface UserDao {
    /**
     * 获取一个指定ID用户的信息
     * @param id
     * @return
     */
    User get(int id);

    /**
     * 获取所有已经注册的用户名
     * @return
     */
    List<String> getAllUsername();

    /**
     * 很具用户名查询用户密码，进行登录验证
     * @param username
     * @return
     */
    String getPassword(String username);

    /**
     * 插入一个用户
     * @param user
     */
    void insertOne(User user);
}
