package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;

public class power {
    // q. 7
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter value of current (in Amp) : ");
        double current = in.nextDouble();
        System.out.print("enter value of resistnce (in ohm) : ");
        double resistance = in.nextDouble();
        System.out.print("enter value of time  (in H) : ");
        double time = in.nextDouble();
        double power = current*current*resistance*time;
        System.out.println("power value is " + power);
    }
}
