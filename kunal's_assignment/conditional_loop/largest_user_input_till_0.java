package com.Conditional_loop;

import java.util.Scanner;
// solved kunals basic q. 25
public class largest_user_input_till_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int largest =-999999999;
        System.out.println("start entering number : ");
        int n=in.nextInt();
        while (n!=0){
            if(largest<n){
                largest=n;
            }
            n=in.nextInt();
        }
        System.out.println("Total sum is " + largest);
    }
}
