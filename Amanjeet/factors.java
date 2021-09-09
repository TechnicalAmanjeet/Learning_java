package com.Amanjeet;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = in.nextInt();
        System.out.print("Factor of " + num + " is : ");
        for(int i=1;i<=num/2;i++){
            if(num%i==0) System.out.print(" " +i+" ");
        }
        System.out.print(" " +num+" ");
    }
}
