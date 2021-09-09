package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;

public class depritiation_value {
    public static void main(String[] args) {
        // q. 8
        Scanner in = new Scanner(System.in);
        System.out.print("value of your Asset : ");
        double cost_Asset = in.nextDouble();
        System.out.print("Residual Value : ");
        double residual = in.nextDouble();
        System.out.println("Life of an asset : ");
        double life = in.nextDouble();
        double depritiation = (cost_Asset - residual)/life;
        System.out.println("Depritiation : "+ depritiation);
    }
}
