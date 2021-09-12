package com.Arrays;

public class array_22_1304 {
    // q. 22
    public static void main(String[] args) {

    }
    class Solution {
        public int[] sumZero(int n) {


            int[] ans = new int[n];
            for(int i=0; i<n-1; i+=2) {
                ans[i]  = (i+1);
                ans[i+1] = -(i+1);
            }
            return ans;
        }
    }
}
