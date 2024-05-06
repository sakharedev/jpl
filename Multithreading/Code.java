package Multithreading;

class Thread1 extends Thread {
    public void run() {
        System.out.println("Hello");
    }

}

public class Code {
    public static void main(String[] args) {
        Thread1 t = new Thread1();
        t.start();
    }
}
