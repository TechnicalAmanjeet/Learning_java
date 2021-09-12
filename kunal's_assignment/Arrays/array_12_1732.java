package com.Arrays;

public class array_12_1732 {
    // q. 12
    public static void main(String[] args) {

    }
    class Solution {
        public int largestAltitude(int[] gain) {
            int max=0,prev=0;
            for (int i=0;i<gain.length;++i){
                if(prev>max) {
                    max=prev;
                    System.out.println("max : " +max);
                }
                prev=prev+gain[i];
                System.out.println(prev);
            }
            if(prev>max) max=prev;
            return max;
        }
    }
}
