/* Write a java application program to print odd and even numbers less than 100 using multithreading. */

class OddThread extends Thread {
    public void run() {
        System.out.println("Odd Numbers:");
        for (int i = 1; i < 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class EvenThread extends Thread {
    public void run() {
        System.out.println("Even Numbers:");
        for (int i = 2; i < 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class OddEvenDemo {
    public static void main(String[] args) {
        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();

        odd.start();
        even.start();
    }
}
