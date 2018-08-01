package com.lijp.liblog.dao.mapper;

import com.lijp.liblog.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by Li on 2018/7/29.
 */
@Mapper
public interface LoginUserMapper {

    @Select("select id,user_name from blog_user where user_name = #{userName} and password = #{password};")
    User queryUserByNameAndPassword(@Param(value = "userName") String userName, @Param(value = "password")String password);
}
