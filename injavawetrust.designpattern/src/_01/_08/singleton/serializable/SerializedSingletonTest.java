package _01._08.singleton.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializedSingletonTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		SerializedSingleton instance = SerializedSingleton.getInstance();

		FileOutputStream fileOutputStream = new FileOutputStream("singleton.serial");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(instance);
		
		objectOutputStream.flush();
		objectOutputStream.close();

		FileInputStream fileInputStream = new FileInputStream("singleton.serial");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		SerializedSingleton deserialized = (SerializedSingleton) objectInputStream.readObject();
		objectInputStream.close();

		System.out.println(instance == deserialized);

	}
}
