package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;

public class vovel_or_consonant {
    // Q. 22
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an alphabet : ");
        char ch1 = in.next().charAt(0);
        char  ch = Character.toLowerCase(ch1);
        if(ch=='a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println(ch1 +" is a volvel.");
        }
        else System.out.println(ch1 +" is not a volvel");
    }
}
