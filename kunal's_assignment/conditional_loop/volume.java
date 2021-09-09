package com.Conditional_loop;

import java.util.Scanner;
// solution of kunals basic assignment q. 14 to q. 18.
public class volume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Amanjeet loves whom??");
    }
    // volume of cone when height h and radius r is given;
    private  static  double cone(double h , double r){
        return (3.14*r*r*h)/3;
    }

    // voluem of coube when side a given;
    private static double cube(double a){
        return a*a*a;
    }

    //  volume of cuboid when length l , base b and height h is given
    private  static  double cuboid(double l,double b , double h){
        return l*b*h;
    }

    // volume of cylinder when radius r and height h given
    private  static double cylinder(double r, double h){
        return (3.14*r*r*h);
    }

    // volume of sphare when radius r is given.
    private static double sphare(double r){
        return (3.14*r*r*r)/3;
    }

    // volume of right ractangular pyramid when base lenght l , base width w and height h give.
    private static double pyramid(double l,double w,double h){
        return l*w*h/3;
    }
}
