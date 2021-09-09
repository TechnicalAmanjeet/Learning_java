package com.Conditional_loop;

import java.util.Scanner;

// Solved kunals assignment basic q. 21
public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Amanjeet loves Whom??");
        System.out.print("Enter no. till that fibo number to show : ");
        int x = in.nextInt();
        fibo(x);
    }
    // printing all fibonacci number before given number n.
    private static void fibo(int n) {
        int a = 0, b = 1;
        if (n < 0) {
            System.out.println("There is no fibo no. before 0");
            return;
        }
        else if (n < 1) {
            System.out.println("Fibo number is : "+ a);
            return;
        }
        else {
            System.out.println("fibo number are : ");
            System.out.println(a);
            System.out.println(b);
            while (a+b<=n){
                System.out.println(a+b);
                int temp = a;
                a=b;
                b+=temp;
            }
        }

    }


}
