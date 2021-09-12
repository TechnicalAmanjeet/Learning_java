package com.Arrays;

public class array_7_1512 {
    // q. 7
    public static void main(String[] args) {

    }

    class Solution {
        public int numIdenticalPairs(int[] nums) {
            int good=0;
            for(int i=0;i<nums.length;++i){
                for (int j=i+1;j<nums.length;++j){
                    if(nums[i]==nums[j]) good+=1;
                }
            }
            return good;
        }
    }

    // time => o(n)
    class Solution {
        public int numIdenticalPairs(int[] nums) {
            int[] ans= new int[101];
            for(int num : nums) ans[num]+=1;
            int good=0;
            for (int num:ans) {
                good+=(num*(num-1))/2;
            }
            return good;
        }
    }
}
