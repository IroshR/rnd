package com.iroshnk.java.algo;

public class SecondMinArray {
    public static int getSecondMin(int [] array) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MIN_VALUE;

        for(int i =0; i<array.length; i++){
            if(min > array[i]){
                secondMin = min;
                min = array[i];
            } else if(secondMin > array[i] && min < array[i]) {
                secondMin = array[i];
            }
        }

        System.out.println(secondMin);
        System.out.println(min);
        return secondMin;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 4, -6, 7, -8, 9};
        int[] arr2 = {4, 5, 5, 4, 6, 7, 8, 9};
        getSecondMin(arr2);
    }
}
