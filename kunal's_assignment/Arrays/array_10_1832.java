package com.Arrays;

public class array_10_1832 {
    // q. 10
    public static void main(String[] args) {

    }
    class Solution {
        public boolean checkIfPangram(String sentence) {
            int[] ans = new int[26];
            for(int i=0;i<sentence.length();++i){
                if(ans[((int)sentence.charAt(i)-97)]==0) {
                    ans[(int)sentence.charAt(i)-97]+=1;
                }
            }
            int sum =0;
            for(int i=0;i<26;++i){
                if(ans[i]==0) return false;
                sum+=ans[i];
            }
            return true;
        }
    }
}
