/* 9.	Write a Java Program to create a class Factorial for computing factorial of number using a user defined package fact.
*/ 


// File: FactorialDemo.java

import java.io.*; // for BufferedReader

// Factorial class (non-public so we can have one file)
class Factorial {
    // Method to compute factorial
    long computeFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

// Main class
public class FactorialDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        String input = br.readLine();
        int num = Integer.parseInt(input);

        Factorial f = new Factorial();
        long result = f.computeFactorial(num);

        System.out.println("Factorial of " + num + " is: " + result);
    }
}
