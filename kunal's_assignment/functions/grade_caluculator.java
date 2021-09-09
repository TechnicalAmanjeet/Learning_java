package com.functions;

import java.util.Scanner;

public class grade_caluculator {
    // q. 8
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = in.nextInt();
        System.out.println("Your grade is "+grade(marks));
    }

    private static String grade(int marks) {
        if(marks>90) return "AA";
        else  if(marks>80) return "AB";
        else  if(marks>70) return "BB";
        else  if(marks>60) return "BC";
        else  if(marks>50) return  "CC";
        else  if(marks>40) return  "CD";
        else if(marks>30)return "DD";
        else return  "Fail";
    }
}
