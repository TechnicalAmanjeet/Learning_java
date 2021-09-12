package com.Arrays;

public class arrays_4_1672 {
    // q. 4
    public static void main(String[] args) {

    }
    // SIMPLE WAY
    class Solution {
        public int maximumWealth(int[][] accounts) {
            int max=0;
            for (int i=0;i<accounts.length;++i){
                int sum=0;
                for (int j=0;j<accounts[i].length;++j){
                    sum+=accounts[i][j];
                }
                if(sum>max) max=sum;
            }
            return  max;
        }
    }
    // MODERN WAY
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] customer : accounts) {
            int wealth = 0;
            for (int account : customer)
                wealth += account;
            max = Math.max(max, wealth);
        }
        return max;
    }
}
