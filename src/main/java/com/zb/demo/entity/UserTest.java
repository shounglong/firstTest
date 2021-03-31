package com.zb.demo.entity;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;

@Validated
public class UserTest {



    @Email
    private  int id;
    private String name;
    private String pwd;
    private String sex;
    private String data;
    private String loginNumber;
    private String role;


    public int getId() {
        return id;
    }

    public UserTest() {
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLoginNumber() {
        return loginNumber;
    }

    public void setLoginNumber(String loginNumber) {
        this.loginNumber = loginNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "UserTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", sex='" + sex + '\'' +
                ", data='" + data + '\'' +
                ", loginNumber='" + loginNumber + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
