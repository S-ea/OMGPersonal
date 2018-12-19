package com.zhengguan.OMGPersonal.servlet.Impl;


import com.zhengguan.OMGPersonal.dao.UserDao;
import com.zhengguan.OMGPersonal.entities.User;
import com.zhengguan.OMGPersonal.servlet.UserServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSerlvetImpl implements UserServlet{
    @Autowired
    UserDao userDao;

    //显示用户信息
    public List<User> SerselectOMGAllsy_user() {
        return userDao.selectOMGAllsy_user();
    }

    //删除用户信息
    public int SerdeleteOMGuser(int userId) {
        return userDao.deleteOMGuser(userId);
    }
    //添加用户信息
    public int SeraddOMGuser(User user) {
        return userDao.addOMGuser(user);
    }
    //修改用户信息
    public int SerupdateOMGuser(User user) {
        return userDao.updateOMGuser(user);
    }

    //根据编号查询用户信息
    public User SerselectOMGuserById(int userId) {
        User user=userDao.selectOMGuserById(userId);
         return user;
    }
}
