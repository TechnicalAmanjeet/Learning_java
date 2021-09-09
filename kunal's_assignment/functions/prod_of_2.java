package com.functions;

import java.util.Scanner;

public class prod_of_2 {
    // q. 5
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two num : ");
        int first = in.nextInt();
        int second = in.nextInt();
        System.out.println("Product : "+prod_of(first,second));
    }

    private static int prod_of(int first, int second) {
        return first*second;
    }
}
