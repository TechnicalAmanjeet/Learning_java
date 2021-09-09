package com.Conditional_loop;

import java.util.Scanner;
// solved kunals basic assignment q. 19 to 20.
public class surface_area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Amanjeet loves whom??");
    }
    // surface area of cube when side a given.
    private  static  double cube(double a){
        return 6*a*a;
    }

    // total surface area of cylinder when radius r and height h given.
    private  static double cylinder(double r , double h){
        return (2*3.14*r*h) + (2*3.14*r*r);
    }
}
