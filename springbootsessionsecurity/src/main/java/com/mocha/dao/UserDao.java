package com.mocha.dao;

import com.mocha.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * Description:
 * Created by Leo.zhang on 2017/3/31.
 */
public interface UserDao {

    User getUser(@Param("name") String name);

    void insertUser(@Param("user") User user);
//
//    void updateUser(@Param("user") User user);
//
//    void deleteUser(@Param("user") User user);


}
