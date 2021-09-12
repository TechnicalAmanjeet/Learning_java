package com.Arrays;

public class array_13_832 {
    // q. 13
    public static void main(String[] args) {

    }
    class Solution {
        public int[][] flipAndInvertImage(int[][] image) {
            int[][] ans= new int[image.length][image.length];
            for(int i=0;i<image.length;++i){
                int m=0;
                for(int j=image.length-1;j>=0;--j){
                    int t=1;
                    if(image[i][j]==1) t=0;
                    ans[i][m]=t;
                    System.out.print(ans[i][m]+" ");
                    ++m;
                }
            }
            return ans;
        }
    }
}
