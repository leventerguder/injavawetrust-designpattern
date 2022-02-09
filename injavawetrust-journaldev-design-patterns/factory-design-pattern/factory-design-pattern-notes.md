# https://www.journaldev.com/1392/factory-design-pattern-in-java

# Factory Design Pattern

The factory design pattern is used when we have a superclass with multiple sub-classes and based on input, we need to
return one of the subclass.

This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.

## Factory Design Pattern Super Class

Super class in factory design pattern can be an interface, abstract class or a normal java class. For our factory design
pattern example, we have abstract super class with overridden toString() method for testing purpose.

## Factory Design Pattern Advantages

1. Factory Design Pattern provides approach to code for interface rather than implementation.
2. Factory Pattern Removes the instantiation of actual implementation classes from client code. Factory Pattern makes
   our code robust, less coupled and easy to extend. For example, we can easily change PC class implementation because
   client program is unaware of this.
3. Factory pattern provides abstraction between implementation and client classes through inheritance.

## Factory Design Pattern Examples in JDK

1. java.util.Calendar, ResourceBundle , NumberFormat getInstance() methods uses Factory Pattern.
2. valueOf() method in wrapped classes like Boolean , Integer etc.
