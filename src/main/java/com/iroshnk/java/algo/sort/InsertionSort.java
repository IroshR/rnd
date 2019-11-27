package com.iroshnk.java.algo.sort;

public class InsertionSort {
    public static int[] insertionSort(int array[]) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            int holdValue = array[i];
            int j = i;

            while (j > 0 && holdValue < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = holdValue;
        }

        return array;
    }

    public static void main(String[] args) {
        //int array[] = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        //int array[] = new int[]{79, 58, 27, 16, 45, 84, 33, 92, 61};
        int array[] = new int[]{79, 58, 27, 16, 14, 16, 45, 84, 33, 92, 61};
        //int array[] = new int[]{79};

        int[] sortedArray = insertionSort(array);

        for (int j = 0; j < sortedArray.length; j++) {
            System.out.println(sortedArray[j]);
        }
    }
}
