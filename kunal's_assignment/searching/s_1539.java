package com.searching;

public class s_1539 {
    class Solution {
        public int findKthPositive(int[] arr, int k) {
            int[] out=new int[1000001];
            for(int element:arr) out[element]+=1;
            int i=1,prev=1;
            while (k>0){
                if(out[i]==0){
                    prev=i;
                    k--;
                }
                ++i;
            }
            return prev;
        }
    }
}
