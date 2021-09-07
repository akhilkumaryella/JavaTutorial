package threads;

public class ThreadLocalDemo {

    public static void main(String[] args) {

        ThreadLocal tl = new ThreadLocal();
        System.out.println(tl.get()); // null - initial value
        tl.set("akhil");
        System.out.println(tl.get());// akhil - new set value
        tl.remove();
        System.out.println(tl.get()); // after removal reinitialized to null
    }
}
