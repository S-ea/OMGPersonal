package com.zhengguan.OMGPersonal.entities;


public class AdmUser {

  private int admId;
  private String admName;
  private String admPassword;
  private String admSex;
  private String admTephone;
  private java.sql.Timestamp admTime;


  public int getAdmId() {
    return admId;
  }

  public void setAdmId(int admId) {
    this.admId = admId;
  }

  public String getAdmName() {
    return admName;
  }

  public void setAdmName(String admName) {
    this.admName = admName;
  }


  public String getAdmPassword() {
    return admPassword;
  }

  public void setAdmPassword(String admPassword) {
    this.admPassword = admPassword;
  }


  public String getAdmSex() {
    return admSex;
  }

  public void setAdmSex(String admSex) {
    this.admSex = admSex;
  }


  public String getAdmTephone() {
    return admTephone;
  }

  public void setAdmTephone(String admTephone) {
    this.admTephone = admTephone;
  }


  public java.sql.Timestamp getAdmTime() {
    return admTime;
  }

  public void setAdmTime(java.sql.Timestamp admTime) {
    this.admTime = admTime;
  }

}
