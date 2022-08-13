package com.bridgelabz;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Point X1");
        double x1 = scanner.nextDouble();
        System.out.println("Enter the Point Y1");
        double y1 = scanner.nextDouble();
        System.out.println("Enter the Point X2");
        double x2 = scanner.nextDouble();
        System.out.println("Enter the Point Y2");
        double y2 = scanner.nextDouble();
        double LengthOfLine = sqrt((Math.pow((x2-x1),2)+(Math.pow((y2-y1),2))));
        System.out.println("Length of Line is : "+LengthOfLine);
    }
}
