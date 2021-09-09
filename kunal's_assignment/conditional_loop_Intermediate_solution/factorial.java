package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;

public class factorial {
    // kunals intermediate assignment no. 1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer number : ");
        int num = in.nextInt();
        int fact = 1;
        if (num != 0) {
            for (int i = 1; i <= num; ++i) {
                fact *= i;
            }
        }
            System.out.println("Factorial : " + fact);
    }
}
