package com.searching;

public class s_74 {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int s=0,e=matrix.length-1,m=(s+e)/2,find=0,index=-1;
            while (s<=e){
                m=(s+e)/2;
                System.out.println(s+" "+m+" "+e);
                if(matrix[m][0]<=target && matrix[m][matrix[0].length-1]>=target){
                    System.out.println(s+" "+m+" "+e+" indside");
                    find=1;
                    break;
                }
                else if(matrix[m][matrix[0].length-1]>target) e=m-1;
                else s=m+1;
            }
            if(find==0) return false;
            else {
                index=m;s=0;
                e=matrix[index].length-1;
                while (s<=e){
                    m=(s+e)/2;
                    if(matrix[index][m]==target) return true;
                    else if(matrix[index][m]<target) s=m+1;
                    else e=m-1;
                }
            }
            return false;
        }
    }
}
}
