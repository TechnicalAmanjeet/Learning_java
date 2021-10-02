package com.Amanjeet;

public class array_39 {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int count =0,i=0,count_val=0;
            while (i<nums.length){
                if(nums[i]!=val) nums[count++]=nums[i];
                else count_val++;
                i++;
            }
            return count_val;
        }
    }
}
