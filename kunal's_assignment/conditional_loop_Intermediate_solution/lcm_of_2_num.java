package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;

public class lcm_of_2_num {
    // q. 21
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two num : ");
        int first = in.nextInt();
        int second = in.nextInt();
        if(first>second){
            int temp=second;
            second = first;
            first= second;
        }
        int hcf =0;
        if(second%first==0){
            hcf = second/first;
        }
        else {
            for(int i=first-1;i>0;--i){
                if(first%i==0 && second%i==0){
                    hcf = i;
                }
            }
        }
        System.out.println("Lcm : "+(first*second)/hcf);
    }
}
