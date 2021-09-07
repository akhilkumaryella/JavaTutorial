package threads;

import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentPackageDemo {

    public static void main(String[] args) {

        ReentrantLock l = new ReentrantLock(true);
        // locked by current thread - main
        l.lock();
        l.lock();

        System.out.println(l.isLocked());
        // how many times this lock hold by current Main thread
        System.out.println(l.getHoldCount()); // 2
        // Whether this lock is held by current thread
        System.out.println(l.isHeldByCurrentThread());
        // returns any waiting threads
        System.out.println(l.getQueueLength());
        // unlock once
        l.unlock();
        System.out.println(l.isLocked());
        System.out.println(l.getHoldCount()); // 1
        l.unlock();
        System.out.println(l.isLocked());
        System.out.println(l.isFair());
    }
}
