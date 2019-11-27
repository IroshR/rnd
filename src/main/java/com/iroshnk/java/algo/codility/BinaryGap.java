package com.iroshnk.java.algo.codility;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
    public static int solution(int N) {
        long st = System.currentTimeMillis();
        String binaryString = Integer.toBinaryString(N);

        List<Integer> ones = new ArrayList<>();
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                ones.add(i);
            }
        }
        int longestGap = 0;

        for (int i = 0; i < ones.size() - 1; i++) {
            int gap = ones.get(i + 1) - ones.get(i) - 1;

            longestGap = Math.max(longestGap, gap);
        }

        System.out.println(binaryString);
        long et = System.currentTimeMillis();
        System.out.println("Time in Millis : " + (et - st));

        return longestGap;
    }

    public static void main(String[] args) {
        System.out.println(solution(9));
        System.out.println(solution(529));
        System.out.println(solution(20));
        System.out.println(solution(15));
        System.out.println(solution(32));
        System.out.println(solution(2147483647));
        System.out.println(solution(1041));
    }
}
