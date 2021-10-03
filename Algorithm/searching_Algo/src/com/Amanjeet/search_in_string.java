package com.Amanjeet;

public class search_in_string {
    public static void main(String[] args) {
        String str = "amanjeet_riya";
        char key = '_';

        // return 1 if key is found else return 0;
        boolean output = search(str,key);
        System.out.println(output);

        // return index of key if found else return -1;
        int outputIndex = search_index(str,key);
        System.out.println("Index of "+key+" is "+ outputIndex);
    }

    private static int search_index(String str, char key) {
        for(int i=0;i<str.length();++i){
            if(str.charAt(i)==key) return i;
        }
        return -1;
    }

    private static boolean search(String str, char key) {
        for(int i=0;i<str.length();++i){
            if(str.charAt(i)==key) return true;
        }
        return false;
    }
}
