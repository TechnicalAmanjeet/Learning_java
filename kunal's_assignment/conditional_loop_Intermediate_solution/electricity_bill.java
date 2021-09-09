package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;

public class electricity_bill {
    // kunals intermediate assignment no. 2
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your electrical consumption per day in watt : ");
        double ewatth = in.nextDouble();
        double kwh = ewatth/1000;
        System.out.print("Enter electricity rate per kwh : ");
        double rate = in.nextDouble();
        System.out.println("Your Electricity bill : " + kwh*rate );


    }
}
