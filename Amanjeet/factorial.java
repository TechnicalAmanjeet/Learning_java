package com.Amanjeet;

//import java.util.Scanner;


import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter a num : ");
        try (Scanner in = new Scanner(System.in)) {
            num = in.nextInt();
        }
        int fact=1;
        for(int i=1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println("The factorial of "+ num + " is "+ fact);
    }
}
