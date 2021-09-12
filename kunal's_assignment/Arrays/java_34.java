package com.Arrays;

public class java_34 {
    class Solution {
        public int findGCD(int[] nums) {
            int min=99999,max=0;
            for (int i=0;i<nums.length;++i){
                min = Math.min(min,nums[i]);
                max= Math.max(max,nums[i])
            }
            System.out.println(min+" "+max);
            while (max%min!=0){
                int temp = min;
                min = max%min;
                max = temp;
            }
            return min;
        }
    }
}
