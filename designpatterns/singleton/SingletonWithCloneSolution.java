package designpatterns.singleton;

public class SingletonWithCloneSolution extends CloneableIssue{

    private static SingletonWithCloneSolution lazySingletonInstance;

    private SingletonWithCloneSolution(){}

    public static SingletonWithCloneSolution getInstance() {
        // lazy initialization
        if(lazySingletonInstance == null) {
            lazySingletonInstance = new SingletonWithCloneSolution();
        }
        return lazySingletonInstance;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        SingletonWithCloneSolution lazySingleton1 = SingletonWithCloneSolution.getInstance();
        SingletonWithCloneSolution lazySingleton2 = (SingletonWithCloneSolution) lazySingleton1.clone();

        System.out.println(lazySingleton1);
        System.out.println(lazySingleton2);

        System.out.println(lazySingleton1 == lazySingleton2);
        System.out.println(lazySingleton1.hashCode() == lazySingleton2.hashCode());
    }


    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}


