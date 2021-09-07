package threads;

import java.util.Objects;

public class ThreadLocalDemoInitialValue {

    public static void main(String[] args) {

        ThreadLocal tl = new ThreadLocal() {
            public Object initialValue() {
                return "abc";
            }
        };
        System.out.println(tl.get()); // abc - initial value
        tl.set("akhil");
        System.out.println(tl.get());// akhil - new set value
        tl.remove();
        System.out.println(tl.get()); // after removal reinitialized to abc
    }
}
