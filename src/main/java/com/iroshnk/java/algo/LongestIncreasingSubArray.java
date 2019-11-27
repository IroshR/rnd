package com.iroshnk.java.algo;

public class LongestIncreasingSubArray {
    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4,5,6,7};
        int subArrayLength = 1;
        int subArrayLengthMax = 1;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] < input[i + 1]) {
                subArrayLength++;
            } else {
                if (subArrayLengthMax < subArrayLength) {
                    subArrayLengthMax = subArrayLength;
                }
                subArrayLength = 1;
            }
        }
        if (subArrayLengthMax < subArrayLength) {
            subArrayLengthMax = subArrayLength;
        }
        System.out.println(subArrayLengthMax);
    }

    /*public static void main(String[] args) {


        int[] array = new int[]
                {
                        3, 4, 5, 3, 2, 4, 7, 8, 6
                };

        int start = 0, end = 1, length = 1;

        while (end < array.length) {

            if (array[end] > array[end-1]) {
                if ((end - start) + 1 > length) {
                    length = (end - start) + 1;
                }
            } else {
                start = end;
            }

            end++;
        }

        System.out.println(length);

    }*/
}
