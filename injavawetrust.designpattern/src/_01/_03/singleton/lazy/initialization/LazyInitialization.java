package _01._03.singleton.lazy.initialization;

public class LazyInitialization {

    private static LazyInitialization instance;

    private LazyInitialization() {

    }

    //Not Thread Safe!
    public static LazyInitialization getInstance() {
        if (instance == null) {
            instance = new LazyInitialization();
        }
        return instance;
    }
}
