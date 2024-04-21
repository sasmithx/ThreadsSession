class MyThread extends Thread {
    public void run() {
        System.out.println("MyFirst Thread");
    }
}

public class Main {
    public static void main (String[] args) {
//        System.out.println("Hello World!");

        MyThread myThread = new MyThread();
        myThread.start();
    }
}
