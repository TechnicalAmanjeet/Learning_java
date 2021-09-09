package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;

public class palindrome {
    // q. 18
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int org_num = in.nextInt();
        int temp = org_num;
        int rev_num =0;
        int i=0;
        while (temp>0){
            rev_num=(rev_num*10)+temp%10;
            temp/=10;
        }
        System.out.println("reverse num : " + rev_num);
        if(rev_num==org_num) System.out.println(org_num+" is a palindrome num.");
        else System.out.println(org_num+" is not a palindrome num.");
    }
}
