package com.Amanjeet;

public class a_961 {
    class Solution {
        public int repeatedNTimes(int[] nums) {
            int[] arr = new int[10001];
            for(int e:nums){
                arr[e]++;
                if(arr[e]>=2) return e;
            }
            return nums[0];
        }
    }
}
