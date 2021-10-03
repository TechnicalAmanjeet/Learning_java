package com.Amanjeet;

// do debug the code
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class smallest_lettar_744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int start =0, end = letters.length-1,mid;
        while (start<end){
            mid = start+(end-start)/2;
            if(letters[mid]<target) start=mid+1;
            else  if(letters[mid]>target) end = mid-1;
        }
        System.out.println(start%letters.length);
        return letters[start%letters.length];
    }
}
