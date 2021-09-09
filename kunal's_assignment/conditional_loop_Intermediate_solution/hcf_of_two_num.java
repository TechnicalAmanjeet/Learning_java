package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;

public class hcf_of_two_num {
//    q. 20
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
    if(second%first==0) System.out.println("hcf : "+second/first);
    else {
        for(int i=first-1;i>0;--i){
            if(first%i==0 && second%i==0){
                System.out.println("Hcf : "+i);
                return;
            }
        }
    }
}
}
