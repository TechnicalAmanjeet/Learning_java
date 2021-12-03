package com.searching;

public class s_540 {
    class Solution {
        public int singleNonDuplicate(int[] nums) {

            for(int i=0;i<nums.length;i+=2){
                if(i< nums.length-1 && nums[i]!=nums[i+1]) return nums[i];
            }
            return nums[nums.length-1];
        }
    }
}
