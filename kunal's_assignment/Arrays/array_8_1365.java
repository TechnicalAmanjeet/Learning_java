package com.Arrays;

public class array_8_1365 {
    // q. 8
    public static void main(String[] args) {

    }

    // time => o(n^2)
    class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] ans = new int[nums.length];
            for (int i=0;i<nums.length;++i){
                for (int j=0;j<nums.length;++j){
                    if(nums[i]>nums[j] && i!=j){
                        ans[i]++;
                    }
                }
            }
            return ans;
        }
    }

    // time => o(n)
    class Solution {
        // time => o(n^2)
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] ans = new int[nums.length];
//        int[] box = new int[102];
            for (int i=0;i<nums.length;++i){
                box[nums[i]+1]++;
            }
            for (int i=1;i<102;++i){
                box[i]+=box[i-1];
            }
            for (int i=0;i<nums.length;++i){
                nums[i]=box[nums[i]];
            }
            return nums;
        }
    }
}
