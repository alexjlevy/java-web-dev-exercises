package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("What is the circle's radius?: ");
            if (!input.hasNextDouble()) {
                System.err.println("Please enter a valid Number");
                input = new Scanner(System.in);
            }
        } while (!input.hasNextDouble());
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);
        System.out.println("The area of your circle is: " + area);
    }
}
