package com.sample;


import com.zhengguan.OMGPersonal.entities.Commodity;

public class Imgtb {

  private int cId;
  private int imgId;
  private String imgRoute;
  private String imgName;
  private String imgDescribe;


  private Commodity commodity; //商品


  public int getcId() {
    return cId;
  }

  public void setcId(int cId) {
    this.cId = cId;
  }

  public int getImgId() {
    return imgId;
  }

  public void setImgId(int imgId) {
    this.imgId = imgId;
  }

  public String getImgRoute() {
    return imgRoute;
  }

  public void setImgRoute(String imgRoute) {
    this.imgRoute = imgRoute;
  }

  public String getImgName() {
    return imgName;
  }

  public void setImgName(String imgName) {
    this.imgName = imgName;
  }

  public String getImgDescribe() {
    return imgDescribe;
  }

  public void setImgDescribe(String imgDescribe) {
    this.imgDescribe = imgDescribe;
  }

  public Commodity getCommodity() {
    return commodity;
  }

  public void setCommodity(Commodity commodity) {
    this.commodity = commodity;
  }

  @Override
  public String toString() {
    return "Imgtb{" +
            "cId=" + cId +
            ", imgId=" + imgId +
            ", imgRoute='" + imgRoute + '\'' +
            ", imgName='" + imgName + '\'' +
            ", imgDescribe='" + imgDescribe + '\'' +
            ", commodity=" + commodity +
            '}';
  }
}
