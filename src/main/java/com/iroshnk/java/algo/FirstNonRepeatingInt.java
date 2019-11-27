package com.iroshnk.java.algo;

public class FirstNonRepeatingInt {
    public static void firstNonRepeatingInt() {
        int[] array = {-1, 4, 5, 5, 4, 6, 7, 8, 9};

        L1: for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    break;
                }
                if(j+1 == array.length){
                    System.out.println(array[i]);
                    break L1;
                }
            }
        }
    }

    public static void main(String[] args) {
        firstNonRepeatingInt();
    }
}
