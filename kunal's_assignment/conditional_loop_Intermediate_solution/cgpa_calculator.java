package com.conditional_loop_Intermediate_solution;

import java.text.DecimalFormat;
import java.util.Scanner;

public class cgpa_calculator {
    // q. 10
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Total how many semester you have done : ");
        int sem = in.nextInt();
        double sum =0;
        for (int i=0;i<sem;++i){
            System.out.print("Enter your "+(i+1)+"th sem sgpa value : ");
            sum+=in.nextDouble();
        }
//        System.out.println("Your current cgpa is " + Math.round(sum/sem));
        DecimalFormat dt = new DecimalFormat("#.##");
        System.out.println("Your current cgpa is " + dt.format(sum/sem));
    }
}
