package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;

public class perfect_number {
    // q. 23
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int org_num = in.nextInt();
        int dubli = org_num;
        int sum =0;
        for(int i=1;i<=dubli/2;++i){
            if (org_num%i==0) sum+=i;
        }
        if(sum==org_num) System.out.println(org_num+" is a perfect number.");
        else System.out.println(org_num+" is not a perfect num.");
    }
}
