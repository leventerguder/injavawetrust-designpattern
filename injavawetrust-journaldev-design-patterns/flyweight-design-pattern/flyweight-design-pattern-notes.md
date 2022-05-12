# Flyweight Design Pattern

According to GoF, flyweight design pattern intent is ;

Use sharing to support large numbers of fine-grained objects efficiently.

Flyweight design pattern is a Structural Design Pattern like Facade,Adapter, and Decorator.
Flyweight design pattern i used when we need to create a lot of Objects of a class. Since every object consumes memory
space that can be crucial for low memory devices, such as mobile devices or embedded systems, flyweight design pattern
can be applied to reduce the load on memory by sharing objects.

Before we apply flyweight design pattern, we need to consider following factors;

- The number of Objects to be created by application should be huge.
- The object creation is heavy on memory ,and it can be time-consuming too.
- The object properties can be divided into intrinsic and extrinsic properties, extrinsic properties of an Object
  should be defined by the client program.

To apply flyweight pattern, we need to divide Object property into intrinsic and extrinsic properties. Intrinsic
properties make the Object unique whereas extrinsic properties are set by client code and used to perform different
operations. For example, an Object Circle can have extrinsic properties such as color and width.

For applying flyweight pattern, we need to create a Flyweight factory that returns the shared objects.

## Flyweight Design Pattern Example in JDK

All wrapper classes valueOf() method uses cached objects showing use of Flyweight design pattern.
The best example is Java String class String Pool implementation.

## Flyweight Design Pattern Important Points

- The client code is not forced to create object using Flyweight factory but we can force that make sure client code
  uses flyweight pattern implementation but its a complete design decision for particular application.
- Flyweight pattern introduces complexity and if number of shared objects are huge then there is a trade of between
  memory and time, so we need to use it judiciously based on our requirements.
- Flyweight pattern implementation is not useful when the number of intrinsic properties of Object is huge, making
  implementation of Factory class complex.