package threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

    public static void main(String[] args) throws InterruptedException {

        Display d = new Display();
        MyThread t1 = new MyThread("Akhil", d);
        MyThread t2 = new MyThread("Akhil-2", d);
        Thread.sleep(2000);
        t1.start();
        t2.start();
    }
}

class MyThread extends Thread {

    Display d;
    String name;

    MyThread(String name, Display d) {

        this.d = d;
        this.name = name;
    }

    public void run() {
        try {
            d.wish(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Display {

    ReentrantLock l = new ReentrantLock();
    public void wish(String name) throws InterruptedException {

        if(l.tryLock(11, TimeUnit.SECONDS)) {
            System.out.println(Thread.currentThread().getName() +" get lock :: " );
            for (int i = 0; i < 10; i++) {
                System.out.println("Good Morning : " + name);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            l.unlock();
        } else {
            System.out.println(Thread.currentThread().getName() +" not able to get lock :: " );
        }
    }
}
