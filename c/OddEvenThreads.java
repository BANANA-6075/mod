/* 10.	Write a Java program to implement two threads, one for printing odd numbers and another for even numbers simultaneously.
*/ 


class EvenThread extends Thread {
    private final Object lock;

    public EvenThread(Object lock) {
        this.lock = lock;
    }

    public void run() {
        synchronized(lock) {
            System.out.println("Even Numbers:");
            for (int i = 2; i <= 50; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

class OddThread extends Thread {
    private final Object lock;

    public OddThread(Object lock) {
        this.lock = lock;
    }

    public void run() {
        synchronized(lock) {
            System.out.println("Odd Numbers:");
            for (int i = 1; i <= 50; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

public class OddEvenThreads {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        EvenThread evenThread = new EvenThread(lock);
        OddThread oddThread = new OddThread(lock);

        evenThread.start();
        oddThread.start();

        evenThread.join();
        oddThread.join();
    }
}
