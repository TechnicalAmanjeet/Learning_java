package com.Arrays;

public class array_28_34 {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] arr=new int[2];
            arr[0]=-1; arr[1]=-1;
            if(nums.length==0) return arr;
            int start=0,end=nums.length-1,mid;
            System.out.println(start+" "+mid+" "+end);
            while (start<end){
                mid=start + (end-start)/2;
                if(nums[mid]>=target) end=mid-1;
                else start=end+1;
                System.out.println(start+" "+mid+" "+end);
            }
            System.out.println(start);
            if(start==1 && nums[0]!=target) return arr;
            arr[0]=start;
            start++;

            while(start<nums.length){
                if(nums[start]!=target) break;
                start++;
            }
            arr[1]=start-1;
            return arr;
        }
    }
}




















