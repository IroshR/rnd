package com.iroshnk.java.algo.codility;

public class CyclicRotation {
    public static int[] solution(int[] A, int K) {
        int length = A.length;
        int[] B = new int[length];

        for (int i = 0; i < length; i++) {
            int index = ((i + K) ) % length;
            B[index] = A[i];
        }

        return B;
    }

    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;

        int[] B = solution(A, K);
        for (int b : B) {
            System.out.println(b);
        }
    }
}
