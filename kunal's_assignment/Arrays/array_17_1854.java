package com.Arrays;

public class array_17_1854 {
    class Solution {
        public int maximumPopulation(int[][] logs) {
            int[] arr= new int[101];
            for(int[] node:logs){
                arr[node[0]-1950]+=1;
                arr[node[1]-1950]-=1;
            }
            int max=arr[0],maxyear=0;
            for(int i=1;i<101;++i){
                arr[i]+=arr[i-1];
                if(arr[i]>max){
                    max=arr[i];
                    maxyear=i;
                }
            }
            return maxyear+1950;
        }
    }
}





















