package com.searching;

public class s_69 {
    class Solution {
        public int mySqrt(int x) {

            int start = 1;
            int end = x / 2;

            if(x == 1)
                return 1;
            else if(x == 0)
                return 0;

            while(start <= end) {
                int mid = start + (end - start) / 2;

                if((long) mid * mid == x)
                    return mid;
                else if((long) mid * mid < x) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }

            return end;
        }
    }
}
