package com.Amanjeet;

public class even_digit_array {
    class Solution {
        public int findNumbers(int[] nums) {
            int ans=0;
            for(int i=0;i<nums.length;++i){
                double num=Math.log10(nums[i])+1;
                System.out.print(num);
                if(num%2==0) ans++;
            }
            return ans;
        }
    }
}
