package com.zhengguan.OMGPersonal.controller;


import com.zhengguan.OMGPersonal.commutil.R;
import com.zhengguan.OMGPersonal.entities.Commodity;
import com.zhengguan.OMGPersonal.entities.NoteResult;

import com.zhengguan.OMGPersonal.servlet.OMGServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.NoSuchAlgorithmException;
import java.util.List;


@Controller
@RequestMapping("/product")
public class OMGController {

    @Autowired
    OMGServlet omgServlet;

    //后台登录页面
    @RequestMapping("product/admLogin")
    public String admLogin(){
        return "/login.html";
    }
    //登录到后台首页
    @RequestMapping("/index")
    public String index(){
        return "/index.html";
    }
    //后台登录功能
    @RequestMapping("/admlogin")
    @ResponseBody
    public NoteResult execute(String admName, String admPassword) throws NoSuchAlgorithmException {
        NoteResult result = omgServlet.SerselectByAdmName(admName,admPassword);
//  session.setAttribute("admName",admName);
        return result;
    }
//    //退出登录 转发到登录界面
//    @RequestMapping("/admOut")
//   public String admOut(HttpSession session) {
//        session.setAttribute("adName",null);
//        return "forward:admLogin";
//    }
//    //后台主界面管理页面
//    @RequestMapping("/welcome")
//    public String welcome(){
//        return "/welcome.html";
//    }
    //后台商品管理页面
    @RequestMapping("/product_list")
    public String product_list(){
        return "/product-list.html";
    }

    //后台注册产品页面 测试
    @RequestMapping("/zctest")
    public String zctest(){
        return "backstage/zctest";
    }
//    //注册成功跳转到登录页面
//    @RequestMapping("/tologin")
//    public String tologin(){
//        return "backstage/login";
//    }

    //注册账号，就是添加账号
    @RequestMapping("/registAdmUser")
    public NoteResult registAdmUser(String admName, String admPassword , String admSex, String admPhone, HttpServletResponse response) throws NoSuchAlgorithmException {
        NoteResult result= omgServlet.registerAdmName(admName, admPassword, admSex,admPhone);
        return  result;
    }

//    //显示商品信息
//    @RequestMapping("/showOMGAll_product")
//    @ResponseBody
//    public R showOMGAll_product(){
//        return R.ok(omgServlet.SerselectOMGAllsy_product());
//    }

    //根据编号删除商品
    @RequestMapping("/delByIdOMG_product")
    @ResponseBody
    public R delByIdOMG_product( int cId)
    {
        return R.ok(omgServlet.SerdeleteOMGproduct(cId));
    }

    //商品添加页面
    @RequestMapping("/product_addhtml")
    public String product_addhtml(){
        return "/product-add.html";
    }

    @RequestMapping("/product_adds")
    @ResponseBody
    //添加商品
    public R product_add(HttpServletRequest request,HttpServletResponse response){
        response.setContentType("text/html;charset=UTF-8");
        int cId=Integer.parseInt(request.getParameter("cId"));
        String cName=request.getParameter("cName");
        String cModel=request.getParameter("cModel");
        double cPrice = Double.parseDouble(request.getParameter("cPrice"));
        String cDescribe=request.getParameter("cDescribe");
        int cTypeId=Integer.parseInt(request.getParameter("cTypeId"));
        int cShellId=Integer.parseInt(request.getParameter("cShellId"));
        int cChainId=Integer.parseInt(request.getParameter("cChainId"));
        int cColorId=Integer.parseInt(request.getParameter("cColorId"));
        int cDiameterId=Integer.parseInt(request.getParameter("cDiameterId"));
        int cEspeciallyId=Integer.parseInt(request.getParameter("cEspeciallyId"));
        int cMovementId=Integer.parseInt(request.getParameter("cMovementId"));
        int cWaterproofId=Integer.parseInt(request.getParameter("cWaterproofId"));
        Commodity commodity=new Commodity();
        commodity.setcId(cId);
        commodity.setcName(cName);
        commodity.setcModel(cModel);
        commodity.setcPrice(cPrice);
        commodity.setcDescribe(cDescribe);
        commodity.setcTypeId(cTypeId);
        commodity.setcShellId(cShellId);
        commodity.setcChainId(cChainId);
        commodity.setcColorId(cColorId);
        commodity.setcDiameterId(cDiameterId);
        commodity.setcEspeciallyId(cEspeciallyId);
        commodity.setcMovementId(cMovementId);
        commodity.setcWaterproofId(cWaterproofId);
        return R.ok(omgServlet.SeraddOMGproduct(commodity));
    }


//    @RequestMapping("/product_upd")
//    @ResponseBody
//    //修改商品
//    public R product_upd(HttpServletRequest request,HttpServletResponse response){
//        response.setContentType("text/html;charset=UTF-8");
//        String cName=request.getParameter("cName");
//        String cModel=request.getParameter("cModel");
//        double cPrice = Double.parseDouble(request.getParameter("cPrice"));
//        String cDescribe=request.getParameter("cDescribe");
//        int cTypeId=Integer.parseInt(request.getParameter("cTypeId"));
//        int cShellId=Integer.parseInt(request.getParameter("cShellId"));
//        int cChainId=Integer.parseInt(request.getParameter("cChainId"));
//        int cColorId=Integer.parseInt(request.getParameter("cColorId"));
//        int cDiameterId=Integer.parseInt(request.getParameter("cDiameterId"));
//        int cEspeciallyId=Integer.parseInt(request.getParameter("cEspeciallyId"));
//        int cMovementId=Integer.parseInt(request.getParameter("cMovementId"));
//        int cWaterproofId=Integer.parseInt(request.getParameter("cWaterproofId"));
//        int cId=Integer.parseInt(request.getParameter("cId"));
//        Commodity commodity=new Commodity();
//        commodity.setcName(cName);
//        commodity.setcModel(cModel);
//        commodity.setcPrice(cPrice);
//        commodity.setcDescribe(cDescribe);
//        commodity.setcTypeId(cTypeId);
//        commodity.setcShellId(cShellId);
//        commodity.setcChainId(cChainId);
//        commodity.setcColorId(cColorId);
//        commodity.setcDiameterId(cDiameterId);
//        commodity.setcEspeciallyId(cEspeciallyId);
//        commodity.setcMovementId(cMovementId);
//        commodity.setcWaterproofId(cWaterproofId);
//        commodity.setcId(cId);
//        return R.ok(omgServlet.SerupdateOMGproduct(commodity));
//    }

    @RequestMapping("/product_upd")
    @ResponseBody
    //修改商品
    public R product_upd(Commodity commodity){
        return R.ok(omgServlet.SerupdateOMGproduct(commodity));
    }


//    //商品修改页面
//    @RequestMapping("/product_edit")
//    public String product_edit(){
//        return "/product-add.html";
//    }

    //根据编号查询商品
    @RequestMapping("/selByIdOMG_product")
    @ResponseBody
    public R selByIdOMG_product(int cId)
    {
        return R.ok(omgServlet.SerselectOMGById_product(cId));
    }


    //分页
    @RequestMapping("/showOMGAllpage_product")
    @ResponseBody
    public R showOMGAllpage_product(@RequestParam(defaultValue ="1")int param1, @RequestParam(defaultValue = "4")int param2){
        return R.ok(omgServlet.SerselectOMGpage_product(param1,param2));
    }

    //总数
    @RequestMapping("/selcountdOMG_product")
    @ResponseBody
    public R selcountdOMG_product(){
        return R.ok(omgServlet.Sercount_product());
    }

    //模糊查询
    @RequestMapping("/SerselOMGByManytj_product")
    @ResponseBody
    public R SerselOMGByManytj_product(@RequestParam(defaultValue ="1")int param1, @RequestParam(defaultValue = "4")int param2,@RequestParam String cName,String cModel,String cTName){
        return R.ok(omgServlet.SerselOMGByManytj_product(param1,param2,cName,cModel,cTName));
    }

    //模糊查询总数
    @RequestMapping("/selectOMGByManytjzs_product")
    @ResponseBody
    public R selectOMGByManytjzs_product( String cName,String cModel,String cTName){
        return R.ok(omgServlet.selectOMGByManytjzs_product(cName,cModel,cTName));
    }


    //删除商品之后重新到首页
    @RequestMapping("/deleteProducttz")
    public String deleteProducttz() {
        return "forward:showOMGAll_product";
    }

    //多删除
    @RequestMapping("/deletesOMG_product")
    @ResponseBody
    public R deletesOMG_product( @RequestBody List<Integer> cIds)
    {
        return R.ok(omgServlet.SerdeletesOMGproduct(cIds));
    }

}
