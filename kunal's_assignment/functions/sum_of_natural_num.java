package com.functions;

import java.util.Scanner;

public class sum_of_natural_num {
    // q. 14
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = in.nextInt();
        System.out.println("Sum of first "+num +" is "+sum(num));
    }

    private static long sum(int num) {
        return num*(num+1)/2;
    }
}
