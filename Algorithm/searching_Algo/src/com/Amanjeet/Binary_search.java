package com.Amanjeet;

public class Binary_search {
    public static void main(String[] args) {
        // sorted array as a input
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int[] arr_ascending = {1,2,3,4,5,6,7,8,9,10};
        int[] arr_descending = {10,9,8,7,6,5,4,3,2,1};

        int key =5;

        // return true if element present else return false.
        boolean output = binarySearch(arr_ascending,key);
        System.out.println(output);

        // return index of key if present else return -1;
        int outputIndex = binarySearchIndex(arr_ascending,key);
        System.out.println(key+" is present at index "+outputIndex);

        // order agnostic binary search
        int oabs = orderAgnosticBinarySearch(arr_descending,key);
        System.out.println(oabs);
    }

    private static int orderAgnosticBinarySearch(int[] arr, int key) {
        int start=0,mid,end=arr.length;
        if(arr[end-1]>=arr[start]){
            while (start<end){
                mid = (start+end)/2;
                if(key>arr[mid]) start=mid+1;
                else if(key<arr[mid]) end=mid-1;
                else return mid;
            }
        }
        else {
            while (start<end){
                mid = (start+end)/2;
                if(key>arr[mid]) end=mid-1;
                else if(key<arr[mid]) start=mid+1;
                else return mid;
            }
        }
        return -1;
    }

    private static int binarySearchIndex(int[] arr_ascending, int key) {
        int start=0,end=arr_ascending.length,mid;
        while (start<end){
            mid = (start+end)/2;
            if(key>arr_ascending[mid]) start=mid+1;
            else if(key<arr_ascending[mid]) end=mid-1;
            else return mid;
        }
        return -1;
    }

    private static boolean binarySearch(int[] arr, int key) {
        int start=0,end=arr.length,mid;
        while (start<end){
            mid = (start+end)/2;
            if(key>arr[mid]) start=mid+1;
            else if(key<arr[mid]) end=mid-1;
            else return true;
        }
        return false;
    }
}
















