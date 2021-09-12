package com.Arrays;

import java.util.Scanner;

public class array_1_1920 {
    // q1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
    public int[] buildArray(int[] nums) {
        int[] num=new int[nums.length];
        for(int i=0;i<nums.length;++i){
            num[i]=nums[nums[i]];
        }
        return num;
    }
}
