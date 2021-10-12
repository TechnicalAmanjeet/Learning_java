package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class array_21_1380 {
    class Solution {
        public List<Integer> luckyNumbers (int[][] matrix) {
            List<Integer> out = new ArrayList<>();
            // idea is to first find min element in the row if you get it then for that element check whether it is maximum in its colm or not.
            int r=matrix.length,c=matrix[0].length,min,min_index,max;
            for(int i=0;i<r;++i){
                min=matrix[i][0];
                min_index=0;
                for(int j=1;j<c;++j){
                    if(matrix[i][j]<min){
                        min=matrix[i][j];
                        min_index=j;
                    }
                }
                System.out.println(min);
                max=matrix[i][min_index];
                int k;
                for(k=0;k<r;++k){
                    if(max<matrix[k][min_index]) break;
                }
                System.out.println(k+" "+max+" "+matrix[k-1][min_index]);
                if(k==r && max>=matrix[k-1][min_index]){
                    System.out.println("max : "+max);
                    out.add(max);
                }
            }
            return out
        }
    }
}
