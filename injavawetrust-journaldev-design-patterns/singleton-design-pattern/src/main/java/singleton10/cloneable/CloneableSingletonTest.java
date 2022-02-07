package singleton10.cloneable;

public class CloneableSingletonTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        CloneableSingleton instance1 = CloneableSingleton.getInstance();
        CloneableSingleton instance2 = (CloneableSingleton) instance1.clone();

        System.out.println("instance1 hashCode:- " + instance1.hashCode());
        System.out.println("instance2 hashCode:- " + instance2.hashCode());
        System.out.println(instance1 == instance2);
    }
}
