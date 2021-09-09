package com.Amanjeet;

import java.util.Scanner;

public class userchoice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum =0;
        while (true){
            System.out.print("Enter num (if 0 then exit) : ");
            int num = in.nextInt();
            sum+=num;
            if(num==0) break;
        }
        System.out.println("Sum is : "+sum);
    }
}
