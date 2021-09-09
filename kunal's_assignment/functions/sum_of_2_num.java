package com.functions;

import java.util.Scanner;

public class sum_of_2_num {
    // q. 4
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two number : ");
        int first = in.nextInt();
        int second = in.nextInt();
        System.out.println("Sum : "+sumoftwo(first,second));
    }

    private static int sumoftwo(int first, int second) {
        return first+second;
    }
}
