package com.mocha.dao;

import com.mocha.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Description:
 * Created by Leo.zhang on 2017/4/5.
 */
@Mapper
public interface UserDao {

//    void insert(User user);
//
//    void update(User user);

    @Select("select * from user where name = #{name}")
    User select(String name);

}
