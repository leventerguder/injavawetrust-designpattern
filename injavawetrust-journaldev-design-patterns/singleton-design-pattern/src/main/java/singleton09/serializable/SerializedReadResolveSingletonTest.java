package singleton09.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializedReadResolveSingletonTest {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedReadResolveSingleton instance1 = SerializedReadResolveSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename-v2.ser"));
        out.writeObject(instance1);
        out.close();

        //deserialize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename-v2.ser"));
        SerializedReadResolveSingleton instance2 = (SerializedReadResolveSingleton) in.readObject();
        in.close();

        System.out.println("instance1 hashCode=" + instance1.hashCode());
        System.out.println("instance2 hashCode=" + instance2.hashCode());
        System.out.println(instance1 == instance2);
    }
}
