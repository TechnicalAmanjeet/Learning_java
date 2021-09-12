package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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