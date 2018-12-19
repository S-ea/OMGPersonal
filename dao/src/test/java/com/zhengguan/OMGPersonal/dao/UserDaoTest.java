package com.zhengguan.OMGPersonal.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback(true)
public class UserDaoTest {

    @Autowired
    UserDao userDao;

//    @Test
//    //修改用户信息
//    public void  updateOMGuser(){
//        User user=new User();
//        user.setUserAn("");
//        user.setUserName("");
//        user.setUserSex("");
//        user.setUserTephone("");
//        user.setUserEmail("");
//        user.setUserBirthday(Date);
//        user.setUserAddress("");
//        System.out.println(userDao.updateOMGuser(user));
//    }
    @Test
    //删除用户信息
    public void  deleteOMGuser(){
        System.out.println(userDao.deleteOMGuser(101));
    }



}