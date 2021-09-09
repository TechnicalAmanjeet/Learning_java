package com.Amanjeet;

import java.util.Scanner;

public class sumofnum {
    public static void main(String[] args) {
        System.out.println("Enter a num : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("The sum of "+num+" is "      + sum);
        System.out.println("The sum of "+num+" is "      + (num*(num+1))/2);
    }
}
