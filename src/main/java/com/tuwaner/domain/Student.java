package com.tuwaner.domain;

/**
 * Created by wanglingyun on 2017/5/8.
 */
public class Student {
    private String stuId;

    private String name;

    private int age;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
