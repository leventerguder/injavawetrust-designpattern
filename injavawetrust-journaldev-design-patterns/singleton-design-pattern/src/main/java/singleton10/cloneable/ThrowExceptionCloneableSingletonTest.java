package singleton10.cloneable;

public class ThrowExceptionCloneableSingletonTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        ThrowExceptionCloneableSingleton instance1 = ThrowExceptionCloneableSingleton.getInstance();
        ThrowExceptionCloneableSingleton instance2 = (ThrowExceptionCloneableSingleton) instance1.clone();

        /*
        To overcome this issue, override clone() method and throw an exception from clone method that is
        CloneNotSupportedException. Now whenever user will try to create clone of singleton object, it will throw exception and
        hence our class remains singleton.

         */

        System.out.println("instance1 hashCode:- " + instance1.hashCode());
        System.out.println("instance2 hashCode:- " + instance2.hashCode());
        System.out.println(instance1 == instance2);
    }
}
