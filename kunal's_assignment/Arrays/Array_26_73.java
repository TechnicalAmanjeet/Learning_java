package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Array_26_73 {
    class Solution {
        public void setZeroes(int[][] matrix) {
            List<Integer> r = new ArrayList<>();
            List<Integer> c = new ArrayList<>();
            // finding where we get 0 in matrix and storing thts row in r and column in c.
            for (int i=0;i<matrix.length;++i){
                for(int j=0;j<matrix[0].length;++j){
                    if(matrix[i][j]==0) {
                        r.add(i);
                        c.add(j);
                    }
                }
            }
            for(int i=0;i<matrix[0].length;++i){
                for(int j=0;j<r.size();++j){
                    matrix[r.get(j)][i]=0;
                }
            }
            for(int i=0;i<matrix.length;++i){
                for(int j=0;j<c.size();++j){
                    matrix[i][c.get(j)]=0;
                }
            }
        }
    }
}






















