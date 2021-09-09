package com.Amanjeet;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = in.nextInt();
        if(num%2==0) System.out.println(num + " is even." );
        else System.out.println(num+ " is odd.");
    }
}
