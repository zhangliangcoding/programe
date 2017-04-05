package com.mocha.service;

import com.mocha.bean.User;
import com.mocha.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 * Created by Leo.zhang on 2017/4/5.
 */
@Service
public class UserService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserDao dao;


    public User getByName(String name) {
        logger.info("info");
        logger.debug("debug");
        logger.error("error");
        logger.getName();
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
