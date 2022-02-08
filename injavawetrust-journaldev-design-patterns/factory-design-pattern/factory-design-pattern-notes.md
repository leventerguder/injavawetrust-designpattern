# https://www.journaldev.com/1392/factory-design-pattern-in-java

# Factory Design Pattern

The factory design pattern is used when we have a superclass with multiple sub-classes and based on input, we need to
return one of the subclass.

This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.

## Factory Design Pattern Super Class

Super class in factory design pattern can be an interface, abstract class or a normal java class. For our factory design
pattern example, we have abstract super class with overridden toString() method for testing purpose.
