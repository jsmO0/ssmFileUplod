package com.shuming.service;

import com.shuming.dao.UserDao;
import com.shuming.dao.UserDaoImpl;
import com.shuming.pojo.User;

import java.util.List;

public class UserServiceImpl implements UserService{

    private UserDao userDao;
    @Override
    public User get(int id) {
        userDao = new UserDaoImpl();
        return userDao.get(id);
    }

    @Override
    public List<String> getAllUsername() {
        userDao = new UserDaoImpl();
        return userDao.getAllUsername();
    }

    @Override
    public String getPassword(String username) {
        userDao = new UserDaoImpl();
        return userDao.getPassword(username);
    }

    @Override
    public void insertOne(User user) {
        userDao = new UserDaoImpl();
        userDao.insertOne(user);
    }
}
