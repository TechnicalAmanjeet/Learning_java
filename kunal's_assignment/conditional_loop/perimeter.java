package com.Conditional_loop;

import java.util.Scanner;
// in this i have done basic assignment of conditional loop q. 7 to q. 13.
public class perimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Amanjeet loves whoom??");
    }
    // if radius of circle is given
    private static double circle(double r){
        return 3.14*r*2;
    }
    // area of tringle
    private static double tringle(double a,double b,double c){
        return (a+b+c);
    }
    // area of square
    private  static double square(double l){
        return 4*l;
    }
    // area of ractangle
    private  static double ractangle(double l , double b){
        return (l+b)*2;
    }
    // area of isoscalaus tringle
    private  static  double isoTringle(double a,double b){
        return  2*a+b;
    }
    // area of paralellogram
    private  static  double parlellogram(double l ,double h){
        return 2*(l+h);
    }
    // area of rhombus when side is given
    private static  double rhombus(double a){
        return 4*a;
    }
    // area of equilatiral tringle
    private static double equilateralTrinle(double a){
        return 3*a;
    }
}
