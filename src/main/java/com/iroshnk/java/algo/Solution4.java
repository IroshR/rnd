package com.iroshnk.java.algo;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution4 {

    static void nextMove(int n, int r, int c, String [] grid){
        int pr = 0;
        int pc = 0;
        int oldR = r;
        int oldC = c;
        for(int i = 0 ; i<n ; i++) {
            String s = grid[i];
            if(s.contains("p")) {
                pr = i;
                pc = s.indexOf("p");
                break;
            }
        }
        boolean match = true;
        while (match) {
            if(r > pr) {
                System.out.println("UP");
                r--;
                break;
            } else if (r == pr){

            }
            else {
                System.out.println("DOWN");
                r++;
                break;
            }

            if(c > pc) {
                System.out.println("LEFT");
                c--;
                break;
            } else if (c == pc){

            }
            else {
                System.out.println("RIGHT");
                c++;
                break;
            }

            if (c == pc && r == pr){
                match = false;
                break;
            }
        }

        grid[oldR] = grid[oldR].replace('m','-');

        StringBuilder myName = new StringBuilder(grid[r]);
        myName.setCharAt(c, 'm');

        grid[r] = myName.toString();

        for(int i = 0 ; i<n ; i++) {
            System.out.println(grid[i]);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,r,c;
        n = in.nextInt();
        r = in.nextInt();
        c = in.nextInt();
        in.useDelimiter("\n");
        String grid[] = new String[n];


        for(int i = 0; i < n; i++) {
            grid[i] = in.next();
        }

        nextMove(n,r,c,grid);

    }
}
