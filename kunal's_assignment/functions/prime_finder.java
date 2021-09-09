package com.functions.prime_no;

import java.util.Scanner;

public class _finder {
    // q. 7
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        System.out.println(num+" is "+prime(num)+" a prime number");
    }

    private static String prime(int num) {
        if(num==1 || num==2) return "";
        else {
            for (int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0) return "not";
            }
        }
        return "";
    }
}
