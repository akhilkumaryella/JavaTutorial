package threads;

public class ThreadGroupDemo {

    public static void main(String[] args) {

        // to get thread group name
        System.out.println(Thread.currentThread().getThreadGroup().getName());

        // to get parent group
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

        // creating thread group
        ThreadGroup firstThreadGroup = new ThreadGroup("First Group");

        // get name of created group
        System.out.println(firstThreadGroup.getName());

        // Parent group for this firstThreadGroup is Main Thread group
        // because its executing by Main Thread
        System.out.println(firstThreadGroup.getParent().getName());

        // To explicitly mention parent thread group
        ThreadGroup secondThreadGroup = new ThreadGroup(firstThreadGroup, "second group");

        // here parent group is firstThreadGroup
        System.out.println(secondThreadGroup.getParent().getName());

        Thread t1 = new Thread(firstThreadGroup, "Thread1");
        Thread t2 = new Thread(firstThreadGroup, "Thread2");
        t1.start();
        t2.start();
        firstThreadGroup.setMaxPriority(3);
        Thread t3 = new Thread(firstThreadGroup, "Thread3");
        System.out.println(t1.getPriority()); //  5
        System.out.println(t2.getPriority()); // 5
        System.out.println(t3.getPriority()); // 3 - because after setting max priority t3 created, then for only t3 it will reflects

        // prints information about thread group to console
        firstThreadGroup.list();

        // Number of active threads in firstThread group
        System.out.println(firstThreadGroup.activeCount());

        // Number of active Thread groups in firstThread group
        System.out.println(firstThreadGroup.activeGroupCount());

        // get system group Threads
        ThreadGroup systemGroup = Thread.currentThread().getThreadGroup().getParent();

        Thread[] threads = new Thread[systemGroup.activeCount()];

        // copying all system group active threads to thread array
        systemGroup.enumerate(threads);

        // iterating though all system group threads
        for(Thread ts : threads) {
            System.out.println(ts.getName() +"    " +ts.isDaemon());
        }
    }
}
