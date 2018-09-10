package com.zenquan.second;
import java.util.Scanner;

public class LearnScanner {
	public static void main(String[] args) {
		System.out.println("请输入月份：");
		int userInput;
		Scanner sc = new Scanner(System.in);
		do {
			userInput = sc.nextInt();
			switch (userInput) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.println(userInput+"月有31天");
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println(userInput+"月有30天");
					break;	
				case 2:
					System.out.println("请输入年份：");
					int year = sc.nextInt();
					int days = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? 29 : 28;
					System.out.println(userInput+"年"+"月有"+days+"天");
					break;
				case -1:
					break;
				default: 
					System.out.println("输入月份有误");
					break;
			}
		}while(userInput!=-1);
	}
}
