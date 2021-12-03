package com.searching;

public class s_744 {
    class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            if(target=='z') return letters[0];
            int out[] = new int[26];
            for(char ch:letters){
                out[ch-97]=1;
            }
            int i = target-97-1;
            i=target-97+1;
            while (i<26){
                //System.out.println((char)(i+97));
                if(out[i]>0) return (char)(i+97);
                i++;
            }
            i = 0;
            while(i>=0){
                System.out.println((char)(i+97));
                if(out[i]>0) return (char)(i+97);
                //System.out.println((char)(i+97));
                i++;
            }

            return 'a';
        }
    }
}
