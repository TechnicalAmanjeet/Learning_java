package com.searching;

public class s_349 {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            int[] arr = new int[1001];
            for(int element:nums1) arr[element]++;
            List<Integer> out = new ArrayList<>();
            for(int element:nums2){
                if(arr[element]>0){
                    int z=0;
                    for(int j=0;j<out.size();++j){
                        if(out.get(j)==element) {
                            z=1;
                            break;
                        }
                    }
                    if(z==0) out.add(element);
                    // System.out.println(out);
                }
            }
            int[] output = new int[out.size()];
            for (int i=0;i<output.length;++i){
                output[i]=out.get(i);
            }
            return output;
        }
    }
}
