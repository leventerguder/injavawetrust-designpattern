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

1. Eager Initialization
2. Static Block Initialization
3. Lazy Initialization
4. Thread Safe Singleton
5. Bill Pugh Singleton Implementation
6. Using Reflection to Destroy Singleton Pattern
7. Enum Singleton
8. Serialization and Singleton

## Eager Initialization

In eager initialization, the instance of Singleton Class is created at the time of class loading, this is the easiest
method to create a singleton class but it has a drawback that instance is created even though client application might
not be using it.

If your singleton class is not using a lot of resources, this is the approach to use. But in most of the scenarios,
Singleton classes are created for resources such as File System, Database connections etc. We should avoid the
instantiation until unless client calls the getInstance() method. Also, this method doesn't provide any options for
exception handling.

## Static Block Initialization

Static Block Initialization implementation is similar to eager initialization, except that instance of class is created
in the static block that provides option for exception handling.

But eager initialization and static block initialization creates the instance even before it's being used that is not
the best practice to use. So in further sections, we will learn how to create a Singleton class that supports lazy
initialization.

## Lazy Initialization

Lazy initialization method to implement Singleton pattern creates the instance in the global access method. Here is the
sample code for creating Singleton class with this approact.

The implementation works fine in case of the single-threaded environment but when it comes to multithreaded systems, it
can cause issues if multiple threads are inside the if condition at the same time. It will destroy the singleton pattern
and both threads will get the different instances of the singleton class.`
