package ch05.examples.v5;

public enum Singleton {
    UNIQUE_INSTANCE;
}

class SingletonClient {

    void test(){
        Singleton singleton = Singleton.UNIQUE_INSTANCE;
    }
}
