package com.mocha.service;

import com.mocha.bean.User;
import com.mocha.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 * Created by Leo.zhang on 2017/4/5.
 */
@Service
public class UserService {

    @Autowired
    private UserDao dao;


    public User getByName(String name) {
        return dao.select(name);
    }

//    public void insert(User user) {
//        dao.insert(user);
//    }
//
//    public void update(User user) {
//        dao.update(user);
//    }

}
