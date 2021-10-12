package com.Arrays;

public class array_19_2022 {
    class Solution {
        public int[][] matrixReshape(int[][] mat, int r, int c) {

            // if no. of element in new matrix > no. of element in older matrix return older matrix.
            if(r*c!=mat.length*mat[0].length) return mat;
            else{
                int[][] out=new int[r][c]; // out array with proper row and column
//                List<Integer> mat1 = new ArrayList<>(); // 1d array of older array
//                //int[] arr = new int[mat.length*mat[0].length]
                int[] arr = new int[mat.length*mat[0].length];
                int i=0;
                for(int[] row:mat){
                    for(int col:row) {
                        arr[i]=col;
                        ++i;
                    }
                }
                // System.out.println(mat1);
                int t=0;
                for(int i=0;i<r;++i){
                    for(int j=0;j<c;++j){
                        out[i][j] = arr[t];
                        ++t;
                    }
                }
                return out;
            }
        }
    }
}
