package com.zhengguan.OMGPersonal.servlet;

import com.zhengguan.OMGPersonal.entities.Commodity;
import com.zhengguan.OMGPersonal.entities.NoteResult;
import org.apache.ibatis.annotations.Param;

import java.security.NoSuchAlgorithmException;
import java.util.List;


public interface OMGServlet {
    //后台用户登录
    NoteResult  SerselectByAdmName(String admName,String admPassword) throws NoSuchAlgorithmException;
    //后台用户注册
    public NoteResult registerAdmName(String admName, String admPassword , String admSex, String admPhone) throws NoSuchAlgorithmException;
    //获取商品所有信息
    List<Commodity>SerselectOMGAllsy_product();
    //删除商品
    int SerdeleteOMGproduct(@Param("cId") int cId);
    //添加商品
    int SeraddOMGproduct(Commodity commodity);
    //修改商品
    int SerupdateOMGproduct(Commodity commodity);
    //根据商品编号进行查询
    Commodity SerselectOMGById_product(@Param("cId") int cId);
    //分页
    List<Commodity>SerselectOMGpage_product(@Param("realpage1")int param1,@Param("realpage2")int param2);
    //获取总数
    int Sercount_product();
    //多删除
    int SerdeletesOMGproduct(@Param("cId") List<Integer>cId);
    //s
}
