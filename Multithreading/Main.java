import java.util.Random;

class RandomNumberGenerator extends Thread {
    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int num = random.nextInt(100); // Generate a random integer between 0 and 99
            System.out.println("Generated number: " + num);
            if (num % 2 == 0) {
                synchronized (Main.lock) {
                    Main.evenNum = num;
                    Main.evenReady = true;
                    Main.lock.notifyAll();
                }
            } else {
                synchronized (Main.lock) {
                    Main.oddNum = num;
                    Main.oddReady = true;
                    Main.lock.notifyAll();
                }
            }
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class SquareCalculator extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Main.lock) {
                while (!Main.evenReady) {
                    try {
                        Main.lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int num = Main.evenNum;
                System.out.println("Square of " + num + ": " + (num * num));
                Main.evenReady = false;
            }
        }
    }
}


class CubeCalculator extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Main.lock) {
                while (!Main.oddReady) {
                    try {
                        Main.lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int num = Main.oddNum;
                System.out.println("Cube of " + num + ": " + (num * num * num));
                Main.oddReady = false;
            }
        }
    }
}


public class Main {
    static final Object lock = new Object();
    static volatile boolean evenReady = false;
    static volatile boolean oddReady = false;
    static volatile int evenNum;
    static volatile int oddNum;


    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        SquareCalculator squareCalculator = new SquareCalculator();
        CubeCalculator cubeCalculator = new CubeCalculator();
        randomNumberGenerator.start();
        squareCalculator.start();
        cubeCalculator.start();
    }
}