package serialization;

import java.io.*;

public class SerializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Dog dog = new Dog();
        FileOutputStream fileOutputStream = new FileOutputStream("abc.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(dog);

        FileInputStream fileInputStream = new FileInputStream("abc.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Dog dog1 = (Dog) objectInputStream.readObject();
        System.out.println(dog1.i +"   "+dog1.j+"  "+dog1.k+"  "+dog1.l+" "+ dog1.m + " " +dog1.name);

    }
}

class Dog implements Serializable{

    int i = 10;

    // if we are using transient keyword to variable then value won't be stored(to understand this is sensitive data)
    // Actually default value stores in file and while reading also default value retrieved
    transient int j = 20;

    // static variables are not part of Object
    // transient with static no use
    transient static int k = 30;

    // final variables are stored as values not variable form
    // transient with final no use
    transient final int l = 40;

    static int m = 50;

    String name = "akhil";

}
