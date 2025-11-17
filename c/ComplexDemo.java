/* 8.	Write a Java program to create a class Complex for reading and displaying a complexnumber under a user defined package comp.
*/ 

// File: ComplexDemo.java

import java.io.*; // for BufferedReader

// "Complex" class (like in package comp)
class Complex {
    private double real;
    private double imag;

    // Method to read complex number
    public void readComplex() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter real part: ");
        real = Double.parseDouble(br.readLine());
        System.out.print("Enter imaginary part: ");
        imag = Double.parseDouble(br.readLine());
    }

    // Method to display complex number
    public void displayComplex() {
        System.out.println("Complex number: " + real + " + " + imag + "i");
    }
}

// Main class (must match filename)
public class ComplexDemo {
    public static void main(String[] args) throws IOException {
        Complex c = new Complex();

        c.readComplex();    // read input
        c.displayComplex(); // display complex number
    }
}
