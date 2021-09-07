package designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonReflectionSolution {

    private static SingletonReflectionSolution lazySingletonInstance;

    private SingletonReflectionSolution(){
        // it restricts that don't create object instance using reflection api
        if(lazySingletonInstance != null) {
            throw new IllegalStateException("Object can't be create using reflection");
        }
    }

    public static SingletonReflectionSolution getInstance() {
        // lazy initialization
        if(lazySingletonInstance == null) {
            lazySingletonInstance = new SingletonReflectionSolution();
        }
        return lazySingletonInstance;
    }

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {

        SingletonReflectionSolution lazySingleton1 = SingletonReflectionSolution.getInstance();

        SingletonReflectionSolution lazySingleton2 = null;


        Constructor[] constructors = SingletonReflectionSolution.class.getDeclaredConstructors();
        for (Constructor constructor :  constructors) {
            constructor.setAccessible(true);
            lazySingleton2 = (SingletonReflectionSolution) constructor.newInstance();
        }

        System.out.println(lazySingleton1);
        System.out.println(lazySingleton2);

        System.out.println(lazySingleton1 == lazySingleton2);
        System.out.println(lazySingleton1.hashCode() == lazySingleton2.hashCode());
    }


}


