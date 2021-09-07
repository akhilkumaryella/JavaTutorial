package pkg2;

import pkg1.Parent;

public class Child extends Parent {

    public Child(int x, int y) {
        super(x, y);
    }
    public void m2() {
        System.out.println("m2 - child");
    }

}
