package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;

public class sum_of_digit {
    // q. 25
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        int org_num = num;
        int sum_num =0;
        while (num>0){
            sum_num+=num%10;
            num/=10;
        }
        System.out.println("Sum of digit "+ org_num +" is "+sum_num);
    }
}
