package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;

public class reverse_string {
    // q. 17
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you string : ");
        String str = in.nextLine();
        for(int i=str.length()-1;i>=0;--i){
            System.out.print(str.charAt(i)+" ");
        }
    }
}
