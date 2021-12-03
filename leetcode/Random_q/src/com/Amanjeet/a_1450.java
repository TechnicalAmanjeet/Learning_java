package com.Amanjeet;

public class a_1450 {
    class Solution {
        public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
            int out=0;
            for(int i=0;i<startTime.length;++i){
                if(queryTime>=startTime[i] && queryTime<=endTime[i]) out++;
            }
            return out;
        }
    }
}
