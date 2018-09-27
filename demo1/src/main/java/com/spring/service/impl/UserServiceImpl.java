package com.spring.service.impl;

import com.spring.dao.UserDao;
import com.spring.entity.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/9/25.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(String userName) {
        return userDao.getUser(userName);
    }

    @Override
    public User getUserById(String id) {
        return userDao.getUserById(id);
    }
}
