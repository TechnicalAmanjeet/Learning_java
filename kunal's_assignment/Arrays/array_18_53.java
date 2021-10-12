package com.Arrays;

public class array_18_53 {
    class Solution {
        public int maxSubArray(int[] nums) {
            int output_sum=nums[0],current_sum=0;
            for(int i=0;i<nums.length;++i){
                current_sum = Math.max(nums[i],nums[i]+current_sum );
                output_sum = Math.max(current_sum,output_sum);
            }
            return output_sum;
        }
    }
}
