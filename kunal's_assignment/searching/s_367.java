package com.searching;

public class s_367 {
    class Solution {
        public boolean isPerfectSquare(int num) {
            int start = 1,x=num;
            int end = x / 2;

            if(x == 1)
                return true;
            else if(x == 0)
                return true;

            while(start <= end) {
                int mid = start + (end - start) / 2;

                if((long) mid * mid == x)
                    return true;
                else if((long) mid * mid < x) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }

            return false;
        }
    }



}
