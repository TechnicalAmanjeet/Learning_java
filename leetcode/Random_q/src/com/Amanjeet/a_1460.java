package com.Amanjeet;

public class a_1460 {
    class Solution {
        public boolean canBeEqual(int[] target, int[] arr) {
            int[] out1 = new int[1001];
            int[] out2 = new int[1001];
            for(int i=0;i<target.length;++i){
                out1[target[i]]++;
                out2[arr[i]]++;
            }
            for(int i=0;i<out1.length;++i){
                if(out1[i]!=out2[i]) return false;
            }
            return true;
        }
    }
}
