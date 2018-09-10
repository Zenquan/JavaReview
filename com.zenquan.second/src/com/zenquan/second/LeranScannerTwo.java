package com.zenquan.second;
import java.util.*;

public class LeranScannerTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = (int)(Math.random()*100+1);
		int userInput = number--;
		do {
			System.out.println("请输入你猜的数字：");
			userInput = sc.nextInt();
			if(userInput>number) {
				System.out.println("你猜大了");
			}else if(userInput<number) {
				System.out.println("你猜小了");			
			}else {
				System.out.println("你猜中了");
			}
		}while(userInput!=number);
	}
}
