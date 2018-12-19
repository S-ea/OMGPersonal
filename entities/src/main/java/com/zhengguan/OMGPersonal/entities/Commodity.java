package com.zhengguan.OMGPersonal.entities;


public class Commodity {

  private int cId;
  private String cName;
  private String cModel;
  private double cPrice;
  private String cDescribe;
  private int cState;
  private String imgName;
  private int cTypeId;
  private int cShellId;
  private int cChainId;
  private int cColorId;
  private int cDiameterId;
  private int cEspeciallyId;
  private int cMovementId;
  private int cWaterproofId;


  private Ctypetb ctypetb; //类型
  private Cshelltb cshelltb; //表壳
  private Cchaintb cchaintb;  //表链
  private Ccolortb ccolortb; //颜色
  private Cdiametertb cdiametertb;//表壳直径
  private  Cespeciallytb cespeciallytb; //特色
  private  Cmovementtb cmovementtb;//机芯
  private  Cwaterprooftb cwaterprooftb;//防水性能


  public int getcId() {
    return cId;
  }

  public void setcId(int cId) {
    this.cId = cId;
  }

  public String getcName() {
    return cName;
  }

  public void setcName(String cName) {
    this.cName = cName;
  }

  public String getcModel() {
    return cModel;
  }

  public void setcModel(String cModel) {
    this.cModel = cModel;
  }

  public double getcPrice() {
    return cPrice;
  }

  public void setcPrice(double cPrice) {
    this.cPrice = cPrice;
  }

  public String getcDescribe() {
    return cDescribe;
  }

  public void setcDescribe(String cDescribe) {
    this.cDescribe = cDescribe;
  }

  public int getcState() {
    return cState;
  }

  public void setcState(int cState) {
    this.cState = cState;
  }

  public String getImgName() {
    return imgName;
  }

  public void setImgName(String imgName) {
    this.imgName = imgName;
  }

  public int getcTypeId() {
    return cTypeId;
  }

  public void setcTypeId(int cTypeId) {
    this.cTypeId = cTypeId;
  }

  public int getcShellId() {
    return cShellId;
  }

  public void setcShellId(int cShellId) {
    this.cShellId = cShellId;
  }

  public int getcChainId() {
    return cChainId;
  }

  public void setcChainId(int cChainId) {
    this.cChainId = cChainId;
  }

  public int getcColorId() {
    return cColorId;
  }

  public void setcColorId(int cColorId) {
    this.cColorId = cColorId;
  }

  public int getcDiameterId() {
    return cDiameterId;
  }

  public void setcDiameterId(int cDiameterId) {
    this.cDiameterId = cDiameterId;
  }

  public int getcEspeciallyId() {
    return cEspeciallyId;
  }

  public void setcEspeciallyId(int cEspeciallyId) {
    this.cEspeciallyId = cEspeciallyId;
  }

  public int getcMovementId() {
    return cMovementId;
  }

  public void setcMovementId(int cMovementId) {
    this.cMovementId = cMovementId;
  }

  public int getcWaterproofId() {
    return cWaterproofId;
  }

  public void setcWaterproofId(int cWaterproofId) {
    this.cWaterproofId = cWaterproofId;
  }

  public Ctypetb getCtypetb() {
    return ctypetb;
  }

  public void setCtypetb(Ctypetb ctypetb) {
    this.ctypetb = ctypetb;
  }

  public Cshelltb getCshelltb() {
    return cshelltb;
  }

  public void setCshelltb(Cshelltb cshelltb) {
    this.cshelltb = cshelltb;
  }

  public Cchaintb getCchaintb() {
    return cchaintb;
  }

  public void setCchaintb(Cchaintb cchaintb) {
    this.cchaintb = cchaintb;
  }

  public Ccolortb getCcolortb() {
    return ccolortb;
  }

  public void setCcolortb(Ccolortb ccolortb) {
    this.ccolortb = ccolortb;
  }

  public Cdiametertb getCdiametertb() {
    return cdiametertb;
  }

  public void setCdiametertb(Cdiametertb cdiametertb) {
    this.cdiametertb = cdiametertb;
  }

  public Cespeciallytb getCespeciallytb() {
    return cespeciallytb;
  }

  public void setCespeciallytb(Cespeciallytb cespeciallytb) {
    this.cespeciallytb = cespeciallytb;
  }

  public Cmovementtb getCmovementtb() {
    return cmovementtb;
  }

  public void setCmovementtb(Cmovementtb cmovementtb) {
    this.cmovementtb = cmovementtb;
  }

  public Cwaterprooftb getCwaterprooftb() {
    return cwaterprooftb;
  }

  public void setCwaterprooftb(Cwaterprooftb cwaterprooftb) {
    this.cwaterprooftb = cwaterprooftb;
  }

  @Override
  public String toString() {
    return "Commodity{" +
            "cId=" + cId +
            ", cName='" + cName + '\'' +
            ", cModel='" + cModel + '\'' +
            ", cPrice=" + cPrice +
            ", cDescribe='" + cDescribe + '\'' +
            ", cState=" + cState +
            ", imgName='" + imgName + '\'' +
            ", cTypeId=" + cTypeId +
            ", cShellId=" + cShellId +
            ", cChainId=" + cChainId +
            ", cColorId=" + cColorId +
            ", cDiameterId=" + cDiameterId +
            ", cEspeciallyId=" + cEspeciallyId +
            ", cMovementId=" + cMovementId +
            ", cWaterproofId=" + cWaterproofId +
            ", ctypetb=" + ctypetb +
            ", cshelltb=" + cshelltb +
            ", cchaintb=" + cchaintb +
            ", ccolortb=" + ccolortb +
            ", cdiametertb=" + cdiametertb +
            ", cespeciallytb=" + cespeciallytb +
            ", cmovementtb=" + cmovementtb +
            ", cwaterprooftb=" + cwaterprooftb +
            '}';
  }
}
