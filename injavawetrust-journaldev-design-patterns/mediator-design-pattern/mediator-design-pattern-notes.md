# Mediator Design Pattern

Mediator design pattern is one of the behavioral design pattern, so it deals with the behaviors of objects. Mediator
design pattern is used to provide a centralized communication medium between different objects in a system.

According to GoF mediator pattern intent is :

Allows loose coupling by encapsulating the way disparate sets of objects interact and communicate with each other.
Allows for the actions of each object set to vary independently of one another.

Mediator design pattern is very helpful in an enterprise application where multiple objects are interacting with each
other. If the objects interact with each other direct, the system components are tightly-coupled with each other that
makes higher maintainability cost and not hard to extend.
Mediator pattern focuses on provide a mediator between objects for communication and help in implementing loose coupling
between objects.

Air traffic controller is a great example of mediator pattern where the airport control room works as a mediator for
communication between different flights. Mediator works as a router between objects and it can have it’s own logic to
provide way of communication.

## Mediator Pattern Example in JDK

- java.util.Timer class scheduleXXX methods
- Java Concurrency Executor execute()
- java.lang.reflect.Method invoke method.

## Mediator Design Pattern Important Points

- Mediator pattern is useful when the communication logic between objects is complex, we can have a central point of
  communication that takes care of communication logic.
- Java Message Service (JMS) uses Mediator pattern along with Observer Pattern to allow applications to subscribe and
  publish data to other applications.
- We should not use mediator pattern just to achieve loose coupling because if the number of mediator will grow then it
  will become hard to maintain them.