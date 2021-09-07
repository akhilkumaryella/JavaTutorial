package designpatterns.singleton;

import java.io.*;

public class SingletonSerializationSolution implements Serializable{

    private static SingletonSerializationSolution singletonSerializationSolution;

    private SingletonSerializationSolution(){}

    public static SingletonSerializationSolution getInstance() {
        // lazy initialization
        if(singletonSerializationSolution == null) {
            singletonSerializationSolution = new SingletonSerializationSolution();
        }
        return singletonSerializationSolution;
    }

    // to resolve issue coming in Deserialization implement this method
    private Object readResolve() {
        return singletonSerializationSolution;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        SingletonSerializationSolution singletonSerializationSolution1 = SingletonSerializationSolution.getInstance();

        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(singletonSerializationSolution1);

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SingletonSerializationSolution singletonSerializationSolution2 =
                 (SingletonSerializationSolution) ois.readObject();

        System.out.println(singletonSerializationSolution1);
        System.out.println(singletonSerializationSolution2);
        
        System.out.println(singletonSerializationSolution1 == singletonSerializationSolution2);
        System.out.println(singletonSerializationSolution1.hashCode() == singletonSerializationSolution2.hashCode());
    }
}
