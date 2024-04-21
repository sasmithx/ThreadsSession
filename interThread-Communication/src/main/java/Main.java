class Q{
    int num;
    public void put(int num){
        System.out.println("PUT : " + num);
        this.num = num;
    }

    public void get(){
        System.out.println(num);
    }
}

class Producer implements Runnable{
    Q q;

    public Producer(Q q){
        this.q = q;
        Thread t1 = new Thread(this,"Producer");
        t1.start();
    }

    @Override
    public void run () {
        int i=0;
        while(true){
            q.put(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {
    public static void main (String[] args) {
        System.out.println("Hello World");
    }
}
