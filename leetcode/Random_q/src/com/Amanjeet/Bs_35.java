package com.Amanjeet;

import java.util.ArrayList;
import java.util.List;

public class Bs_35 {
    class Solution {
        public int[][] transpose(int[][] matrix) {
            int row= matrix.length, col=matrix[0].length;
            int[][] ans = new int[col][row];

            for (int i=0;i<col;i++){
                for (int j=0;j<row;++j){
                    ans[i][j] = matrix[j][i];
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }
            return ans;
        }
    }
}

























