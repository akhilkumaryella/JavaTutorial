package designpatterns.singleton;

import java.util.function.Predicate;

public class LazySingleton {

    private static LazySingleton lazySingletonInstance;


    private LazySingleton(){}

    public static LazySingleton getInstance() {
        // lazy initialization
        if(lazySingletonInstance == null) {
            lazySingletonInstance = new LazySingleton();
        }
        return lazySingletonInstance;
    }

    public static void main(String[] args) {

        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        System.out.println(lazySingleton1);
        System.out.println(lazySingleton2);

        System.out.println(lazySingleton1 == lazySingleton2);
        System.out.println(lazySingleton1.hashCode() == lazySingleton2.hashCode());

    }

}



