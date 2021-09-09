package com.functions;

import java.util.Scanner;

public class pythagoras_triplaet {
    // q. 12
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three number : ");
        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();
        int a,b,c;
        if(first>=second && first>=third) {
            a= second; b =third; c= first;
        }
        else  if (second>=first && second>=third){
            a=first;b=third ; c=second;
        }
        else {
            a=first;b=second;c=third;
        }
        System.out.println(a+" "+b+" "+c);
        System.out.println(first+" "+second+" and "+third + " is "+pythagon(a,b,c)+" pythagorean trplet" );
    }

    private static String pythagon(int a, int b, int c) {
        if((a*a + b*b)==c*c) return "";
        else return " not ";
    }
}
