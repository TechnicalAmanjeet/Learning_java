package com.Arrays;

public class array_30_1528 {
    public static void main(String[] args) {

    }
    class Solution {
        public String restoreString(String s, int[] indices) {
            char[] ansd = new char[s.length()];
            for(int i=0;i<indices.length;++i){
                ansd[indices[i]]=s.charAt(i);
            }
            System.out.println(ansd);
            String ans = String.valueOf(ansd);
            System.out.println(ans);
            return ans;
        }
    }
}
