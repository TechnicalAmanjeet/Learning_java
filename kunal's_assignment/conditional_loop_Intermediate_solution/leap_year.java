package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;

public class leap_year {
    // q. 24
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year's Value  : ");
        int year = in.nextInt();
        if((year%400==0) ||(year%4==0 && year%100!=0)){
            System.out.println(year+" is a leap year");
        }
        else {
            System.out.println(year+" is not a leap year");
        }
    }
}
