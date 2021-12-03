package com.searching;

public class s_704 {
    class Solution {
        // basic approach.
        public int search(int[] nums, int target) {
            int start=0,end=nums.length-1,mid;
            while (start<=end) {
                mid = start +(end-start)/2;
                if(nums[mid]==target) return mid;
                else if(target>nums[mid]) start=mid+1;
                else end=end-1;
            }
            return -1;
        }
    }
}
