package com.Amanjeet;

public class a_2 {
    class Solution {
        public boolean checkIfExist(int[] arr) {
//        boolean ans=false;
            int k=arr.length;
            for (int i=0;i<k-1;++i){
                for (int j=i+1;j<k;++j){
                    if((arr[i]==2*arr[j] || arr[j]==arr[i]*2) ) {
                        System.out.println(i+" "+j);
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
