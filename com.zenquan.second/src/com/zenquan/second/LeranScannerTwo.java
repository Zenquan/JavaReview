package com.zenquan.second;
import java.util.*;

public class LeranScannerTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = (int)(Math.random()*100+1);
		int userInput = number--;
		do {
			System.out.println("��������µ����֣�");
			userInput = sc.nextInt();
			if(userInput>number) {
				System.out.println("��´���");
			}else if(userInput<number) {
				System.out.println("���С��");			
			}else {
				System.out.println("�������");
			}
		}while(userInput!=number);
	}
}
