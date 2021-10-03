package com.Amanjeet;

public class ceil_number_of_array {
    public static void main(String[] args) {
        int[] arr = {1,3,6,7,30,45,64,93};
        int target = 915;
        // ciel of a number in an array return index of smallest number >= target. and if target>arr[arr.legth-1] return -1;
        int cielIndex=cielTarget(arr,target);
        if(cielIndex==-1) System.out.println(target+" is the gratest element in the array.");
        else    System.out.println(arr[cielIndex]);

        // floor of a number in an array return index of gratest element <= target and if target is smallest then the whole array then return -1;
        int floorindex = floor(arr,target);
        if(floorindex==-1) System.out.println(target+" is the smallest among the array element.");
        else    System.out.println(arr[floorindex]);
    }

    private static int floor(int[] arr_ascending, int key) {
        int start=0,end=arr_ascending.length-1,mid;
         if(key<arr_ascending[0]) return -1;
        while (start<end){
//            mid = (start+end)/2;
            mid = start + (end-start)/2;
            if(key>arr_ascending[mid]) start=mid+1;
            else if(key<arr_ascending[mid]) end=mid-1;
            else return mid;
        }
        return end;
    }

    private static int cielTarget(int[] arr_ascending, int key) {
        int start=0,end=arr_ascending.length-1,mid;
        if(key>arr_ascending[arr_ascending.length-1]) return -1;
        while (start<end){
//            mid = (start+end)/2;
            mid = start + (end-start)/2;
            if(key>arr_ascending[mid]) start=mid+1;
            else if(key<arr_ascending[mid]) end=mid-1;
            else return mid;
        }
        return start;
    }
}





















