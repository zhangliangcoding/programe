package com.mocha.dao;

import com.mocha.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * Description:
 * Created by Leo.zhang on 2017/4/5.
 */
@Mapper
public interface UserDao {

    @Insert("insert into user (name,pwd) values (#{user.name},#{user.pwd})")
    void insert(@Param("user") User user);
    @Update("update  user set pwd = #{pwd} where name = #{user.name")
    void update(@Param("user")User user);

    @Select("select * from user where name = #{name}")
    User select(String name);

}
