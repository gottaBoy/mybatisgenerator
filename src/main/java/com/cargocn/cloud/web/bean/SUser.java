package com.cargocn.cloud.web.bean;

import java.util.Date;

public class SUser {
    private Long userid;

    private String bankaccount;

    private String bankname;

    private String cercode;

    private String emailaddr;

    private String memo;

    private Date regdate;

    private String useraddr;

    private Byte usercata;

    private String usercode;

    private String username;

    private String userpasswd;

    private String usersex;

    private Byte userstatus;

    private String usertel;

    private String usertel2;

    private Byte usertype;

    private Date validdate;

    private Long citycodeid;

    private Long companyid;

    private Long provincecodeid;

    private Long reguserid;

    private Long userfileid;

    private Long phoneid;

    private byte[] idcardphoto;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount == null ? null : bankaccount.trim();
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getCercode() {
        return cercode;
    }

    public void setCercode(String cercode) {
        this.cercode = cercode == null ? null : cercode.trim();
    }

    public String getEmailaddr() {
        return emailaddr;
    }

    public void setEmailaddr(String emailaddr) {
        this.emailaddr = emailaddr == null ? null : emailaddr.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public String getUseraddr() {
        return useraddr;
    }

    public void setUseraddr(String useraddr) {
        this.useraddr = useraddr == null ? null : useraddr.trim();
    }

    public Byte getUsercata() {
        return usercata;
    }

    public void setUsercata(Byte usercata) {
        this.usercata = usercata;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpasswd() {
        return userpasswd;
    }

    public void setUserpasswd(String userpasswd) {
        this.userpasswd = userpasswd == null ? null : userpasswd.trim();
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex == null ? null : usersex.trim();
    }

    public Byte getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(Byte userstatus) {
        this.userstatus = userstatus;
    }

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel == null ? null : usertel.trim();
    }

    public String getUsertel2() {
        return usertel2;
    }

    public void setUsertel2(String usertel2) {
        this.usertel2 = usertel2 == null ? null : usertel2.trim();
    }

    public Byte getUsertype() {
        return usertype;
    }

    public void setUsertype(Byte usertype) {
        this.usertype = usertype;
    }

    public Date getValiddate() {
        return validdate;
    }

    public void setValiddate(Date validdate) {
        this.validdate = validdate;
    }

    public Long getCitycodeid() {
        return citycodeid;
    }

    public void setCitycodeid(Long citycodeid) {
        this.citycodeid = citycodeid;
    }

    public Long getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Long companyid) {
        this.companyid = companyid;
    }

    public Long getProvincecodeid() {
        return provincecodeid;
    }

    public void setProvincecodeid(Long provincecodeid) {
        this.provincecodeid = provincecodeid;
    }

    public Long getReguserid() {
        return reguserid;
    }

    public void setReguserid(Long reguserid) {
        this.reguserid = reguserid;
    }

    public Long getUserfileid() {
        return userfileid;
    }

    public void setUserfileid(Long userfileid) {
        this.userfileid = userfileid;
    }

    public Long getPhoneid() {
        return phoneid;
    }

    public void setPhoneid(Long phoneid) {
        this.phoneid = phoneid;
    }

    public byte[] getIdcardphoto() {
        return idcardphoto;
    }

    public void setIdcardphoto(byte[] idcardphoto) {
        this.idcardphoto = idcardphoto;
    }
}