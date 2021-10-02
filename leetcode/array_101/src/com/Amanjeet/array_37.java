package com.Amanjeet;

public class array_37 {
    class Solution {
        public void moveZeroes(int[] nums) {
            int count =0,i=0,zero=0;
            while (i<nums.length){
                if(nums[i]!=0){
                    nums[count++]=nums[i];
                }
                else ++zero;
            }
            i=nums.length-1;
            while (zero>0){
                nums[i--]=0;
                zero--;
            }
        }
    }
}
