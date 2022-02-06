package singleton08.enumsingleton;

import singleton07.reflection.destroy.EagerInitializedSingleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

    public static void main(String[] args) {

        EnumSingleton instanceOne = EnumSingleton.INSTANCE;
        EnumSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EnumSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EnumSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
        System.out.println(instanceOne == instanceTwo);
    }
}

/*
https://www.geeksforgeeks.org/prevent-singleton-pattern-reflection-serialization-cloning/

Overcome reflection issue: To overcome issue raised by reflection, enums are used because java ensures internally that
enum value is instantiated only once. Since java Enums are globally accessible, they can be used for singletons. Its
only drawback is that it is not flexible i.e it does not allow lazy initialization.

As enums don’t have any constructor so it is not possible for Reflection to utilize it. Enums have their by-default
constructor, we can’t invoke them by ourself. JVM handles the creation and invocation of enum constructors internally.
As enums don’t give their constructor definition to the program, it is not possible for us to access them by Reflection
also. Hence, reflection can’t break singleton property in case of enums.

 */
