package com.zhengguan.OMGPersonal.dao;


import com.zhengguan.OMGPersonal.entities.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    //获取用户所有信息
    List<User> selectOMGAllsy_user();
    //删除用户
    int deleteOMGuser(@Param("userId") int userId);
    //添加用户
    int addOMGuser(User user);
    //修改用户
    int updateOMGuser(User user);
    //根据Id查询用户信息
    User selectOMGuserById(@Param("userId") int userId);

}
