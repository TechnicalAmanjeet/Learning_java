package com.Amanjeet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a_1403 {
    class Solution {
        public List<Integer> minSubsequence(int[] nums) {
            List<Integer> out = new ArrayList<>();
            Arrays.sort(nums);
            int start=1,end=nums.length-1,startsum=nums[0],endsum=nums[nums.length-1];
            out.add(endsum);
            while (start<end){
                start++;
                startsum+=nums[start];
                if(endsum<startsum){
                    end--;
                    endsum+=nums[end];
                    out.add(nums[end]);
                }
                System.out.println(startsum+" "+endsum+" "+start+" "+end);
            }
            return out;
        }
    }
}
