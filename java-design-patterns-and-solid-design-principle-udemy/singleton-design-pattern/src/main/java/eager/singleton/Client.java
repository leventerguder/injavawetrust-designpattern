package eager.singleton;

public class Client {

    public static void main(String[] args) {


        EagerRegistry registry = EagerRegistry.getInstance();
        EagerRegistry registry2 = EagerRegistry.getInstance();

        System.out.println(registry.equals(registry2));

    }

}
