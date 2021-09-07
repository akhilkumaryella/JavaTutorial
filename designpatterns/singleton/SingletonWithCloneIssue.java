package designpatterns.singleton;

public class SingletonWithCloneIssue extends CloneableIssue{

    private static SingletonWithCloneIssue lazySingletonInstance;

    private SingletonWithCloneIssue(){}

    public static SingletonWithCloneIssue getInstance() {
        // lazy initialization
        if(lazySingletonInstance == null) {
            lazySingletonInstance = new SingletonWithCloneIssue();
        }
        return lazySingletonInstance;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        SingletonWithCloneIssue lazySingleton1 = SingletonWithCloneIssue.getInstance();
        SingletonWithCloneIssue lazySingleton2 = (SingletonWithCloneIssue) lazySingleton1.clone();

        System.out.println(lazySingleton1);
        System.out.println(lazySingleton2);

        System.out.println(lazySingleton1 == lazySingleton2);
        System.out.println(lazySingleton1.hashCode() == lazySingleton2.hashCode());
    }


}


