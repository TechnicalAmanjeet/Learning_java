package com.Amanjeet;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] ans=new int[arr.length];
        for (int i=0;i<arr.length;++i) ans[i]=arr[i];
        Arrays.sort(ans);
        for(int i=0;i<arr.length;++i) System.out.print(arr[i]+" ");
        System.out.println();
        for(int i=0;i<arr.length;++i) System.out.print(ans[i]+" ");
    }
}
