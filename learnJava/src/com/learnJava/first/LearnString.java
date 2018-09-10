package com.learnJava.first;

public class LearnString {

    public static void main(String[] args) {
//        String greeting = "菜鸟教程";
//        System.out.println(greeting);
//        char[] helloArray = {'r', 'u', 'n', 'o', 'o', 'b'};
//        String helloString = new String(helloArray);
//        System.out.println(helloString);
        String greeting = "菜鸟教程";
        System.out.println(greeting);
        char[] helloArray = {'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        System.out.println(helloString);
        String site = "www.runoob.com";
        int len = site.length();
        System.out.println(len);
        String siteString = helloString.concat(site);
        System.out.println(siteString);
        System.out.println("hello,"+greeting+"from zenquan");
        float floatVar = (float) 3.1415967;
        int intVar = 12;
        String stringVar = "zenquan";
        //System.out.println("浮点型变量的值为" + "%f, 整型变量的值为 "+ "%d, 字符串变量的值为 "+ "is %s", floatVar, intVar, stringVar);
        System.out.println(stringVar.charAt(2));
        System.out.println(stringVar.compareTo("Zenquan"));

    }
}
