package com.Conditional_loop;

import java.util.Scanner;

// solved kunals basic q. 24
public class Sum_User_input_till_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum =0;
        System.out.println("start entering number : ");
        int n=in.nextInt();
        while (n!=0){
            sum+=n;
            n=in.nextInt();
        }
        System.out.println("Total sum is " + sum);
    }
}
