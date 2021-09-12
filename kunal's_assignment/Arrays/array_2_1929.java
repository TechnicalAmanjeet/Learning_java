package com.Arrays;

public class array_2_1929 {
    public static void main(String[] args) {

    }
    // simple approach.
    class Solution {
        public int[] getConcatenation(int[] nums) {
            int n=2*nums.length;
            int[] ans = new int[n];
            for(int i=0;i<n/2;++i){
                ans[i]=nums[i];
            }
            for(int i=n/2;i<n;++i){
                ans[i]=nums[i-n/2];
            }
            return ans;
        }
    }
    // high level approach
    class Solution {
        public int[] getConcatenation(int[] nums) {
            int n=2*nums.length;
            int[] ans = new int[n];
            for(int i=0;i<n/2;++i){
                ans[i]=nums[i];
                ans[i+n/2]=nums[i];
            }
            return ans;
        }
    }
}
