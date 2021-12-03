package com.searching;

public class s_441 {
    class Solution {
        public int arrangeCoins(int n) {
            long sum=0;
            int i=0;
            while(sum<n){
                sum+=i;
                ++i;
                // System.out.println(sum+" "+i);
            }
            if(sum==n) return i-1;
            return i-2;
        }
    }
}
