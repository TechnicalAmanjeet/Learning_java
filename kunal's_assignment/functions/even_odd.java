package com.functions;

import java.util.Scanner;

public class even_odd {
    // q. 2
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num= in.nextInt();
        System.out.println(num +" is "+evenOrOdd(num));
    }

    private static String evenOrOdd(int num) {
        if(num%2==0) return "even";
        else return "odd";
    }
}
