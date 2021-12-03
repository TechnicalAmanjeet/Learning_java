package com.Amanjeet;

public class a_1207 {
    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            int[][] ocuur_array = new int[1001][2];
            for(int e:arr){
                if(e>=0){
                    ocuur_array[e][0]++;
                System.out.print(ocuur_array[e][0]);
                }
                else ocuur_array[e][1]++;
                System.out.println(ocuur_array[e][0]);
            }
            System.out.println();
            int[] freqArray = new int[arr.length];
            for(int i=0;i<ocuur_array.length;++i){
                freqArray[ocuur_array[i][0]]++;
                freqArray[ocuur_array[i][1]]++;
                System.out.println(freqArray[ocuur_array[i][0]]+" "+freqArray[ocuur_array[i][1]]);
                if(freqArray[ocuur_array[i][0]]==2) return false;
                if(++freqArray[ocuur_array[i][1]]==2) return false;
            }
            return true;
        }
    }
}
