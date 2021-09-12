package com.Arrays;

import java.util.ArrayList;
import java.util.List;

// time => o(n^2)
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>(1);
        int lucky,x=0,y=0;
        for(int i=0;i< matrix.length;++i){
            int min=99999999;
            for (int j=0;j<matrix.length;++j){
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                    x=j;
                }
                int k=0;
                for(k=0;k<matrix.length;++k){
                    if(matrix[k][x]>min){
                System.out.println(min);
                        break;
                    }
                }
                if(k==matrix.length && min>matrix[k][x]){
                    ans.add(min);
                    y=1;
                    break;
                }
            }
            if(y==1) break;
        }
        return ans;
    }
}