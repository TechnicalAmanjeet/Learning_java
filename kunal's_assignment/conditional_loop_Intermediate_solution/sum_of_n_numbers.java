package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;

public class sum_of_n_numbers {
    // q. 14
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many no. do you want to sum : ");
        int num = in.nextInt();
        double sum = 0;
        for(int i=0;i<num;++i){
            System.out.print("Enter "+i+"th no ; ");
            sum+= in.nextDouble();
        }
    }
}
