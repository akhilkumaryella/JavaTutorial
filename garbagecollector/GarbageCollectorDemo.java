package garbagecollector;

public class GarbageCollectorDemo {

    public static void main(String[] args) {

        GarbageCollectorDemo gcd = new GarbageCollectorDemo();
        gcd = null;

        // manually calling garbage collector
        // one way of calling garbage collector
        System.gc();
        // finalize method called only once
        // even though if you call garbage collector multiple time, finalize() method called only once
        System.gc();
        // another way of calling garbage collector
        // Runtime.getRuntime().gc();
        System.out.println("Main Method called");

    }

    // this method is to ensures whether garbage collector called or not
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }
}


