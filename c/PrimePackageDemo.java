/* Write a package program to check whether a  number is prime. Import the package to check whether a number is prime and if the number is prime, check the digits are also prime
*/ 


/*  
---------------- PACKAGE CODE (kept inside comments for lab submission) ----------------

package primepack;

public class PrimeCheck {

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

----------------------------------------------------------------------------------------
*/

import java.io.*;

class PrimeCheck {

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

public class PrimePackageDemo {

    public static void main(String args[]) throws Exception {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int n = Integer.parseInt(br.readLine());

        PrimeCheck pc = new PrimeCheck();

        if (pc.isPrime(n)) {
            System.out.println(n + " is PRIME.");

            // Now check if all digits are prime
            int temp = n;
            boolean allPrime = true;

            while (temp > 0) {
                int digit = temp % 10;
                if (!pc.isPrime(digit)) {
                    allPrime = false;
                    break;
                }
                temp = temp / 10;
            }

            if (allPrime)
                System.out.println("All digits are PRIME.");
            else
                System.out.println("All digits are NOT prime.");
        }
        else {
            System.out.println(n + " is NOT prime.");
        }
    }
}
