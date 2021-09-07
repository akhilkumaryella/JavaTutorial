package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static void main(String[] args) {

        PrintJob[] printJobs = {
                new PrintJob("Akhil-1"),
                new PrintJob("Akhil-2"),
                new PrintJob("Akhil-3"),
                new PrintJob("Akhil-4"),
                new PrintJob("Akhil-5"),
                new PrintJob("Akhil-6"),
                new PrintJob("Akhil-7"),
                new PrintJob("Akhil-8"),
                new PrintJob("Akhil-9"),
                new PrintJob("Akhil-10")
        };

        // 5 threads executes at once
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(PrintJob job : printJobs) {
            executorService.submit(job);
        }
        executorService.shutdown();
    }
}

class PrintJob implements Runnable {

    String name;
    PrintJob(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        System.out.println(name +" :: Job Started by" + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name +" :: Job Completed by" + Thread.currentThread().getName());
    }
}
