package com.Amanjeet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int temp,min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;++i){
            if(arr[i]-arr[i-1]<min) min=arr[i]-arr[i-1];
        }
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> a= new ArrayList<>();
        for (int i=1;i<arr.length;++i){
            if(arr[i]-arr[i-1]==min){
                a.add(arr[i-1]);
                a.add(arr[i]);
                System.out.println(a);
                output.add(new ArrayList<>(a));
                a.remove(0);
                a.remove(0);
            }
        }
        return output;
    }
}