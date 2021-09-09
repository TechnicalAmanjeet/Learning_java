package com.functions;

import java.util.Scanner;

public class circumfrance_and_area_circle {
    // q. 6
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        double radius = in.nextDouble();
        System.out.println("Circumfrance : "+circumfrance(radius));
        System.out.println("Area : "+area(radius));
    }

    private static double area(double radius) {
        return Math.PI*radius*radius;
    }

    private static double circumfrance(double radius) {
        return 2*Math.PI*radius;
    }
}
