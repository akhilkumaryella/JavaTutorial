package serialization;

import java.io.*;

public class CustomizedSerializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Account a = new Account("akhil", "kumar", 1234);
        FileOutputStream fileOutputStream = new FileOutputStream("abc.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(a);

        FileInputStream fileInputStream = new FileInputStream("abc.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Account a1 = (Account) objectInputStream.readObject();
        System.out.println(a1.username +"  "+a1.password + " "+a1.pin);
    }
}

class Account implements Serializable {

    String username;
    transient String password;
    transient int pin;

    Account(String username, String password, int pin) {
        this.username = username;
        this.password = password;
        this.pin = pin;
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {

        oos.defaultWriteObject();
        String encryptedPassword = "123" + password;
        oos.writeObject(encryptedPassword);
        String encryptedPin = "1234" + pin;
        oos.writeObject(encryptedPin);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {

        ois.defaultReadObject();
        String encryptedPassword = (String) ois.readObject();
        password = encryptedPassword.substring(3);
        String encryptedPin = (String) ois.readObject();
        pin = Integer.valueOf(encryptedPin.substring(4));

    }
}
