package com.zhengguan.OMGPersonal.servlet;

import com.zhengguan.OMGPersonal.entities.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserServlet {
    //获取商品所有信息
    List<User> SerselectOMGAllsy_user();
    //删除用户
    int SerdeleteOMGuser(@Param("userId") int userId);
    //添加用户
    int SeraddOMGuser(User user);
    //修改用户
    int SerupdateOMGuser(User user);

    //根据Id查询用户信息
    User SerselectOMGuserById(@Param("userId") int userId);
}
