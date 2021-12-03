package com.Amanjeet;

import java.util.Arrays;

public class a_1337 {
    class Solution {
        public int[] kWeakestRows(int[][] mat, int k) {
            int[] out = new int[k];
            int[] arr = new int[mat.length];
            int[] arr1 = new int[mat.length];
            int t=0;
            for(int[] row : mat){
                int sum=0;
                for(int e:row) sum+=e;
                arr1[t]=sum;
                arr[t++]=sum;
                System.out.println(arr[t-1]);
            }
            Arrays.sort(arr1);
            for(int i=0;i<k;++i){
                for(int j=0;j<arr.length;++j){
                    if(arr1[j]==arr[j]){
                        out[i]=j;
                        arr[j]=-1;
                    }
                }
            }
            return out;
        }
    }
}
