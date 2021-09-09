package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;

public class avg_batting {
    // q. 9
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many matches did he/she play : ");
        int no_of_match = in.nextInt();
        double sum = 0;
        for(int i=0;i<no_of_match;++i){
            System.out.print("Enter "+i+"th match run : ");
            int run = in.nextInt();
            sum += run;
        }
        System.out.println("the Avg value of this batsman : "+sum/no_of_match);
    }
}
