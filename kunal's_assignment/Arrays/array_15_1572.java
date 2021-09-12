package com.Arrays;

public class array_15_1572 {
    // q. 15
    public static void main(String[] args) {


    }
    class Solution {
        public int diagonalSum(int[][] mat) {
            int sum=0;
            for(int i=0;i<mat.length;++i){
                sum+=mat[i][i];
                System.out.print(sum+" ");
            }
            int j=0;
            for(int i=mat.length-1;i>=0;--i){
                sum+=mat[i][j];
                System.out.print(mat[i][j]+"-"+sum+" ");
                j++;
            }
            if(mat.length%2!=0){
                sum=sum-mat[(mat.length/2)][(mat.length/2)];
            }
            return sum;
        }
    }
}
