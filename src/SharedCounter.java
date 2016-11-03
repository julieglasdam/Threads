/**
 * Created by Julie on 03-10-2016.
 */
public class SharedCounter extends Thread{
    private static int count;
    public SharedCounter(){}
    public SharedCounter(int count) {
        this.count = count;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            count++;
            System.out.print(count + " ");
        }
    }

}
