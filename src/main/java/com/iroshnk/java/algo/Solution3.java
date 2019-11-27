package com.iroshnk.java.algo;

import java.io.IOException;
import java.util.Scanner;

public class Solution3 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();

        char[][] arr = new char[n][n];

        scanner = new Scanner(System.in);
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next().toCharArray();
        }


        int pr = 0;
        int pc = 0;

        int mr = n / 2 ;
        int mc = n / 2 ;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 'p') {
                    pr = i;
                    pc = j;
                }
            }
        }

        System.out.println(pr + ", " + pc);
        System.out.println(mr + ", " + mc);

        boolean match = true;
        while (match) {
            if(mr > pr) {
                System.out.println("UP");
                mr--;
            } else if (mr == pr){

            }
            else {
                System.out.println("DOWN");
                mr++;
            }

            if(mc > pc) {
                System.out.println("LEFT");
                mc--;
            } else if (mc == pc){

            }
            else {
                System.out.println("RIGHT");
                mc++;
            }

            if (mc == pc && mr == pr){
                match = false;
            }
        }

    }
}
