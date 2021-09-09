package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;

public class distace_bw_two_points {
    // q. 5
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter 1st point co-ordinate : ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        System.out.print("Enter 2nd point co-ordinate : ");
        double x2= in.nextDouble();
        double y2 = in.nextDouble();

        double diff_in_x = x2-x1;
        double diff_in_y = y2-y1;

        diff_in_x= Math.pow(diff_in_x,2);
        diff_in_y=Math.pow(diff_in_y,2);

        double distance = diff_in_y + diff_in_x;
        distance = Math.sqrt(distance);
        System.out.println("Distance b/w ("+x1+" , "+y1+" ) and ( "+x2+" , "+y2+" ) is "+distance);
    }
}
