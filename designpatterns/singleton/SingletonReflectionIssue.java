package designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonReflectionIssue {

    private static SingletonReflectionIssue lazySingletonInstance;

    private SingletonReflectionIssue(){}

    public static SingletonReflectionIssue getInstance() {
        // lazy initialization
        if(lazySingletonInstance == null) {
            lazySingletonInstance = new SingletonReflectionIssue();
        }
        return lazySingletonInstance;
    }

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {

        SingletonReflectionIssue lazySingleton1 = SingletonReflectionIssue.getInstance();

        SingletonReflectionIssue lazySingleton2 = null;


        Constructor[] constructors = SingletonReflectionIssue.class.getDeclaredConstructors();
        for (Constructor constructor :  constructors) {
            constructor.setAccessible(true);
            lazySingleton2 = (SingletonReflectionIssue) constructor.newInstance();
        }

        System.out.println(lazySingleton1);
        System.out.println(lazySingleton2);

        System.out.println(lazySingleton1 == lazySingleton2);
        System.out.println(lazySingleton1.hashCode() == lazySingleton2.hashCode());
    }


}


