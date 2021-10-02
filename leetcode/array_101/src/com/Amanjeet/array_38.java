package com.Amanjeet;

import java.util.ArrayList;
import java.util.List;

public class array_38 {
    class Solution {
        public int[] sortArrayByParity(int[] nums) {
            List<Integer> list = new ArrayList<>();
            int count =0,i=0;
            while (i<nums.length){
                if(nums[i]%2==0){
                    nums[count++]=nums[i];
                }
                else {
                    list.add(nums[i]);
                }
                ++i;
            }
            i=0;
            while (i<list.size()){
                nums[count++] = list.get(i);
                i++;
            }
            return nums;
        }
    }

}
