package designpatterns.singleton;

import java.io.*;

public class SingletonSerializationIssue implements Serializable{

    private static SingletonSerializationIssue singletonSerializationIssue;

    private SingletonSerializationIssue(){}

    public static SingletonSerializationIssue getInstance() {
        // lazy initialization
        if(singletonSerializationIssue == null) {
            singletonSerializationIssue = new SingletonSerializationIssue();
        }
        return singletonSerializationIssue;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        SingletonSerializationIssue singletonSerializationIssue1 = SingletonSerializationIssue.getInstance();

        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(singletonSerializationIssue1);

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SingletonSerializationIssue singletonSerializationIssue2 =
                 (SingletonSerializationIssue) ois.readObject();

        System.out.println(singletonSerializationIssue1);
        System.out.println(singletonSerializationIssue2);

        System.out.println(singletonSerializationIssue1 == singletonSerializationIssue2);
        System.out.println(singletonSerializationIssue1.hashCode() == singletonSerializationIssue2.hashCode());
    }
}
