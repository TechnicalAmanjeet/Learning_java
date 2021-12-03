package com.searching;

public class s_136 {
    class Solution {
        public int singleNumber(int[] nums) {
            int[][] arr=new int[30005][2];
            for(int i=0;i<nums.length;++i){
                if(nums[i]>=0){
                    arr[nums[i]][0]++;
                }
                else arr[Math.abs(nums[i])][1]++;
            }
            for(int i=0;i<nums.length;++i){
                if(nums[i]>=0){
                    if(arr[nums[i]][0]==1) return nums[i];
                }else {
                    if(arr[Math.abs(nums[i])][1]==1) return nums[i];
                }
                // if(arr[Math.abs(nums[i])][0]==1 || arr[Math.abs(nums[i])][1]==1 ) return nums[i];
            }
            return nums[0];
        }
    }
}
