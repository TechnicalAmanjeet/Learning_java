package com.conditional_loop_Intermediate_solution;

import java.util.Scanner;

public class sum_in_a_list {
    // q. 27
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter as many no. you want (till 0) : ");
        int num ;
        int even_sum =0, odd_sum=0, negetive_sum=0;
        num = in.nextInt();
        while (num!=0){
            if(num<0) negetive_sum+=num;
            else if(num%2==0) even_sum+=num;
            else odd_sum +=num;
            num = in.nextInt();
        }
        System.out.println("Even Sum : "+ even_sum);
        System.out.println("odd sum : "+odd_sum);
        System.out.println("negetive sum : "+ negetive_sum);
    }
}
