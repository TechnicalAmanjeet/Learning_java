package com.Arrays;

public class array_34_1250 {
    class Solution {
        public boolean isGoodArray(int[] nums) {
            for(int i=1;i<nums.length;++i){
                if(nums[i]%nums[0]!=0 || nums[0]%nums[i]!=0) return true;
            }
            return false;
        }
    }
}
