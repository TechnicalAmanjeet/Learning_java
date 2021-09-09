package com.Conditional_loop;

import java.util.Scanner;

// in this i have done basic assignment of conditional loop q. 1 to q. 7.

public class area {
    public static void main(String[] args) {
        System.out.println("Amanjeet loves whom??");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number : ");
        double radius = in.nextDouble();
        System.out.println(circle(radius));
    }

    // if radius of circle is given
    private static double circle(double r){
        return 3.14*r*r;
    }
    // area of tringle
    private static double tringle(double h,double b){
        return (0.5*b*h);
    }
    // area of square
    private  static double square(double l){
        return l*l;
    }
    // area of ractangle
    private  static double ractangle(double l , double b){
        return l*b;
    }
    // area of isoscalaus tringle
    private  static  double isoTringle(double h,double b){
        return  tringle(h,b);
    }
    // area of paralellogram
    private  static  double parlellogram(double l ,double h){
        return l*h;
    }
    // area of rhombus when both digonal is given
    private static  double rhombus(double b,double h){
        return 0.5*b*h;
    }
    // area of equilatiral tringle
    private static double equilateralTrinle(double a){
        return (1.732*a*a)/4;
    }
}
