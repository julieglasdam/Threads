/**
 * Created by Julie on 03-10-2016.
 */
public class ReverseHello extends Thread{
    private int countThreads = 0;
    private ReverseHello thread;

    public ReverseHello() {
    }

    public void run() {
        this.countThreads = countThreads+1;
        System.out.println("Hello from thread " + (51-countThreads));
        if (countThreads < 50) {
            run();
        }
    }
}
