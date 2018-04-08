package com.dishesMS.model;

import java.io.Serializable;

/**
 * Created by aa123 on 2018/2/23.
 */
public class Staff implements Serializable {

    private int id;
    private String name;        //姓名
    private String gender;      // 性别
    private String idCard;      //身份证号
    private String tel;         //电话号码
    private String email;       //电子邮箱
    private String account;     //账号
    private String password;    //密码
    private Role role;          //角色身份

    public Staff()
    {
        super();
    }
    /*public Staff(String account,String password,String name,String gender,String idCard,String tel,String email,int roleId)
    {
        super();
        this.account = account;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.idCard = idCard;
        this.tel = tel;
        this.email = email;
        this.role = new Role();
        this.role.setId(roleId);
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
