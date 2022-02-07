package singleton09.serializable;

import java.io.Serial;
import java.io.Serializable;

public class SerializedReadResolveSingleton implements Serializable {

    @Serial
    private static final long serialVersionUID = 8457537228387900772L;

    private static class SingletonHelper {
        private static final SerializedReadResolveSingleton instance = new SerializedReadResolveSingleton();
    }

    public static SerializedReadResolveSingleton getInstance() {
        return SingletonHelper.instance;
    }

    // implement readResolve method
    protected Object readResolve() {
        return getInstance();
    }
}

/*
To overcome this issue, we have to implement method readResolve() method.
 */
