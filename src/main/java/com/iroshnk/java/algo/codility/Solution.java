package com.iroshnk.java.algo.codility;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        boolean[] isOn = new boolean[A.length];
        for (int i = 0; i < A.length; i++) {
            isOn[A[i] - 1] = true;

            L2:
            for (int j = 0; j <= i; j++) {
                if (!isOn[j]) {
                    break L2;
                }
            }
            return A[i + 1];
        }

        /*for(int i = 0; i < arr.length; i++) {
            if
        }

        List<Integer> arr = new ArrayList<>();
        a.contains()*/

        throw new RuntimeException("invalid");
    }

    public static List<String> aa(List<String> s, List<String> t) {
        int length = s.size();
        List<String> resutls = new ArrayList<>(length);

        for (int i = 0; i < length; i++) {
            String ss = s.get(i);
            String st = t.get(i);
            if (ss.length() == st.length()) {
                boolean result = false;
                int freq[] = new int[26];
                int sLength = s.get(i).length();
                for (int j = 0; j < sLength; j++) {
                    freq[ss.charAt(j) - 'a']++;
                }
                for (int j = 0; j < sLength; j++) {
                    freq[st.charAt(j) - 'a']--;
                }

                for (int j = 0; j < 26; j++) {
                    if (freq[j] > 3) {
                        result = false;
                        resutls.add("NO");
                        break;
                    } else {
                        result = true;
                    }
                }
                if(result){
                    resutls.add("YES");
                }
            } else {
                resutls.add("NO");
            }
        }

        return resutls;
    }

    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("aaa");
        s.add("aabaab");
        s.add("rrrrrrr");
        List<String> t = new ArrayList<>();
        t.add("aaa");
        t.add("bbabbc");
        t.add("aaaaaaa");
        System.out.println(aa(s,t));
    }
}

class TransactionException extends Exception {
    private String errorMessage;
    private String errorCode;

    public TransactionException(String errorMessage, String errorCode) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return errorMessage;
    }

    public String getCode() {
        return errorCode;
    }
}
