package com.Amanjeet;

import java.util.Scanner;

public class userchoicel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum =-1e8;
        while (true){
            System.out.print("Enter num (if 0 then exit) : ");
            int num = in.nextInt();
            if(num>=sum) sum=num;
            if(num==0) break;
        }
        System.out.println("gratest is : "+(int)(sum));
    }
}
