package com.iroshnk.java.algo.sort;

public class BubbleSort {
    public static int[] bubbleSort(int array[]) {
        int length = array.length;


        for (int j = 1; j < length; j++) {
            for (int i = 0; i < length - j; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }

            }
        }
        return array;
    }

    public static void main(String[] args) {
        //int array[] = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        //int array[] = new int[]{79, 58, 27, 16, 45, 84, 33, 92, 61};
        int array[] = new int[]{79};

        int []sortedArray = bubbleSort(array);

        for (int j = 0; j < sortedArray.length; j++) {
            System.out.println(sortedArray[j]);
        }
    }
}
