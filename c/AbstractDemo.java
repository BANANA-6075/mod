/*Create an abstract class called Figure which contains three data members ( length, breadth and height). Include an abstract method to find the area .Figure class also contains concrete methods to read the data members and to display them. Derive two classes Rectangle and Triangle from Figure and override area() to find the area of a rectangle and triangle. */


import java.util.Scanner;

// Abstract class
abstract class Figure {
    double length, breadth, height;

    // Concrete method: read values
    void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }

    // Concrete method: display values
    void displayData() {
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Height = " + height);
    }

    // Abstract method
    abstract void area();
}

// Rectangle class
class Rectangle extends Figure {
    void area() {
        double a = length * breadth;
        System.out.println("Area of Rectangle = " + a);
    }
}

// Triangle class
class Triangle extends Figure {
    void area() {
        double a = 0.5 * breadth * height;
        System.out.println("Area of Triangle = " + a);
    }
}

// Main class
public class AbstractDemo {
    public static void main(String[] args) {

        System.out.println("---- Rectangle ----");
        Figure f1 = new Rectangle();
        f1.readData();
        f1.displayData();
        f1.area();

        System.out.println("\n---- Triangle ----");
        Figure f2 = new Triangle();
        f2.readData();
        f2.displayData();
        f2.area();
    }
}
