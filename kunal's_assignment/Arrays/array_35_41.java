package com.Arrays;

public class array_35_41 {
    class Solution {
        public int firstMissingPositive(int[] nums) {
            int[] arr = new int[Integer.MAX_VALUE];
            System.out.println(Integer.MAX_VALUE);
            for(int i=0;i<nums.length;++i){
                if(nums[i]>=0) arr[nums[i]]++;
            }
            for(int i=0;i<arr.length;++i){
                if(arr[i]==0) return i;
            }
            return 0;
        }
    }
}
