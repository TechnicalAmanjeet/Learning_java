package com.Arrays;

public class array_20_2022 {
    class Solution {
        public int[][] construct2DArray(int[] original, int m, int n) {
            int[][] arr = new int[0][0];
            if(m*n != original.length) return arr;

            int[][] out = new int[m][n]; // construct out 2d array with m row and n colmn.
            int t=0;
            // add value by using 2 loop
            for(int i=0;i<m;++i){
                for(int j=0;j<n;++j){
                    out[i][j] = original[t];
                    ++t;
                }
            }
            return out;
        }
    }
}
