package com.zhengguan.OMGPersonal.controller;

import com.zhengguan.OMGPersonal.commutil.R;
import com.zhengguan.OMGPersonal.entities.User;
import com.zhengguan.OMGPersonal.servlet.UserServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class UserController {
    @Autowired
    UserServlet userServlet;


    //用户主页面
    @RequestMapping("/member-list")
    public String member_list(){
        return "/member-list.html";
    }

    //显示用户信息
    @RequestMapping("/showOMGAll_user")
    @ResponseBody
    public R showOMGAll_product(){
        return R.ok(userServlet.SerselectOMGAllsy_user());
    }


    @RequestMapping("/updByIdOMG_user")
    @ResponseBody
    //修改用户
    public R updByIdOMG_user(User user){
        return R.ok(userServlet.SerupdateOMGuser(user));
    }

    //根据编号删除用户
    @RequestMapping("/delByIdOMG_user")
    @ResponseBody
    public R delByIdOMG_user( int userId)
    {
        return R.ok(userServlet.SerdeleteOMGuser(userId));
    }

}
