package com.Amanjeet;

public class a_496 {
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int[] out = new int[nums1.length];
            for(int i=0;i<nums1.length;++i){
                int element = nums1[i],j=0;
                for(j=0;j<nums2.length;++j){
                    if(nums2[j]==element) break;
                }
                int num = -1;
                for(int k=j;k<nums2.length;++k){
                    if(element<nums2[k]){
                        num=nums2[k];
                        break;
                    }
                }
                out[i]=num;
            }
            return out;
        }
    }
}
