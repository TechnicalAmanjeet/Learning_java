package com.Arrays;

import java.util.Arrays;

public class array_33 {
    class Solution {
        public int maxProductDifference(int[] nums) {
            int max=0,min=99999999;
            for(int i=0;i<nums.length-1;++i){
                for (int j=i+1;j<nums.length;++j){
                    if(nums[i]*nums[j]>max) max=nums[i]*nums[j];
                    if(nums[i]*nums[j]<min) min=nums[i]*nums[j];

                }
            }
            return max-min;
        }
    }class Solution {
        public int maxProductDifference(int[] nums) {
            Arrays.sort(nums);
            System.out.println(nums);
            int max= nums[nums.length-1]*nums[nums.length-2];
            int min=nums[0]*nums[1];
            return max-min;
        }
    }
}
