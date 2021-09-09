package com.functions;

import java.util.Scanner;

public class max_min {
    // q. 1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three number : ");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println("Max : "+ max(a,b,c));
        System.out.println("Min " + min(a,b,c));
    }
    private static  int max(int a,int b,int c){
        if(a>b && a>c) return a;
        else if(b>c) return b;
        return c;
    }private static  int min(int a,int b,int c){
        if(a<b && a<c) return a;
        else if(b<c) return b;
        return c;
    }
}
