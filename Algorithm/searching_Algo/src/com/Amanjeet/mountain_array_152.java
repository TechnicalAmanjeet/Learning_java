package com.Amanjeet;

public class mountain_array_152 {
    public int peakIndexInMountainArray(int[] arr) {
        int start =0,end=arr.length-1,mid;
        while (true){
            mid = start + (end-start)/2;
            // return index if element at mid > mid+1 and > mid-1
            if(arr[mid+1]<arr[mid] && arr[mid-1]<=arr[mid]) return mid;
            else if(arr[mid+1]>=arr[mid]) start=mid+1;
            else end= mid-1;
        }
    }
}
