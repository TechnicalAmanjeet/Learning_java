package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;

public class find_ncr_npr {
    // q. 16
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your no. : ");
        int num = in.nextInt();
        System.out.print("Enter your r : ");
        int r = in.nextInt();
        int npr = factorial(num)/factorial(num-r);
        int ncr = npr/factorial(r);
//        System.out.print("Factorial of num : "+factorial(num));
        System.out.println("npr : "+npr);
        System.out.print("ncr : "+ncr);
    }

    private static int factorial(int n){
            int num=1;
        if(n==1 || n==0) return 1;
        else {
            for(int i=1;i<=n;++i) num*=i;
        }
        return num;
    }
}
