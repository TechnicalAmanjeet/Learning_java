package com.conditional_loop_Intermediate_solution;

import java.text.DecimalFormat;
import java.util.Scanner;

public class avg_marks {
    // q. 12
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many subject do you study : ");
        int no_sub = in.nextInt();
        double avg =0;
        for (int i=0;i<no_sub;++i){
            System.out.print("Enter "+i+"th sub marks : ");
            avg+=in.nextDouble();
        }
        DecimalFormat df = new DecimalFormat("##.##");
        System.out.println("Your avg Marks is : "+df.format(avg/no_sub));
    }
}
