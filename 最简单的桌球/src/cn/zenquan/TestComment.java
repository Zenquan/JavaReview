package cn.zenquan;
import java.util.Scanner;
/**
 * @author zenquan
 * @date 2018 08 28
 *
 * */
public class TestComment {
    //这是一个单行注释
    /**
     * 这是多行注释
     *
     * */
    {
        int age;
    }
    public static void main(String[] args){
        int age = 23;
        int b = age++;
        int c = ++age;
        System.out.println("b = "+ b + "age = " + age); //23 24
        System.out.println("c = "+ c + "age = " + age); //25 25
        Scanner s = new Scanner(System.in);
        //System.out.println(s);
    }

}
