package com.learnJava.first;

import java.io.*;

public class io {
    public static void main(String args[]) throws IOException {
        char c;
        BufferedReader ch = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入字符，按下'l'键退出。");
        do {
            c = (char)ch.read();
            System.out.print(c);
        }while (c!='l');
    }
}
