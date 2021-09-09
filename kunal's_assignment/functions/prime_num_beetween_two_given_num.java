package com.functions;

import java.util.Scanner;

public class prime_num_beetween_two_given_num {
    // q. 13
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two number : ");
        int first = in.nextInt();
        int second = in.nextInt();
        System.out.println("Prime num beetwwen "+first+" and "+second+" are as follows ");
        prime(first,second);
    }

    private static void prime(int first, int second) {
        for(int i=first;i<=second;++i){
            if(isprime(i)) System.out.print(i+" ");
        }
    }

    private static boolean isprime(int i) {
        if(i==1 || i==2) return true;
        else {
            for(int j=2;j<=Math.sqrt(i);++j){
                if(i%j==0) return false;
            }
        }
        return true;
    }
}
