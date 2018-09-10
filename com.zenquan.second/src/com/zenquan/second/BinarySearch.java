package com.zenquan.second;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11, 22, 35, 47, 56, 78, 98};
		System.out.println(myBinarySearch(arr, 3));
	}
	public static int myBinarySearch(int[] targetArr, int targetNum) {
		int head = 0;
		int end = targetArr.length - 1;
		int middle = (head + end) / 2;
		while(targetNum!=targetArr[middle]) {
			if(head > end) {
				return -1;
			}
			if(targetNum>targetArr[middle]) {
				head = middle + 1;
			}else {
				end = middle -1;
			}
			
			middle = (head + end) / 2;
		}
		
		return middle;
	}

}
