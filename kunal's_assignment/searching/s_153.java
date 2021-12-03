package com.searching;

public class s_153 {
    class Solution {
        public int findMin(int[] nums) {
            int s=nums.length;
            if(s==1) return nums[0];
            else if(s==2) return Math.min(nums[0],nums[1]);
            else {
                for(int i=1;i<s;++i){
                    if(nums[i]<nums[i-1]) return nums[i];
                }
            }
            return nums[0];
        }
    }
}
