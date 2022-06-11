package lazy.singleton;

public class Client {

    public static void main(String[] args) {

        LazyRegistryWithDCL registry = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL registry2 = LazyRegistryWithDCL.getInstance();

        System.out.println(registry.equals(registry2));

        LazyRegistryIODH registryIODH = LazyRegistryIODH.getInstance();
        LazyRegistryIODH registryIODH2 = LazyRegistryIODH.getInstance();

        System.out.println(registryIODH.equals(registryIODH2));

        RegistryEnum registryEnum = RegistryEnum.INSTANCE;
        RegistryEnum registryEnum2 = RegistryEnum.INSTANCE;

        System.out.println(registryEnum.equals(registryEnum2));
    }
}
