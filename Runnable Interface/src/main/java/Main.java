class One implements Runnable {
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

class Two implements Runnable {
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
    public static void main(String[] args) throws InterruptedException {
        One one = new One();
        Two two = new Two();
//        one.run();
//        Thread.sleep(1000);
//        two.run();

        Thread threadOne = new Thread(one);
        Thread threadTwo = new Thread(two);
        threadOne.start();
        Thread.sleep(10);
        threadTwo.start();
    }
}
