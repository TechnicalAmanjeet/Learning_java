package com.Amanjeet;

import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What do you want to perform : ");
//        String str = in.next();
        char ch = in.nextLine().charAt(0);
        if(ch=='+' || ch =='-' || ch=='*' || ch=='/' || ch=='%' ){
            int a,b;
            System.out.print("Enter to num : ");
            a=in.nextInt();
            b=in.nextInt();
            int result = a+b;
            if(ch=='-') result=a-b;
            else if(ch=='*') result = a*b;
            else if(ch=='/') result = a/b;
            else if(ch=='%') result = a%b;
            System.out.println("Result : "+ result);
        }
        else System.out.println("   YOU hava choosen wrong operation.");
    }
}
