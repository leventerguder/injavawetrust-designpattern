# https://www.journaldev.com/1827/java-design-patterns-example-tutorial#singleton-pattern

# Singleton Design Pattern

- GoF Creational Pattern
- Only one instance of class
- Must have global access point to create the instance.

Singleton Pattern is one of the Gangs of Four Design Patterns and comes in the Creational Design Pattern category. From
the definition, it seems to be a very simple design pattern but when it comes to implementation, it comes with a lot of
implementation concerns.

The implementation of Java Singleton pattern has always been a controversial topic among developers. Here we will learn
about Singleton design pattern principles, different ways to implement the Singleton design pattern and some of the best
practices for its usage.

## Singleton Design Pattern

- Singleton Design Pattern restricts the instantiation of a class and ensures that only one instance of the class exists
  in the Java Virtual Machine.
- The Singleton must provide a global access point to get the instance of the class.
- Singleton Design Pattern is used for logging, drivers objects, caching and thred pool.
- Singleton Design Pattern is also used in other design patterns like AbstactFactory, Builder , Prototype, Facade.
- Singleton Design Pattern is used in core Java classes also.
    - java.lang.Runtime
    - java.awt.Desktop

## Java Singleton Design Pattern Implementation

To implement a Singleton Design Pattern, we have different approaches but all of them have the following common
concepts.

- Private constructor to restrict instantiation of the class from other classes.
- Private static variable of the same class that is the only instance of the class.
- Public static method that returns the instance of the class, this is the global access point for outer world to get
  the instance of the singleton class.

