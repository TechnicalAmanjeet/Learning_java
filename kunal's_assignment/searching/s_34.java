package com.searching;

public class s_34 {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] out=new int[2];
            //System.out.println(bs(nums,0,nums.length-1,target));
            if(bs(nums,0,nums.length-1,target)==-1){
                out[0]=-1; out[1]=-1;
                return out;
            }
            else{
                // System.out.println(binary_searchs(nums,0,nums.length-1,target));
                //System.out.println(binary_searche(nums,0,nums.length-1,target));
                out[0]=binary_searchs(nums,0,nums.length-1,target);
                out[1]=binary_searche(nums,0,nums.length-1,target);
                return out;
            }
        }
        public int bs(int[] arr, int s, int e, int target) {
            int m=(s+e)/2;
            if(s>e) return -1;
            else if(arr[m]==target) return m;
            else if(arr[m]>target) return  bs(arr,s,m-1,target);
            else return bs(arr,m+1,e,target);
        }
        public int binary_searchs(int[] numbers, int s, int e, int target) {
            int m=(s+e)/2;
            if(numbers[0]==target) return 0;
            // System.out.println(s+" "+m+" "+e);
            if(numbers[m]==target && numbers[m-1]<target) return m;
            else if(numbers[m]>=target) return binary_searchs(numbers,s,m-1,target);
            else return binary_searchs(numbers,m+1,e,target);
        }
        public int binary_searche(int[] numbers, int s, int e, int target) {
            int m=(s+e)/2;
            if(numbers[numbers.length-1]==target) return numbers.length-1;
            if(numbers[m]==target && numbers[m+1]>target) return m;
            else if(numbers[m]<=target) return binary_searche(numbers,m+1,e,target);
            else return binary_searche(numbers,s,e-1,target);
        }
    }
    class Solution1 {
        public int[] searchRange(int[] nums, int target) {
            int[] out=new int[2];
            //System.out.println(bs(nums,0,nums.length-1,target));
            int m=bs(nums,0,nums.length-1,target);
            if(m==-1){
                out[0]=-1; out[1]=-1;
                return out;
            }
            else{
                int s=m,e=m;
                while (s>=0 && nums[s]==target) s--;
                while (e<nums.length && nums[e]==target) e++;
                out[0]=s+1;
                out[1]=e-1;
                return out;
            }
        }
        public int bs(int[] arr, int s, int e, int target) {
            int m=(s+e)/2;
            if(s>e) return -1;
            else if(arr[m]==target) return m;
            else if(arr[m]>target) return  bs(arr,s,m-1,target);
            else return bs(arr,m+1,e,target);
        }
    }
}
