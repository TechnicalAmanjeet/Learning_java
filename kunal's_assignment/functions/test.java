package com.functions;

public class test {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int target=8;
        System.out.println("ram");
        System.out.println(binary_search(arr,0,arr.length-1,target));

    }
    static int binary_search(int[] numbers, int s, int e, int target) {
        int m=(s+e)/2;
        if(numbers[m]<target && (numbers[m+1]>0 || m==numbers.length-1)) return m;
        else if(numbers[m]>target) return binary_search(numbers,s,m-1,target);
        else return binary_search(numbers,m+1,e,target);
    }
}
