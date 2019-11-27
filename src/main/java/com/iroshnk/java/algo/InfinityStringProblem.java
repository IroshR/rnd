package com.iroshnk.java.algo;

public class InfinityStringProblem {
    public static void infinityStringProblem(String pattern, int start, int end) {
        int characterCount = end - start + 1;
        StringBuffer sb = new StringBuffer();
        int patternLength = pattern.length();
        if (start > 0) {
            int val1 = start % patternLength;
            sb.append(pattern.substring(val1-1));
            characterCount -= sb.length();
        }
        int fullPatternSet = characterCount / patternLength;
        for (int i = 0; i < fullPatternSet; i++) {
            sb.append(pattern);
            characterCount -= patternLength;
        }
        if(characterCount>0)
        sb.append(pattern.substring(0, characterCount));

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        infinityStringProblem("abcdef", 13, 20);
        infinityStringProblem("abcdef", 81, 137);
    }
}
