package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;

public class compound_intrest {
    // q. 11
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your principal balance : ");
        double principal_balance = in.nextDouble();
        System.out.print("Enter your intrest rate ; ");
        double intrest_rate = in.nextDouble();
        intrest_rate/=100;
        System.out.print("Enter time duration : ");
        int time = in.nextInt();
        System.out.print("no. of times intrest applied per time period : ");
        double n = in.nextDouble();
        double compound_intrest = (1+(intrest_rate/n));
        compound_intrest = Math.pow(compound_intrest,n*time)*principal_balance;
        System.out.println("compound Intrest : "+ compound_intrest);
    }
}
