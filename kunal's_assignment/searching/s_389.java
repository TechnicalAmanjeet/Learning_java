package com.searching;

public class s_389 {
    class Solution {
        public char findTheDifference(String s, String t) {
            int[] first=new int[26];
            int[] second=new int[26];
            for(int i=0;i<s.length();++i){
                first[s.charAt(i)-97]++;
                second[t.charAt(i)-97]++;
            }
            second[t.charAt(t.length()-1)-97]++;
            for(int i=0;i<26;++i){
                if(second[i]-first[i]==1) return (char)(i+97);
            }
            return 'a';
        }
    }
}
