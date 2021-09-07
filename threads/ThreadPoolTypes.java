package threads;

import java.util.concurrent.*;

public class ThreadPoolTypes {

    public static void main(String[] args) {

        // Fixed thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // cached thread pool
        // if any new task coming then it checks if there is any waiting thread else creates new
        // and also it kills thread which idle for more than 60 sec
        ExecutorService executorService1 = Executors.newCachedThreadPool();

        // scheduled thread pool
        ScheduledExecutorService executorService2 =  Executors.newScheduledThreadPool(10);

        // task to run after 10 sec
        executorService2.schedule(new Task(), 10, TimeUnit.SECONDS);

        // task to run repeatedly after 10 sec
        executorService2.scheduleAtFixedRate(new Task(), 15, 10, TimeUnit.SECONDS);

        // task to run repeatedly 10 sec after previous task completes
        executorService2.scheduleWithFixedDelay(new Task(), 15, 10, TimeUnit.SECONDS);

        // single threaded executor -- poolsize is 1
        ExecutorService executorService3 = Executors.newSingleThreadExecutor();


    }
}

class Task implements Runnable{

    public void run() {

    }
}
