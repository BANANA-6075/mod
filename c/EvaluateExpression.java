/* 4.	Write a Java program to evaluate the expression x/(x-5) where x>5, if the value of x is less than or equal to 5 throw a user defined exception.
*/ 

import java.io.*;

// User-defined exception
class InvalidValueException extends Exception {
    InvalidValueException(String msg) {
        super(msg);
    }
}

// Main class
public class EvaluateExpression {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter value of x: ");
        double x = Double.parseDouble(br.readLine());

        try {
            // Check condition
            if (x <= 5) {
                throw new InvalidValueException("Error: x must be greater than 5!");
            }

            // Compute expression
            double result = x / (x - 5);
            System.out.println("Result of x/(x-5) = " + result);
        }
        catch (InvalidValueException e) {
            System.out.println(e.getMessage());
        }
    }
}
