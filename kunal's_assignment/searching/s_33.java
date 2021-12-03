package com.searching;

public class s_33 {
    class Solution {
        public int search(int[] nums, int target) {
            int s=nums.length;
            for(int i=0;i<=s/2;++i){
                if(nums[i]==target) return true;
                else if(nums[s-i-1]==target) return true;
            }
            return false;
        }
    }
}
