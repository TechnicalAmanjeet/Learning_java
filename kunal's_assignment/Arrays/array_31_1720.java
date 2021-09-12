package com.Arrays;

public class array_31_1720 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] decode(int[] encoded, int first) {
            int[] ans = new int[encoded.length+1];
            ans[0]=first;
            for(int i=0;i< encoded.length;++i){
                ans[i+1]=(ans[i-1]^encoded[i]);
            }
            System.out.println(ans);
            return ans;
        }
    }class Solution {
        public int[] decode(int[] encoded, int first) {
            int[] ans = new int[encoded.length+1];
            ans[0]=first;
            int i=1;
            for (int item:encoded){
                ans[i]=item^ans[i-1];
                ++i;
            }
            return ans;
        }
    }
}
