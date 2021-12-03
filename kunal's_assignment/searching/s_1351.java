package com.searching;

public class s_1351 {
    class Solution {
        public int countNegatives(int[][] grid) {
            int count =0;
            for(int i=0;i<grid.length;++i){
                int t=grid[0].length-1;
                //System.out.println(grid[i][t]);

                while (t>=0 && grid[i][t]<0){
                    count++;
                    t--;
                }
            }
            return count;
        }
    }
}
