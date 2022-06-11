# Abstract Factory Design Pattern

Abstract factory is used when we have two or more objects which work together forming a kit or set and there can be
multiple sets or kits that can be created by client code.

So we separate client code from concrete objects forming such a set and also from the code which creates these sets.

## Implement Abstract Factory

We start by studying the product "sets"

- Create abstract factory as an abstract class or an interface.
- Abstract factory defines abstract methods for creating products.
- Provide concrete implementation of factory for each set of products.

Abstract factory makes use of factory method pattern, You can think of abstract factory as an object with multiple
factory methods.

## Implementation Considerations

Factories can be implemented as singletons,we typically ever need only one instance of it anyway.
But make sure to familiarize yourself with drawbacks of singletons.

Adding a new product type requires changes to the base factory as well as all implementations of factory.

We provide the client code with concrete factory so that it can create objects.

## Design Considerations

When you want to constrain object creations so that they all work together then abstract factory is good design pattern.

Abstract factory uses factory method pattern.

If objects are expensive to create then you can transparently switch factory implementations to use prototype design
pattern to create objects.

## Example of an Abstract Factory

- The java.xml.parsers.DocumentBuilderFactory is a good example of an abstract factory pattern.
- However, this implementation doesn't match 100% with the UML of abstract factory from GOF. The class has a static new
  instance method which returns actual factory class object.
- The newInstance method however uses classpath scanning, system properties, an external property file as ways to go
  find the factory class & creates the factory object. So we can change the factory class being used , even if this is a
  static method.

## Compare & Contrast with Factory Method

Abstract Factory :

- Hides factories as well as concrete objects used from the client code.
- Suitable when multiple objects are designed to work together & client must use products from single family at a time.

Factory Method

- Hides the concrete objects which are used from the client code.
- Concerned with one product & it's subclasses. Collaboration of product itself with other objects is irrelevant.

Abstract factory pattern typically creates a family of objects/products while Factory method pattern creates objects
from a single inheritance hierarchy.

A product family has classes whose objects work with each other to achieve some functionality.
These classes can belong to different inheritance hierarchy.
Using abstract Factory the client code is unaware of the concrete factory class that it is using as well as the
products. Client code works with interface or abstract class references.

## Pitfalls

- A lot more complex to implement than factory method.
- Adding a new product requires changes to base factory as well as all implementation factory.
- Difficult to visualize the ned at start of development and usually starts out as a factory method.
- Abstract factory design pattern is very specific to the problem "product families".

## Summary

- When you have multiple sets of objects where objects in one set work together then you can use abstract factory
  pattern to isolate client code from concrete objects & their factories.
- Abstract factory itself uses factory method pattern you can think of them as objects with multiple factory methods.
- Adding a new product type needs changes to base factory and all its implementations.
- Concrete factories can be singleton as wee need only one instance of them in code.
- We provide client code with concrete factory instance, Factories can be changed at runtime.
