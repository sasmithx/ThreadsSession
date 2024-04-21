class One extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread One");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Two extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Two");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class Main {
    public static void main (String[] args) throws InterruptedException {
        System.out.println("Hello World");

        One one = new One();
        Two two = new Two();
        one.start();
        Thread.sleep(10);
        two.start();
    }
}
