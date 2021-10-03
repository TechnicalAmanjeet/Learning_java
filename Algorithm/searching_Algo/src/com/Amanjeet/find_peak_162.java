package com.Amanjeet;

public class find_peak_162 {
    public int findPeakElement(int[] arr) {
        int start =0,end=arr.length-1,mid;
        while (true){
            mid = start + (end-start)/2;
            // return index if element at mid > mid+1 and > mid-1
            if(arr[mid]<arr[mid-1] && arr[mid-2]<=arr[mid-1]) return mid-1;
            else if(arr[mid+1]>=arr[mid]) start=mid+1;
            else end= mid-1;
        }
    }


    class Solution {
        public int peakIndexInMountainArray(int[] nums) {
            int start=0,end=nums.length-1,mid;
            while(start<end)
            {
                mid=(start+end)/2;
                if(nums[mid]>nums[mid+1])
                {
                    end=mid;
                }
                else
                    start=mid+1;
            }
            return start;
        }
    }

}
}
