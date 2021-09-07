package threads;

// if we remove any synchronized method and converts to normal method
// then there is no DeadLock
public class DeadLock {

    public static void main(String[] args) {

        MyTest myTest = new MyTest();
        MyTest2 myTest2 = new MyTest2();

        Thread t1 = new Thread(() ->  myTest2.m1(myTest));
        t1.start();
        myTest.m1(myTest2);

    }

}

class MyTest {

    public synchronized void m1(MyTest2 myTest2) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyTest -- m1");
        myTest2.m2();
    }

    public synchronized void m2() {
        System.out.println("MyTest -- m2");
    }
}

class MyTest2 {

    public synchronized void m1(MyTest myTest) {
        System.out.println("MyTest2 -- m1");
        myTest.m2();
    }

    public synchronized void m2() {
        System.out.println("MyTest2 -- m2");
    }
}
