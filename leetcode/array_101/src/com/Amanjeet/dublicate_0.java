package com.Amanjeet;

public class dublicate_0 {
    class Solution {
        public void duplicateZeros(int[] arr) {
            for (int i=0;i<arr.length;++i){
                if(arr[i]==0){
                    int n=arr.length-1;
                    while (n>i){
                        arr[n]=arr[n-1];
                        --n;
                    }
                    arr[n]=0;
                    ++i;
                    System.out.println(arr);
                }
            }
        }
    }
}
