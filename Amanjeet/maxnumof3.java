package com.Amanjeet;

import java.util.Scanner;

public class maxnumof3 {
    public static void main(String[] args) {
        int first,second,third;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first Num : ");
        first = in.nextInt();
        System.out.print("Enter second Num : ");
        second = in.nextInt();
        System.out.print("Enter Third Num : ");
        third = in.nextInt();
        int max = first;
        if(first<second){
            if(second<third) max = third;
            else max = second;
        }
        else {
            if(first<third) max = third;
        }
        System.out.println("Maximum of "+first+" "+second+" "+third +"  is "+max);
    }
}