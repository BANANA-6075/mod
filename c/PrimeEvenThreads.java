/* Write a Java program to implement two threads one for printing prime numbers and theother for printing even numbers simultaneously.
*/ 


class EvenThread extends Thread {
    private final Object lock;

    public EvenThread(Object lock) {
        this.lock = lock;
    }

    public void run() {
        synchronized (lock) { // ensures clean printing
            System.out.println("Even Numbers:");
            for (int i = 2; i <= 50; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println(); // newline
        }
    }
}

class PrimeThread extends Thread {
    private final Object lock;

    public PrimeThread(Object lock) {
        this.lock = lock;
    }

    public void run() {
        synchronized (lock) { // ensures clean printing
            System.out.println("Prime Numbers:");
            for (int i = 2; i <= 50; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); // newline
        }
    }

    private boolean isPrime(int n) {
        for (int j = 2; j <= n / 2; j++) {
            if (n % j == 0) return false;
        }
        return true;
    }
}

public class PrimeEvenThreads {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object(); // shared lock for synchronized printing

        EvenThread evenThread = new EvenThread(lock);
        PrimeThread primeThread = new PrimeThread(lock);

        evenThread.start();
        primeThread.start();

        // Wait for both threads to finish
        evenThread.join();
        primeThread.join();
    }
}
