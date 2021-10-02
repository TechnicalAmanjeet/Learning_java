package com.Amanjeet;

public class max_consec_on2 {
    public static void main(String[] args) {

    }
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int count =0, temp_count=0;
            for(int i=0;i<nums.length;++i){
                if(nums[i]==1){
                    while (i != nums.length && nums[i]!=0){
                        temp_count+=1;
                        i++;
                    }
                    if(count<temp_count){
                        count=temp_count;
                    }
                    temp_count=0;
                }

            }
            return count;
        }
    }
}
