package com.functions;

import java.util.Scanner;

public class palindrome_num {
    // q. 10
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a nUmber : ");
        int num = in.nextInt();
        System.out.println(num+ " is "+palindrome(num)+" a palindrome number.");
    }

    private static String palindrome(int num) {
        if(num==reverse_num(num)) return  "";
        else return "not";
    }

    private static int reverse_num(int num) {
        int rev_num=0;
        while (num>0){
            rev_num = rev_num*10+num%10;
            num/=10;
        }
        return rev_num;
    }
}
