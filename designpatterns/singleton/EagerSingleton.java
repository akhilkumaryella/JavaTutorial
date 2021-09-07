package designpatterns.singleton;

public class EagerSingleton {

    // eager initialization
    private static EagerSingleton eagerSingletonInstance = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance() {
        return eagerSingletonInstance;
    }

    public static void main(String[] args) {

        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();

        System.out.println(eagerSingleton1);
        System.out.println(eagerSingleton2);

        System.out.println(eagerSingleton1 == eagerSingleton2);
    }


}


