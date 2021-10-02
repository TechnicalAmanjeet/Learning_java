package com.Amanjeet;

import java.util.Arrays;

public class array_1571 {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int start =0,end=nums.length,mid,m=-1;
            while (start<end){
                mid=(start+end)/2;
                if(nums[mid]>=0 && nums[mid-1]<0){
                    m=mid;
                    break;
                }
                else if(nums[mid]>0) end=mid;
                else start=mid;
            }
            int[] ans= new int[nums.length];
            start=m;
            end=m+1;
            int i=0;
            while (start>=0 && end<nums.length){
                int x=(int)Math.pow(nums[start],2);
                int y=(int)Math.pow(nums[end],2);
                if(x<y){
                    ans[i]=x;
                    --start;
                    System.out.println(i+" "+x);
                    if(start==-1) start=-5;
                }
                else {
                    ans[i]=y;
                    end++;
                    System.out.println(i+" "+y);
                    if(end== nums.length) end=-5;
                }
                i++;
                // System.out.println(i+" "+x);
            }
            if(start==-5){
                while (end<nums.length){
                    int y=(int)Math.pow(nums[end],2);
                    ans[i]=y;
                    ++i;
                    ++end;
                }
            }
            if(end==-5){
                int x=(int)Math.pow(nums[start],2);
                ans[i]=x;
                ++i;
                --end;
            }
            return ans;
        }
    }

    class Solution {
        public int[] sortedSquares(int[] nums) {
            int[] ans   = new int[nums.length];
            int i=0
            while (nums[i]<0) {
                nums[i]=(-1)*nums[i];
                i++;
            }
            Arrays.sort(nums);
            for(int i=0;i<nums.length;++i){
                ans[i]=(int) Math.pow(nums[i],2);
            }
            return ans;
        }
    }class Solution {
        public int[] sortedSquares(int[] nums) {
            int[] ans   = new int[nums.length];
            int size=nums.length-1;
            int start =0,end=nums.length-1;
            while (size>=0){
                int x=nums[start]*nums[start],y=nums[end]*nums[end];
                if(x>y){
                    ans[size] =x;
                    ++start;
                }
                else {
                    ans[size]=y;
                    --end;
                }
                --size;
            }
            return ans;
        }
    }class Solution {
        public int[] sortedSquares(int[] nums) {
            for (int i=0;i<nums.length;++i){
                nums[i]=nums[i]*nums[i];
            }
            Arrays.sort(nums);
            return nums;
        }
    }
}
