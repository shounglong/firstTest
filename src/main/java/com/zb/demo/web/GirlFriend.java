package com.zb.demo.web;

/**
 * @Author: Tsl
 * @Description:
 * @Date: Created in 19:40  2021/4/26
 * @Modified By:
 */
public class GirlFriend {

    String name;
    int age;
    String identity;
    String hobby;



    public GirlFriend(String name, int age, String identity, String hobby) {
        this.name = name;
        this.age = age;
        this.identity = identity;
        this.hobby = hobby;
        System.out.println("姓名:"+name+",年龄："+age+",职业："+identity+",爱好："+hobby);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
