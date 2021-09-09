package com.Amanjeet;

import java.util.Scanner;

public class maxof3adv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Three num : ");
        int fst,snd,trd;
        fst = in.nextInt();
        snd = in.nextInt();
        trd = in.nextInt();
        System.out.println("Sum of "+fst+" "+snd+" "+trd+   " is " + Math.max(fst,Math.max(snd,trd)) );
    }
}