/**
 * Created by Julie on 29-09-2016.
 */

public class MaxValue extends Thread{
    private int max = 0;
    private int start;
    private int stop;
    private int[] arr;

    public MaxValue(int[] arrInput, int start, int stop) {
        this.arr = arrInput;
        this.start = start;
        this.stop = stop;

    }

    public int getMax() {
        return this.max;
    }

    @Override
    public void run() {
        for (int i = start; i < stop; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
    }


}