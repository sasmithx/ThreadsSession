class MyRunnable implements Runnable {

    @Override
    public void run () {
        System.out.println("Thread is running.");
    }
}

public class Main2 {
    public static void main(String[] args) {
//        Create Instance of MyRunnable
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
