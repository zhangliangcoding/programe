package com.mocha.dao;

import com.mocha.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Description:
 * Created by Leo.zhang on 2017/3/29.
 */
@Mapper
public interface UserMapper {
    @Select("select id,username as name from s_user where id = #{id}")
    User findById(@Param("id")int id);

}
