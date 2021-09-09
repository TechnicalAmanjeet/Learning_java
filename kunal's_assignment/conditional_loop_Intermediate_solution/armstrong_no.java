package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;

public class armstrong_no {
    // q. 15
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = in.nextInt();
        int temp = num;
        int sum=0;
        while (temp>0){
            sum+=Math.pow(temp%10,3);
            temp/=10;
            System.out.print(sum+" ");
        }
        if(sum==num){
            System.out.println(num+" is an armstrong number.");
        }
        else System.out.println(num +" is not an armstrong number.");
    }
}
