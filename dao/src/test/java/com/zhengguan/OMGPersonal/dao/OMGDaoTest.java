package com.zhengguan.OMGPersonal.dao;

import com.zhengguan.OMGPersonal.entities.AdmUser;
import com.zhengguan.OMGPersonal.entities.Commodity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback(true)
public class OMGDaoTest {

    @Autowired
    OMGDao omgDao;

    @Test
    //后台用户注册
    public void registerAdmName() {
        AdmUser admUser=new AdmUser();
        admUser.setAdmName("11111");
        admUser.setAdmPassword("11111");
        admUser.setAdmSex("男");
        admUser.setAdmTephone("16342342342");
        System.out.println(omgDao.registerAdmName(admUser));
    }

    @Test
    //商品组合查询
    public void selectOMGAll_product() {
        Map<String,Object>map=new HashMap<String, Object>();
        map.put("imgId",1101);
        map.put("cTypeId",2101);
        map.put("cShellId",0);
        System.out.println(omgDao.selectOMGAll_product(map));
    }
    @Test
    //根据商品编号查询商品信息
    public void selectOMGById_product() {
        System.out.println(omgDao.selectOMGById_product(10100001));
    }
    @Test
    //根据商品的信息进行多条件查询
    public void  selectOMGByManytj_product(){
        System.out.println(omgDao.selectOMGByManytj_product("星"));
    }
    @Test
    //获取全部商品信息
    public void  selectOMGAllsy_product(){
        System.out.println(omgDao.selectOMGAllsy_product());
    }
    @Test
    //根据编号删除商品
    public void  deleteOMGproduct(){
        System.out.println(omgDao.deleteOMGproduct(12312));
    }

    @Test
    //添加商品信息
    public void  addOMGproduct(){
        Commodity commodity=new Commodity();
        commodity.setcId(10100003);
        commodity.setcName("欧米茄");
        commodity.setcModel("欧米茄");
        commodity.setcPrice(2342);
        commodity.setcDescribe("欧米茄");
        commodity.setImgName("sdf");
        commodity.setcTypeId(2101);
        commodity.setcShellId(3101);
        commodity.setcChainId(4101);
        commodity.setcColorId(5101);
        commodity.setcDiameterId(6101);
        commodity.setcEspeciallyId(7101);
        commodity.setcMovementId(8101);
        commodity.setcWaterproofId(9101);
        System.out.println(omgDao.addOMGproduct(commodity));
    }

    @Test
    //修改商品信息
    public void  updateOMGproduct(){
        Commodity commodity=new Commodity();
        commodity.setcName("欧米茄");
        commodity.setcModel("阿斯蒂");
        commodity.setcPrice(2342);
        commodity.setcDescribe("撒地方");
        commodity.setImgName("pic(2).jpg");
        commodity.setcTypeId(2101);
        commodity.setcShellId(3101);
        commodity.setcChainId(4101);
        commodity.setcColorId(5101);
        commodity.setcDiameterId(6101);
        commodity.setcEspeciallyId(7101);
        commodity.setcMovementId(8101);
        commodity.setcWaterproofId(9101);
        commodity.setcId(10100001);
        System.out.println(omgDao.updateOMGproduct(commodity));
    }

    @Test
    //商品信息分页
    public void  selectOMGpage_product(){
        List<Commodity>commodities=omgDao.selectOMGpage_product(0,1);
        System.out.println(commodities);
    }

     @Test
    //商品总数
    public void  countProduct(){
        System.out.println(omgDao.countProduct());
    }


    @Test
    //多删除
    public void  deletesOMGproduct(){
        List<Integer>list=new ArrayList<Integer>();
        list.add(10100001);
        list.add(10100002);
        System.out.println(omgDao.deletesOMGproduct(list));
    }
}