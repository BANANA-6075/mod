/* 6.	Create an interface Shape and a child class Circle. Shape has member function calculateArea() and a constant data member pi(3.14). Write a java program to compute area.
*/ 



import java.io.*; // For BufferedReader

// Interface Shape
interface Shape {
    double pi = 3.14;        // constant
    double calculateArea();   // abstract method
}

// Circle class implementing Shape
class Circle implements Shape {
    private double radius;

    // Constructor to initialize radius
    Circle(double r) {
        radius = r;
    }

    // Implement calculateArea method
    public double calculateArea() {
        return pi * radius * radius;
    }
}

// Main class
public class CircleAreaDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter radius of circle: ");
        double r = Double.parseDouble(br.readLine());

        Circle c = new Circle(r);
        double area = c.calculateArea();

        System.out.println("Area of circle = " + area);
    }
}
