
/**
 * Created by Julie on 29-09-2016.
 */
public class Test {
    // private static Account account = new Account(); // random object
    public static int max(int[] arr) throws InterruptedException {
        int max = 0;
        MaxValue[] thread = new MaxValue[4];
        for (int i = 0; i < 4; i++) {
            thread[i] = new MaxValue(arr, (i * arr.length)/4, ((i + 1) * arr.length / 4)); // task
            thread[i].start();
        }

        for (int i = 0; i < 4; i++) {
            thread[i].join();
            if (thread[i].getMax() > max) {
                max = thread[i].getMax();
            }
        }

        return max;
    }

    public static void main(String[] args) throws InterruptedException {
      //  ReverseHello thread = new ReverseHello();
      //  thread.start();


           SharedCounter[] thread = new SharedCounter[10];

        for (int i = 0; i <10; i++){
            thread[i] = new SharedCounter();
            thread[i].start();
        }


    }


        // Array
   /*     int array_length = 20;
        Random r = new Random();
        int[] array = new int[array_length];

        for (int i = 0; i < array_length; i++) {
            array[i] = r.nextInt(100)+1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(max(array));

        // ------- Executor eksempel 2 ------
        ExecutorService executor = Executors.newCachedThreadPool(); // tager ikke parameter
        // tilføj syncronized til en metodes signatur for at undgå at flere threads tilgår metoden på en gang (race condition)

        for (int i = 0; i < 10; i++) {
            executor.execute(new MaxValue(array, i, i*4)); // Tilføj en task
        }

        executor.shutdown();
        while (!executor.isTerminated()) { } // Vent på alle tasks

        // ------- Executor eksempel 1 ------
        //   ExecutorService executor = Executors.newFixedThreadPool(4); // tager int som parameter

 /*       executor.execute(new MaxValue(array, 1, 1));
        executor.execute(new MaxValue(array, 1, 2));
        executor.execute(new MaxValue(array, 1, 3));
        executor.execute(new MaxValue(array, 1, 4));

        executor.shutdown();


/*

        // Tasks
        Runnable task01 = new TaskClass(3);
        Runnable task02 = new TaskClass(2);
        Runnable task03 = new TaskClass(6);
        Runnable task04 = new TaskClass(8);

        // Threads
        Thread thread01 = new Thread(task01);
        Thread thread02 = new Thread(task02);
        Thread thread03 = new Thread(task03);
        Thread thread04 = new Thread(task04);

        // Start threads
        thread01.start();
        thread02.start();
        thread03.start();
        thread04.start();
    } */
}
