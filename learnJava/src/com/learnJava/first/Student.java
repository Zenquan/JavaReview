package com.learnJava.first;

import java.awt.*;

class Person {
    protected String name;
    protected int age;
    protected String sex;
}
public class Student extends Person{

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public static void main(String[] args) {
        Student XM = new Student();
        XM.setName("XiaoMing");
        XM.setAge(23);
        XM.setSex("F");
        System.out.println(XM.getSex());
        System.out.println(XM.getAge());
        System.out.println(XM.getSex());
    }
}
