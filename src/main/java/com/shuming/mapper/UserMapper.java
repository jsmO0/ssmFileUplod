package com.shuming.mapper;

import com.shuming.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     * 获取一个指定ID用户信息
     * @param id
     * @return
     */
    User get(@Param("id") int id);

    /**
     * 获取所有注册的用户名
     * @return
     */
    List<String> getAllUsername();

    String getPassword(@Param("username") String username);

    /**
     * 插入一个用户信息
     * @param user
     * @return
     */
    void  insertOne(@Param("user") User user);
}
