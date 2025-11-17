/*Create an abstract class called Figure which contains three data members ( length, breadth and height). Include an abstract method to find the area .Figure class also contains concrete methods to read the data members and to display them. Derive two classes Rectangle and Triangle from Figure and override area() to find the area of a rectangle and triangle. */



abstract class Figure {
    int length, breadth, height;

    // Constructor to assign values
    Figure(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    // Abstract method
    abstract void area();

    // Concrete method
    void display() {
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Height = " + height);
    }
}

// Rectangle class
class Rectangle extends Figure {

    Rectangle(int l, int b) {
        super(l, b, 0);   // height not used
    }

    void area() {
        int ar = length * breadth;
        System.out.println("Area of Rectangle = " + ar);
    }
}

// Triangle class
class Triangle extends Figure {

    Triangle(int b, int h) {
        super(0, b, h);  // length not used
    }

    void area() {
        double ar = 0.5 * breadth * height;
        System.out.println("Area of Triangle = " + ar);
    }
}

// Main class
public class AbstractDemo1 {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 20);
        Triangle t = new Triangle(30, 40);

        System.out.println("Rectangle:");
        r.display();
        r.area();

        System.out.println("\nTriangle:");
        t.display();
        t.area();
    }
}
