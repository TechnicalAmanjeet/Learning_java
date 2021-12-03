package com.Amanjeet;

public class test {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int target=3;
//        int out1 =bs(arr,0,arr.length-1,target);
//        System.out.println(out1);
        int out=binary_search(arr,0,arr.length-1,target);
        System.out.println(out);

    }

    private static int bs(int[] arr, int s, int e, int target) {
        int m=(s+e)/2;
        if(s>e) return -1;
        else if(arr[m]==target) return m;
        else if(arr[m]>target) return  bs(arr,s,m-1,target);
        else return bs(arr,m+1,e,target);
    }

    static int binary_search(int[] numbers, int s, int e, int target) {
        int m=(s+e)/2;
        if(e<s) return e;
        else if(numbers[m]>target) return binary_search(numbers,s,m-1,target);
        else return binary_search(numbers,m+1,e,target);
    }
}






















