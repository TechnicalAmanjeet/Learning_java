package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    class Solution {
        public void rotate(int[] nums, int k) {
            k=k%nums.length;
            int[] out = new int[nums.length];
            for(int i=0;i<k;++i){
                out[i]=nums[nums.length-k+i];
            }
            for (int i=k;i<nums.length;++i){
                out[i]=nums[i-k];
            }
            for(int i=0;i<nums.length;++i){
                nums[i]=out[i];
            }
        }
    }
}

































