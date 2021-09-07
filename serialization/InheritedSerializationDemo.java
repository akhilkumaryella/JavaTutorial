package serialization;

import java.io.*;

/**
 * Serializable nature inherits from parent to cild
 */
public class InheritedSerializationDemo {

    public static void main(String[] args) throws Exception {

        // normal inherited serialization flow
        SavingsAccount savingsAccount = new SavingsAccount(10, 20);
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(savingsAccount);

        // when parent is non serializable, child is serializable
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SavingsAccount savingsAccount1 = (SavingsAccount) ois.readObject();
        System.out.println(savingsAccount1.i +" "+savingsAccount1.j);



        Child c = new Child();
        c.i = 100;
        c.j = 200;

        FileOutputStream fos1 = new FileOutputStream("abc.ser");
        ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
        oos1.writeObject(c);

        FileInputStream fis1 = new FileInputStream("abc.ser");
        ObjectInputStream ois1 = new ObjectInputStream(fis1);
        Child child1 = (Child) ois1.readObject();
        System.out.println(child1.i +" "+child1.j);


    }

}


class SavingsAccount  extends SampleAccount{

    int i;
    int j;

    SavingsAccount(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

class SampleAccount implements Serializable {

}

class Parent  {

    int i = 10;
    Parent() {
        System.out.println("no-arg constructor called");
    }
}

class Child extends Parent implements Serializable {

    int j = 20;
}


