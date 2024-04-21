class Calculation{
    int num;
    public void increment(){
        num++;
    }
}

public class Main {
    public static void main (String[] args) throws InterruptedException {
       Calculation calc = new Calculation();
       calc.num=0;

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                calc.increment();
            }

        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                calc.increment();
            }

        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(calc.num);
    }
}
