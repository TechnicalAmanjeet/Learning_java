package com.Amanjeet;

import java.util.Arrays;

public class array_40 {
    class Solution {
        public int heightChecker(int[] heights) {
            int count=0;
            int[] ans= new int[heights.length];
            for (int i=0;i<heights.length;++i) ans[i]= heights[i];
            Arrays.sort(ans);
            for(int i=0;i<heights.length;++i){
                if(heights[i]!=ans[i]) count++;
            }
            return count;
        }
    }

}
