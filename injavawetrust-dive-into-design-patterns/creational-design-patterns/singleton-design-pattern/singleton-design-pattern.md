# Singleton

Singleton is a creational design pattern that lets you ensure that a class has only one instance , while providing
a global access point to this instance.

The Singleton Pattern solves two problems at the same time, violating the Single Responsibility Principle :

1 - Ensure that a class has just a single instance.
Why Would anyone want to control how many instance a class has ? The most common reason for this is to control access to
some shared resource - for example, a database or a file.

2 - Provide a global access point to that instance.
Remember those global variables that you used to store some essential objects ?
While they're very handy, they're also very unsafe since any code can potentially overwrite the contents of those 
variables and crash the app.

Singleton hs almost the same pros and const as global variables. Although 

## Solution

All implementations of the Singleton have these 2 steps in common:

- Make the default constructor private, to prevent other objects from using the new operator with the Singleton class.
- Create a static creation method that acts as a constructor. Under the hood, this method calls the private constructor
to create an object and saves it in a static field. All following calls to this method return the cached object.

If your code has access to the Singleton class, then it's able to call singleton's static method.
So whenever that method is called , the same object is always returned. 

## Applicability

- Use the Singleton pattern when a class in your program should have just a single instance available to all clients;
for example, a single database object shared by different parts of the program.

- Use the Singleton pattern when you need stricter control over global variables.

## Pros and Cons

- You can be sure that a class has only a asingle instance.
- You gain a global access point to that instance.
- The singleton object is initialized only when it's requested for the first time.
- Violates the Single Responsibility Principle. The pattern solves two problems at the time.
- The Singleton pattern can mask bad design, for instance when components of the program know too much about each other.
- The pattern requires special treatment in a multithreaded environment so that multiple threads won’t create 
a singleton object several times.
- It may be difficult to unit test the client code of the Singleton because many test frameworks rely on inheritance 
when producing mock objects. Since the constructor of the singleton class is private and overriding static methods is 
impossible in most languages, you will need to think of a creative way to mock the singleton. 
Or just don’t write the tests. Or don’t use the Singleton pattern

## Relations with Other Patterns

- A Facade class can often be transformed into a Singleton since a single facade object is sufficient in most cases.
- Flyweight would resemble Singleton if you somehow man- aged to reduce all shared states of the objects to just one flyweight object. 
But there are two fundamental differences between these patterns:
  - There should be only one Singleton instance, whereas a Flyweight class can have multiple instances with different intrinsic states.
  - The Singleton object can be mutable. Flyweight objects are immutable.
- Abstract Factories, Builders and Prototypes can all be implemented as Singletons.

## Usage of the Pattern in Java

A lot of developers consider the Singleton pattern an antipattern. That's why it usage is on the decline in java code.
Despite this , there are quite alot of Singleton examples in Java core libraries.

java.lang.Runtime#getRuntime()
java.awt.Desktop#getDesktop()
java.lang.System#getSecurityManager()

Singleton can be recognized by a statis creation method, which returns the same cached object.

