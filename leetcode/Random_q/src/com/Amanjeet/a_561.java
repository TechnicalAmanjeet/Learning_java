package com.Amanjeet;

import java.lang.reflect.Array;
import java.util.Arrays;

public class a_561 {
    class Solution {
        public int arrayPairSum(int[] nums) {
            int out=0;
            Arrays.sort(nums);
            for(int i=0;i<nums.length;i+=2) out+=nums[i];
            return out;
        }
    }
}
