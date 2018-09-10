package com.learnJava.first;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LearnDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.toString());
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        System.out.println("当前的时间是："+ft.format(date));
    }
}
