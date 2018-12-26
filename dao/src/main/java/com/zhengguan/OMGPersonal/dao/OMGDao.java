package com.zhengguan.OMGPersonal.dao;

import com.zhengguan.OMGPersonal.entities.AdmUser;
import com.zhengguan.OMGPersonal.entities.Commodity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OMGDao {
    //后台用户登录
    AdmUser selectByAdmName(@Param("admName") String admName);
    //后台用户注册
    boolean registerAdmName(AdmUser admUser);
    //根据商品Id查询商品信息
    Commodity selectOMGById_product(int cId);
    //商品组合查询
    Commodity selectOMGAll_product(Map<String,Object>map);
    //根据商品信息模糊多条件查询商品信息
    List<Commodity>selectOMGByManytj_product(@Param("realpage1")int param1,@Param("realpage2")int param2,@Param("cName") String cName,@Param("cModel") String cModel,@Param("cTName") String cTName);
    //获取商品所有信息
    List<Commodity>selectOMGAllsy_product();
    //删除商品
    int deleteOMGproduct(@Param("cId") int cId);
    //添加商品
    int addOMGproduct(Commodity commodity);
    //修改商品
    int updateOMGproduct(Commodity commodity);
    //分页
    List<Commodity>selectOMGpage_product(@Param("realpage1")int param1,@Param("realpage2")int param2);
    //商品总数
    int countProduct();
    //多删除
    int deletesOMGproduct(@Param("cId") List<Integer>cId);
    //多条件查询商品总数
    int selectOMGByManytjzs_product(@Param("cName") String cName,@Param("cModel") String cModel,@Param("cTName") String cTName);

}
