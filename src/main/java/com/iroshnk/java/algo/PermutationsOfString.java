package com.iroshnk.java.algo;

import java.util.HashSet;
import java.util.Set;

public class PermutationsOfString {
    public static void main(String[] args) {
        String text = "ABC";
        HashSet<String> strings = new HashSet<>();

        r(text, "", strings);

        System.out.println(strings);
    }

    private static Set r(String s, String prefix, HashSet<String> set) {
        if(s.length()==0){
            return set;
        } else {
            for (int i = 0; i < s.length(); i++) {
                String ss = prefix + s.substring(i) + s.substring(0, i);
                set.add(ss);
                r(s.substring(1),prefix+String.valueOf(s.charAt(0)),set);
            }
        }
        return set;
    }

    public static Set<String> getPermutations(String string)
    {
        //All permutations
        Set<String> permutationsSet = new HashSet<String>();

        // invalid strings
        if (string == null || string.length() == 0)
        {
            permutationsSet.add("");
        }
        else
        {
            //First character in String
            char initial = string.charAt(0);

            //Full string without first character
            String rem = string.substring(1);

            //Recursive call
            Set<String> wordSet = getPermutations(rem);

            for (String word : wordSet) {
                for (int i = 0; i <= word.length(); i++) {
                    permutationsSet.add(charInsertAt(word, initial, i));
                }
            }
        }
        return permutationsSet;
    }

    public static String charInsertAt(String str, char c, int position)
    {
        String begin = str.substring(0, position);
        String end = str.substring(position);
        return begin + c + end;
    }
}
