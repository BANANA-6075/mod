/* 3.	Write a Java Program to print factorial of a given number. If the number is negativethen throw a user defined exception.
*/ 


import java.io.*;

// User-defined exception for negative numbers
class NegativeNumberException extends Exception {
    NegativeNumberException(String msg) {
        super(msg);
    }
}

// Main class
public class FactorialWithException {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        try {
            // Check for negative number
            if (num < 0) {
                throw new NegativeNumberException("Error: Factorial of negative numbers is not defined!");
            }

            // Compute factorial
            long fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }

            System.out.println("Factorial of " + num + " is: " + fact);
        }
        catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
