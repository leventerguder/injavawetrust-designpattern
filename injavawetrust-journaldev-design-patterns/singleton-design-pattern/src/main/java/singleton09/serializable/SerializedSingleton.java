package singleton09.serializable;

import java.io.Serial;
import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    @Serial
    private static final long serialVersionUID = 8457537228387900772L;

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }
}

/*
Serialization can also cause breakage of singleton property of singleton classes. Serialization is used to convert an
object of byte stream and save in a file or send over a network. Suppose you serialize an object of a singleton class.
Then if you de-serialize that object it will create a new instance and hence break the singleton pattern.
 */
