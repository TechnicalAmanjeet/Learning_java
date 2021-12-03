package com.searching;

public class s_1608 {
    class Solution {
        public int specialArray(int[] nums) {
            int arr[] = new int[1001];
            for(int num:nums){
                arr[num]++;
            }
            for(int i=999;i>0;--i){
                arr[i]+=arr[i+1];
                if(arr[i]==i) return i;
            }
            return -1;
        }
    }
}
