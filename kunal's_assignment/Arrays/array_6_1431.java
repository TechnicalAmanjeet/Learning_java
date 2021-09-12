package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class array_6_1431 {
    // q. 6
    public static void main(String[] args) {

    }

    // o(n) space and time


    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            // find the max candie in the array.
            int max =0;
            for (int i=0;i<candies.length;++i){
                if (candies[i]>max) max = candies[i];
            }
            List<Boolean> ans= new ArrayList<Boolean>(candies.length);
//        List<Integer> list=new ArrayList<Integer>();
            for (int i=0;i<candies.length;++i){
                if (candies[i]+extraCandies>=max){
                    ans.add(true);
                }
                else ans.add(false);
            }
            return ans;
        }
    }
}
