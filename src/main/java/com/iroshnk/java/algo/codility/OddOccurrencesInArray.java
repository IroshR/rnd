package com.iroshnk.java.algo.codility;

import java.util.HashMap;
import java.util.Set;

public class OddOccurrencesInArray {
    public static int solution(int[] A) {
        HashMap<Integer, Integer> occurrencesMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            if (occurrencesMap.containsKey(A[i])) {
                int occurrences = occurrencesMap.get(A[i]);
                occurrences++;
                occurrencesMap.put(A[i], occurrences);
            } else {
                occurrencesMap.put(A[i], 1);
            }
        }

        Set keySet = occurrencesMap.keySet();
        for (Object currentKey : keySet) {
            int occurrences = occurrencesMap.get(currentKey);

            if (occurrences % 2 != 0) return (int) currentKey;
        }

        throw new RuntimeException("no unpair value");
    }


    public static void main(String[] args) {
        int A[] = {9, 3, 9, 7, 9};
        //int A[] = {7,2,7};
        //int A[] = {7};
        System.out.println(solution(A));
    }
}
