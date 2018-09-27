package com.spring.service;

import com.spring.entity.User;

/**
 * Created by Administrator on 2018/9/25.
 */
public interface UserService {

    public User getUser(String userName);
    public User getUserById(String id);
}
