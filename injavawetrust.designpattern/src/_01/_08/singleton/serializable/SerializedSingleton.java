package _01._08.singleton.serializable;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = 1L;

    private SerializedSingleton() {
    }

    private static class SingletonHelper {
        private static final SerializedSingleton INSTANCE = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private Object readResolve() {
        System.out.println("readResolve is called...");
        return getInstance();
    }

}
