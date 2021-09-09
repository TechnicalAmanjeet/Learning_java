package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;
// 3rd q.
public class Avg_of_N_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Numer : ");
        int N = in.nextInt();
        int avg=0;
        for(int i=0;i<N;++i){
            System.out.print("Enter " + i+1 +"th no : ");
            int n= in.nextInt();
            avg+=n;
        }
        System.out.print("Average of "+N+" number is : "+(int)avg/N);
    }
}
