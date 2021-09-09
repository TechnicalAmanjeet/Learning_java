package com.functions;

import java.util.Scanner;

public class voting_criteria {
    // q. 3
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = in.nextInt();
        System.out.println("You are "+vote(age)+" eligible to vole");
    }

    private static String vote(int age) {
        if(age<18) return "not";
        else return "";
    }


}
