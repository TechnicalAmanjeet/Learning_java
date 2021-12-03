package com.Amanjeet;

import java.util.Arrays;

public class A_1464 {
    class Solution {
        public int maxProduct(int[] nums) {
            Arrays.sort(nums);
            return (nums[nums.length-1]-1)*(nums[nums.length-1]-1);
        }
    }
}
