/* 2.	Write a java program to perform the arithmetic operations using the concept of method overloading.
a) Get two integers as input and return float value as output.
    b) Get two float value as input and return integer value as output.

*/ 


import java.io.*;

// Class with overloaded methods
class Arithmetic {
    
    // Method 1: two integers as input, return float
    float operate(int a, int b, char op) {
        switch(op) {
            case '+': return (float)(a + b);
            case '-': return (float)(a - b);
            case '*': return (float)(a * b);
            case '/': return (float)a / b; // cast to float
            default: return 0;
        }
    }

    // Method 2: two floats as input, return integer
    int operate(float a, float b, char op) {
        switch(op) {
            case '+': return (int)(a + b);
            case '-': return (int)(a - b);
            case '*': return (int)(a * b);
            case '/': 
                if (b != 0) return (int)(a / b);
                else {
                    System.out.println("Division by zero!");
                    return 0;
                }
            default: return 0;
        }
    }
}

// Main class
public class MethodOverloadingDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Arithmetic ar = new Arithmetic();

        // Case a: integers -> float
        System.out.println("Case a) Two integers -> float result");
        System.out.print("Enter first integer: ");
        int i1 = Integer.parseInt(br.readLine());
        System.out.print("Enter second integer: ");
        int i2 = Integer.parseInt(br.readLine());
        System.out.print("Enter operation (+,-,*,/): ");
        char op1 = (char)br.readLine().charAt(0);

        float result1 = ar.operate(i1, i2, op1);
        System.out.println("Result = " + result1);

        System.out.println("\nCase b) Two floats -> integer result");
        System.out.print("Enter first float: ");
        float f1 = Float.parseFloat(br.readLine());
        System.out.print("Enter second float: ");
        float f2 = Float.parseFloat(br.readLine());
        System.out.print("Enter operation (+,-,*,/): ");
        char op2 = (char)br.readLine().charAt(0);

        int result2 = ar.operate(f1, f2, op2);
        System.out.println("Result = " + result2);
    }
}
