package com.zenquan.second;
import java.util.Scanner;

public class LearnScanner {
	public static void main(String[] args) {
		System.out.println("�������·ݣ�");
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
					System.out.println(userInput+"����31��");
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println(userInput+"����30��");
					break;	
				case 2:
					System.out.println("��������ݣ�");
					int year = sc.nextInt();
					int days = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? 29 : 28;
					System.out.println(userInput+"��"+"����"+days+"��");
					break;
				case -1:
					break;
				default: 
					System.out.println("�����·�����");
					break;
			}
		}while(userInput!=-1);
	}
}
