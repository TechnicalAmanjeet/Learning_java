package com.Arrays;

public class Array_27_238 {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int prod = 1,iszero=0;
            // multyplyin all element - {0} product and note down if 0 present in array or not.
            for(int element : nums){
                if(element!=0) prod*=element;
                else iszero++;
            }
            if(iszero==0){
                for(int i=0;i<nums.length;++i){
                    nums[i]=prod/nums[i];
                }
            }
            else {
                for(int i=0;i<nums.length;++i){
                    if(nums[i]==0 && iszero==1) nums[i]=prod;
                    else nums[i]=0;
                }
            }
            return nums;
        }
    }
}















