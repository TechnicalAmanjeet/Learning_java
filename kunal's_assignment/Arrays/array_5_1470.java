package com.Arrays;

public class array_5_1470 {
    // q. 5
    public static void main(String[] args) {

    }
    // space 0(n)
    class Solution {
        // solution time=>o(n) space => 0(1)
        public int[] shuffle(int[] nums, int n) {
            int[] ans = new int[2*n];
            for(int i=0;i<n;++i){
                ans[2*i]=nums[i];
                ans[2*i+1]=nums[i+n];
            }
            return ans;
        }
    }

    // space o(1)
    class Solution {
        // solution time=>o(n) space => 0(1)
        public int[] shuffle(int[] nums, int n) {

            int t = 1100;
            for(int i=n;i<2*n;++i) nums[i]=nums[i]+nums[i-n]*t;

            int temp=0;
            for(int i=n;i<2*n;++i){
                nums[temp]=nums[i]/t;
                nums[temp+1]=nums[i]%t;
                temp+=2;
            }
            return nums;
        }
    }
}
