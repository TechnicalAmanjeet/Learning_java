package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;

public class future_value {
    // q. 19
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter investment : ");
        double invest = in.nextDouble();
        System.out.print("Enter intrest rate : ");
        double rate = in.nextDouble();
        rate/=100;
        System.out.print("Enter Time : ");
        double time = in.nextDouble();
        double future_value = invest*(1+(rate*time));
        System.out.println("YOur future value will be : "+future_value);
    }
}
