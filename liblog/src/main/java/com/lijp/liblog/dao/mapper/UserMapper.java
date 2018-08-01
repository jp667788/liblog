package com.lijp.liblog.dao.mapper;

import com.lijp.liblog.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Li on 2018/7/29.
 */
@Mapper
public interface UserMapper {

    /**
     * 根据用户名称查询用户列表
     * @param userName
     * @return
     */
    @Select("select id,user_name,password,login_time from blog_user where user_name like  CONCAT( #{text}, '%'); ")
    List<User> queryUserListByUserName(String userName);

}
