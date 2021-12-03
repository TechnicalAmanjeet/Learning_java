package com.Amanjeet;

public class a_1748 {
    class Solution {
        public int sumOfUnique(int[] nums) {
            int[] arr = new int[101];
            for(int e:nums) arr[e]++;
            int sum=0;
            for(int i=0;i<=101;++i){
                if(arr[i]==1) sum+=i;
            }
            return sum;
        }
    }
}
