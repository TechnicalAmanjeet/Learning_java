package com.Arrays;

public class array_3_1480 {
    // q. 3
    public static void main(String[] args) {

    }
    class Solution {
        public int[] runningSum(int[] nums) {
            for(int i=1;i<nums.length;++i){
                nums[i]+=nums[i-1];
            }
            return nums;
        }
    }
}
