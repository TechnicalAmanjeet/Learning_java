package com.searching;

public class s_287 {
    class Solution {
        public int findDuplicate(int[] nums) {
            int[] arr=new int[nums.length];
            for(int i=0;i<nums.length;++i){
                arr[nums[i]]+=1;
                if(arr[nums[i]]==2) return nums[i];
            }
            return 0;
        }
    }
}
