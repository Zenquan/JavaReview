package com.learnJava.first;

public class LearnStringBuilder {
    public static void main(String[] args) {
        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob.com");
        System.out.println(sBuffer);
        sBuffer.reverse();
        System.out.println(sBuffer);
        sBuffer.delete(3, 8);
        System.out.println(sBuffer);
        sBuffer.insert(0, "zenquan");
        System.out.println(sBuffer);
        sBuffer.replace(0, 5, "zenquan");
        System.out.println(sBuffer);
    }
}
