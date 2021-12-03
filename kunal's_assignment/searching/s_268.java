package com.searching;

public class s_268 {
    class Solution {
        public int missingNumber(int[] nums) {
            int sum=0;
            for(int e:nums) sum+=e;
            return (int) ((nums.length*(nums.length+1))/2)-sum;
        }
    }
}
