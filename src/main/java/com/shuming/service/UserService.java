package com.shuming.service;

import com.shuming.dao.UserDao;
import com.shuming.pojo.User;

import java.util.List;

public interface UserService {
    User get(int id);
    List<String> getAllUsername();
    String getPassword(String username);
    void insertOne(User user);
}
