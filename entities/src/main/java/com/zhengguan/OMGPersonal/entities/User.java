package com.zhengguan.OMGPersonal.entities;


public class User {

  private int userId;
  private String userAn;
  private String userPw;
  private String userName;
  private String userSex;
  private String userTephone;
  private String userEmail;
  private java.sql.Date userBirthday;
  private String userAddress;
  private java.sql.Timestamp userTime;


  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getUserAn() {
    return userAn;
  }

  public void setUserAn(String userAn) {
    this.userAn = userAn;
  }

  public String getUserPw() {
    return userPw;
  }

  public void setUserPw(String userPw) {
    this.userPw = userPw;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserSex() {
    return userSex;
  }

  public void setUserSex(String userSex) {
    this.userSex = userSex;
  }

  public String getUserTephone() {
    return userTephone;
  }

  public void setUserTephone(String userTephone) {
    this.userTephone = userTephone;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public java.sql.Date getUserBirthday() {
    return userBirthday;
  }

  public void setUserBirthday(java.sql.Date userBirthday) {
    this.userBirthday = userBirthday;
  }

  public String getUserAddress() {
    return userAddress;
  }

  public void setUserAddress(String userAddress) {
    this.userAddress = userAddress;
  }


  public java.sql.Timestamp getUserTime() {
    return userTime;
  }

  public void setUserTime(java.sql.Timestamp userTime) {
    this.userTime = userTime;
  }

}
