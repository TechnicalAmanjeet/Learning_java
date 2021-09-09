package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;

public class discount_prod {
    // q 4
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter total product Cost : ");
        double product_cost = in.nextDouble();
        System.out.print("Enter total discount you give in percentage : ");
        double percent = in.nextDouble();
        double user_cost = product_cost - (product_cost*percent)/100;
        System.out.println("Your total price after discount is : " + user_cost);
    }
}
