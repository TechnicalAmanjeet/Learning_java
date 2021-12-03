package com.searching;

public class s_350 {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            List<Integer> out = new ArrayList<>();
            int arr1[] = new int[1001];
            int arr2[] = new int[1001];
            for (int element: nums1) arr1[element]++;
            for(int element: nums2) arr2[element]++;
            for(int i=0;i<=1000;++i){
                if(arr1[i]>0 && arr2[i]>0){
                    int x = Math.min(arr1[i],arr2[i]);
                    while (x>0){
                        out.add(i);
                        x--;
                    }
                }
            }
            int output[] = new int[out.size()];
            for (int i=0;i<output.length;++i){
                output[i]=out.get(i);
            }
            return output;
        }
    }
}
