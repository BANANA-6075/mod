/* 1.	Write a Java program to find the area of a triangle and rectangle using method overloading. */

import java.io.*;

// Class with overloaded methods
class AreaCalculator {

    // Method 1: area of rectangle
    double area(double length, double breadth) {
        return length * breadth;
    }

    // Method 2: area of triangle
    double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}

// Main class
public class AreaDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        AreaCalculator calc = new AreaCalculator();

        // Rectangle
        System.out.println("Rectangle Area:");
        System.out.print("Enter length: ");
        double length = Double.parseDouble(br.readLine());
        System.out.print("Enter breadth: ");
        double breadth = Double.parseDouble(br.readLine());
        double rectArea = calc.area(length, breadth);
        System.out.println("Area of rectangle = " + rectArea);

        // Triangle
        System.out.println("\nTriangle Area:");
        System.out.print("Enter base: ");
        double base = Double.parseDouble(br.readLine());
        System.out.print("Enter height: ");
        double height = Double.parseDouble(br.readLine());
        double triArea = calc.area(base, height, true); // boolean used to differentiate
        System.out.println("Area of triangle = " + triArea);
    }
}
