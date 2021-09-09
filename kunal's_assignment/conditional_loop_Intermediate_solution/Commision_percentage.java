package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;

public class Commision_percentage {
    // q. 6
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Total money : ");
        double total_money = in.nextDouble();
        System.out.print("Enter Money after commitsion : ");
        double com_money = in.nextDouble();
        com_money = total_money-com_money;

        double comm_percentage = (com_money/total_money)*100;

        System.out.println("Commission : " + (int)comm_percentage+" %.");
    }
}
