package com.searching;

public class s_1901 {
    class Solution {
        public int[] findPeakGrid(int[][] mat) {
            int min=-1,top,left,right,bottom;
            int[] out = new int[2];
            out[0]=-1;
            out[1]=-1;
            for (int i=0;i<mat.length;++i){
                for (int j=0;j<mat[i].length;++j){
                    int e=mat[i][j];
                    if(i==0) top=-1;
                    else top=mat[i-1][j];
                    if(j==0) left=-1;
                    else left=mat[i][j-1];
                    if(j==mat[0].length-1) right=-1;
                    else right=mat[i][j+1];
                    if(i==mat.length-1) bottom=-1;
                    else bottom=mat[i+1][j];
                    if(e>top && e>left && e>right && e>bottom){
                        out[0]=i;
                        out[1]=j;
                        return out;
                    }
                }
            }
            return out;
        }
    }
}
