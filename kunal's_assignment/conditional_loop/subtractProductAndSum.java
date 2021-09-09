package com.Conditional_loop;

import java.util.Scanner;
// solved kunals assignment basic q. 22
public class subtractProductAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer Number : ");
        int n = in.nextInt();
        int sum=0;
        int prod =1;
        while (n>0){
            sum+=n%10;
            prod*=n%10;
            n/=10;
        }
        System.out.println(prod-sum);
    }

//    private static int[] prodAndSum(int n) {
//        int[] a={0,1}; // a[0] for sum and a[1] for product
//////        System.out.println("initilally : ");
////        while (n>0){
////            a[0]+=n%10;
////            a[0]*=n%10;
////            n/=10;
////        }
////
////        return a;
////    }
}
