package com.zhengguan.OMGPersonal.servlet.Impl;

import com.zhengguan.OMGPersonal.dao.OMGDao;
import com.zhengguan.OMGPersonal.entities.AdmUser;
import com.zhengguan.OMGPersonal.entities.Commodity;
import com.zhengguan.OMGPersonal.entities.NoteResult;

import com.zhengguan.OMGPersonal.servlet.OMGServlet;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.security.NoSuchAlgorithmException;
import java.util.List;


@Service
public class OMGServletImpl implements OMGServlet{
    @Autowired
    OMGDao omgDao;

    //后台用户登录
    public NoteResult SerselectByAdmName(String admName, String admPassword) throws NoSuchAlgorithmException {
        NoteResult result=new NoteResult();
        AdmUser admUser=omgDao.selectByAdmName(admName);
        if (admUser==null){
            result.setStatus(1);
            result.setMsg("用户名不存在");
            return result;
        }
        //与数据库密码比对
        if(!admUser.getAdmPassword().equals(admPassword)){
            result.setStatus(2);
            result.setMsg("密码不正确");
            return  result;
        }
        result.setStatus(0);
        result.setMsg("用户名和密码正确");
        result.setData(admUser.getAdmName());//返回username
        return  result;

    }
    //注册用户
    public NoteResult registerAdmName(String admName, String admPassword , String admSex, String admPhone)throws NoSuchAlgorithmException {
        NoteResult registerresult= new NoteResult();
        //检测用户名是否被占用
        AdmUser registeruser=omgDao.selectByAdmName(admName);
        if(registeruser!=null){
            registerresult.setStatus(1);
            registerresult.setMsg("用户名已被占用");
            return  registerresult;
        }
        AdmUser registeruser2 = new AdmUser();
        registeruser2.setAdmName(admName);
        registeruser2.setAdmPassword(admPassword);
        registeruser2.setAdmSex(admSex);
        registeruser2.setAdmTephone(admPhone);
        //调用userDao保存
        omgDao.registerAdmName(registeruser2);
        registerresult.setStatus(0);
        registerresult.setMsg("注册成功");
        registerresult.setData(registeruser2);
        return registerresult;
    }
    //显示所有商品信息
    public List<Commodity> SerselectOMGAllsy_product() {
        return omgDao.selectOMGAllsy_product();
    }
    //根据编号删除商品
    public int SerdeleteOMGproduct(int cId) {
        return omgDao.deleteOMGproduct(cId);
    }
    //添加商品
    public int SeraddOMGproduct(Commodity commodity) {
        return omgDao.addOMGproduct(commodity);
    }
    //修改商品
    public int SerupdateOMGproduct(Commodity commodity) {
        return omgDao.updateOMGproduct(commodity);
    }
    //根据编号进行商品查询
    public Commodity SerselectOMGById_product(int cId) {
        Commodity commodity=omgDao.selectOMGById_product(cId);
        return commodity;
    }
    //分页
    public List<Commodity> SerselectOMGpage_product(int param1, int param2) {
        param1=(param1-1)*param2;
        return omgDao.selectOMGpage_product(param1,param2);
    }
    //获取商品总数
    public int Sercount_product() {
        return omgDao.countProduct();
    }

    //模糊查询商品总数
    public int selectOMGByManytjzs_product(String cName, String cModel, String cTName) {
//        if(StringUtils.isEmpty(cName)){
//            cName=null;
//        }
//        if(StringUtils.isEmpty(cModel)){
//            cModel=null;
//        }
//        if(StringUtils.isEmpty(cTName)){
//            cTName=null;
//        }
        return omgDao.selectOMGByManytjzs_product(cName,cModel,cTName);
    }
    //多删除
    public int SerdeletesOMGproduct(List<Integer>cId) {
        if (cId==null||cId.size()<=0){
            return 0;
        }
        return omgDao.deletesOMGproduct(cId);
    }

    //模糊查询
    public List<Commodity> SerselOMGByManytj_product(int param1, int param2, String cName, String cModel, String cTName) {
//        if(StringUtils.isEmpty(cName)){
//            cName=null;
//        }
//        if(StringUtils.isEmpty(cModel)){
//            cModel=null;
//        }
//        if(StringUtils.isEmpty(cTName)){
//            cTName=null;
//        }
        param1=(param1-1)*param2;
        return omgDao.selectOMGByManytj_product(param1,param2,cName,cModel,cTName);
    }

}
