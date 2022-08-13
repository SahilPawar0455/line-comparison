package com.bridgelabz;


import static java.lang.Math.sqrt;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        int x1 = 2, x2 = 4, y1 = 3, y2 = 5;
        int a1 = 4, a2 = 6, b1 = 5, b2 = 7;
        double lengthOfLine1 = sqrt((Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2))));
        double lengthOfLine2 = sqrt((Math.pow((a2 - a1), 2) + (Math.pow((b2 - b1), 2))));
        if (lengthOfLine1 == lengthOfLine2) {
            System.out.println("The Length of Line is equal");
        } else if (lengthOfLine1 > lengthOfLine2) {
            System.out.println("The length of first line is greater than second Line");
        } else {
            System.out.println("The length of second line is greater than first Line");
        }
    }
}
