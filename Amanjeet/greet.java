package com.Amanjeet;

import java.util.Scanner;

public class greet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a name to greet : ");
        String name = in.next();
        System.out.println("Hii "+name);
    }
}
