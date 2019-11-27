package com.iroshnk.java.algo.codility;

public class PermMissingElem {
    public static int solution(int[] A) {
        int length = A.length;
        int total = 0;
        for(int i=0; i<A.length; i++) {
            total += A[i];
        }

        int max = (length +1) *(length +2)/2;

        return max - total;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int []{}));
        System.out.println(solution(new int []{1}));
        System.out.println(solution(new int []{2}));
        System.out.println(solution(new int []{1, 3}));
        System.out.println(solution(new int []{2, 3}));
        System.out.println(solution(new int []{1, 2}));
        System.out.println(solution(new int []{1, 3, 4}));
        System.out.println(solution(new int []{4, 2, 3, 1, 5, 6, 8, 7}));
        System.out.println(solution(new int []{4, 2, 3, 1, 5, 6, 8, 9}));
    }
}
