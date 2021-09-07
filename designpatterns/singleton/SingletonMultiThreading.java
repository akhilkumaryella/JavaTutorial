package designpatterns.singleton;

import java.util.TreeMap;

public class SingletonMultiThreading {

    private static volatile SingletonMultiThreading lazySingletonInstance;

    private SingletonMultiThreading(){}

    // make thread safe for Thread safe
    public static SingletonMultiThreading getInstance() {
        // lazy initialization
        if(lazySingletonInstance == null) {
            synchronized (SingletonMultiThreading.class) {
                if(lazySingletonInstance == null) {
                    lazySingletonInstance = new SingletonMultiThreading();
                }
            }
        }
        return lazySingletonInstance;
    }

    public static void main(String[] args) {

        SingletonMultiThreading lazySingleton1 = SingletonMultiThreading.getInstance();
        SingletonMultiThreading lazySingleton2 = SingletonMultiThreading.getInstance();

        System.out.println(lazySingleton1);
        System.out.println(lazySingleton2);

        System.out.println(lazySingleton1 == lazySingleton2);
        System.out.println(lazySingleton1.hashCode() == lazySingleton2.hashCode());
    }


}


