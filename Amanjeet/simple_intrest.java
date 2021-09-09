package com.Amanjeet;

import java.util.Scanner;

public class simple_intrest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principle Amount : ");
        double p = in.nextDouble();
        System.out.print("Enter rate : ");
        double r = in.nextDouble();
        System.out.print("Enter time : ");
        double t = in.nextDouble();
        System.out.println("Simple intrest is " +          (int)(p*(1+(r*t))));
    }
}
