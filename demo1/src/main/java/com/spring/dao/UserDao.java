package com.spring.dao;

import com.spring.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2018/9/25.
 */
public interface UserDao {

    User getUser(@Param("userName")String userName);
    User getUserById(@Param("id")String id);
}
