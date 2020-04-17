package com.shuming.dao;

import com.shuming.mapper.UserMapper;
import com.shuming.pojo.User;
import com.shuming.utils.GetMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public User get(int id) {
        return GetMapper.get().get(1);
    }

    @Override
    public List<String> getAllUsername() {
        return GetMapper.get().getAllUsername();
    }

    @Override
    public String getPassword(String username) {

        return GetMapper.get().getPassword(username);
    }

    @Override
    public void insertOne(User user) {
        GetMapper.get().insertOne(user);
    }


}
