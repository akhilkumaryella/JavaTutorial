package threads;

import java.util.concurrent.*;


public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        MyCallable[] callables = {
                  new MyCallable(10),
                  new MyCallable(20),
                  new MyCallable(30),
                  new MyCallable(40),
                  new MyCallable(50)
                };

        ExecutorService service = Executors.newFixedThreadPool(3);
        for(MyCallable callable : callables) {
            // Future is an object used to hold the output of Thread
            Future future = service.submit(callable);
            System.out.println(future.get());
        }
        service.shutdown();
    }
}

// Callable job used for get result from Thread
// where as runnable  job returns void
class MyCallable implements Callable {

    int num;
    MyCallable(int num) {
        this.num = num;
    }

    @Override
    public Object call()  {

        System.out.println(Thread.currentThread().getName() + " responsible for calculating sum of "+ num);
        long sum = 0;
        for(int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
