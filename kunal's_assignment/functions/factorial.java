package com.functions;

import java.util.Scanner;

public class factorial {
    // q. 10
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = in.nextInt();
        System.out.println("Factorial of "+num+" is "+ fact(num));
        System.out.println("Factorial of "+num+" is "+ fact_recursive(num));
    }

    private static long fact_recursive(int num) {
        if(num==1 || num==0) return  1;
        return num*fact(num-1);
    }

    private static long fact(int num) {
        long fact=1;
        if(num==0 || num==1) fact=1;
        else {
            for(int i=1;i<=num;++i){
                fact*=i;
            }
        }
        return fact;
    }
}
