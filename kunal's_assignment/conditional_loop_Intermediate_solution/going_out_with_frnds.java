package com.conditional_loop_Intermediate_solution;

public class going_out_with_frnds {
    // q. 26
    public static void main(String[] args) {
        int go_out =0;
        for(int i=2;i<=30;++i) {
            if(i%2==0) ++go_out;
        }
        System.out.println("Kunal can go out "+go_out+" days with his friends in the month of august");
    }
}
