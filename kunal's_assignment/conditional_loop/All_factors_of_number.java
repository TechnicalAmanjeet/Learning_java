package com.Conditional_loop;

import java.util.Scanner;
// solved kunals basic q. 23
public class All_factors_of_number {
    public static void main(String[] args) {
        System.out.println("Amanjeet loves whom??");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = in.nextInt();
        All_factor(number);
    }

    private static void All_factor(int number) {
        for(int i=1;i<=number/2;i++){
            if(number%i==0){
                System.out.println(i);
            }
        }
        System.out.println(number);
    }
}
