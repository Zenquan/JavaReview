package com.learnJava.first;

public class LearnArray {
    public void printArray(double[] arrays) {
        for (double array: arrays) {
            System.out.println(array);
        }
    }
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        for(int i=0, j=result.length-1;i<list.length;i++,j--) {
            result[j] = list[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int size = 10;
        double[] myLists = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        int[] theLists = {1, 2, 3, 4, 5, 6, 7, 8, 10};
 /*       for (double myList: myLists) {
            System.out.println(myList);
        }*/
        for (int i=0;i<myLists.length;i++){
            System.out.println(myLists[i]);
        }
        double total = 0;
        for(int i=0;i<myLists.length;i++){
            total+=myLists[i];
        }
        System.out.println("total: "+total);
        double max = myLists[0];
        for(int i=0;i<myLists.length;i++){
            if(max<myLists[i]) max = myLists[i];
        }
        System.out.println("max: "+max);
        LearnArray pArray = new LearnArray();
        pArray.printArray(myLists);
        int[] arrs = pArray.reverse(theLists);
        for(int arr: arrs) {
            System.out.print(arr);
        }
        String strArr[][]= new String[3][3];
    }
}
