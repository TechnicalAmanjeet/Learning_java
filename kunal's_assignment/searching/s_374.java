package com.searching;

public class s_374 {
    /**
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is lower than the guess number
     *			      1 if num is higher than the guess number
     *               otherwise return 0
     * int guess(int num);
     */
    public class Solution extends GuessGame {
        public int guessNumber(int n) {
            int start = 1 , end = n,mid;
            while (start<end){
                mid=start+(end-start)/2;
                int ch = guess(mid);
                // System.out.println(ch);
                if(ch==0) return mid;
                else if(ch==-1) end = mid-1;
                else if(ch==1) start = mid+1;
            }
            return start;
        }
    }
}
