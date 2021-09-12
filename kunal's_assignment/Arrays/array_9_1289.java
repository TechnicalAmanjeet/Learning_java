package com.Arrays;

public class array_9_1289 {
    // q.9
    public static void main(String[] args) {

    }
    class Solution {
        public int[] createTargetArray(int[] nums, int[] index) {
            int[] target = new int[nums.length];
            for (int i=0;i<nums.length;++i){
                int t = index[i];
                int temp1=target[t];
                ++t;
                while (t<nums.length){
                    int temp2 = target[t];
                    target[t]=temp1;
                    temp1=temp2;
                    ++t;
                }
                target[index[i]]=nums[i];
            }
            return target;
        }
    }
}
