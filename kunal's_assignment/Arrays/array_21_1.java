package com.Arrays;

public class array_21_1 {
    // q. 1
    public static void main(String[] args) {

    }
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int x=-1,y=-1;
            for(int i=0;i<nums.length;++i){
                for(int j=i+1;j<nums.length;++j){
                    if(nums[i]+nums[j]==target){
                        x=i;
                        y=j;
                        break;
                    }
                }
                if(x!=-1) break;
            }
            int[] ans={x,y};
            return ans;
        }
    }
}
