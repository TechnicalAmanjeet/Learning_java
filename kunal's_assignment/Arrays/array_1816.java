package com.Arrays;

public class array_1816 {
    class Solution {
        public String truncateSentence(String s, int k) {
            int i=0;
            while (true){
                if(s.charAt(i)==' ') --k;
                if(k==0) break;
                if( i==s.length()-1){
                    break;
                    ++i;
                }
                ++i;
            }
            String ans = "";
            for (int j=0;j<i;++j){
                ans+=s.charAt(j);
            }
            return ans;
        }
    }
}
