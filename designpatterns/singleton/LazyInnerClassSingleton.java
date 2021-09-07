package designpatterns.singleton;

public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){}

    private static class SingletonHelper {
        private static final LazyInnerClassSingleton instance = new LazyInnerClassSingleton();
    }

    public static LazyInnerClassSingleton getInstance() {

        return SingletonHelper.instance;
    }

    public static void main(String[] args) {

        LazyInnerClassSingleton lazySingleton1 = LazyInnerClassSingleton.getInstance();
        LazyInnerClassSingleton lazySingleton2 = LazyInnerClassSingleton.getInstance();

        System.out.println(lazySingleton1);
        System.out.println(lazySingleton2);

        System.out.println(lazySingleton1 == lazySingleton2);
        System.out.println(lazySingleton1.hashCode() == lazySingleton2.hashCode());
    }


}


