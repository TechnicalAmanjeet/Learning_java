package com.Amanjeet;

public class Linear_search {
    public static void main(String[] args) {
        // input array.
        int[] arr = {1,2,4,-5,45,45,4534,34,2,64,56};
        int key = 64;

        // return 1 if element found, 0 if element is not in array
        boolean output = linear_search(arr,key);
        System.out.println(output);

        // return index of key if found else return -1;
        int outputIndex = search_index(arr,key);
        System.out.println(key+" is at "+outputIndex);

        // searching element in interval. output the result.
        int indexFirst = 0,indexLast = arr.length;
        int outputInInterval = search_in_interval(arr,key,indexFirst,indexLast);

        // return minimum and maximum element of an array.
        // min_max[0]=minimum & min_max[1]=maximum
        int[] min_max = min_and_max(arr);
        System.out.println("min and max of an array is "+min_max[0]+" and "+min_max[1]+" respectively.");

    }

    private static int[] min_and_max(int[] arr) {
        int[] minAndMax = {Integer.MAX_VALUE,Integer.MIN_VALUE};
        for(int element:arr){
            if(minAndMax[0]>element) minAndMax[0]=element;
            if(minAndMax[1]<element) minAndMax[1]=element;
        }
        return minAndMax;
    }

    private static int search_in_interval(int[] arr,int key, int indexFirst, int indexLast) {
        if(indexFirst<0) System.out.println("index is always greater then -1..");
        else if(indexLast>arr.length) System.out.println("there is only "+arr.length+1+" element present in the array.");
        else for(int i=indexFirst;i<indexLast;++i){
                if(arr[i]==key){
                    System.out.println(key+" is at "+i+" in the given interval.");
                    return i;
                }
            }
        System.out.println(key+" is not present in the interval.");
        return -1;
    }

    private static int search_index(int[] arr, int key) {
        for(int i=0;i<arr.length;++i){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    private static boolean linear_search(int[] arr, int key) {
        for(int element:arr){
            if(element==key) return true;
        }
        return false;
    }

}
