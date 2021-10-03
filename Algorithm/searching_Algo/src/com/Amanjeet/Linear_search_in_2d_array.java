package com.Amanjeet;

public class Linear_search_in_2d_array {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6,7},{8,9}};
        int key = 7;

        // display element of 2d array.
            display(arr);

        // return true if key found else return false.
        boolean output = search(arr,key);
        System.out.println(output);

        // output the row and column at which key is present else print -1
        search_index(arr,key);

        // print min and max element of 2d array;
        print_min_and_max(arr);
    }

    private static void print_min_and_max(int[][] arr) {
        int min = Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int[] row:arr){
            for(int col:row){
                if(min>col) min=col;
                if(max<col) max=col;
            }
        }
        System.out.println("min and max of the array is "+min+" and "+max);
    }

    private static void search_index(int[][] arr, int key) {
        int size = arr.length;
        for(int i=0;i<arr.length;++i){
            int j=0;
            for(int element : arr[i]){
                if(element==key) System.out.println(key+" is present at row "+(i+1)+" column "+(j+1));
                ++j;
            }
        }
    }

    private static boolean search(int[][] arr, int key) {
        for(int[] row:arr){
            for(int col:row){
                if(col == key) return true;
            }
        }
        return false;
    }

    private static void display(int[][] arr) {
        for(int[] row:arr){
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
