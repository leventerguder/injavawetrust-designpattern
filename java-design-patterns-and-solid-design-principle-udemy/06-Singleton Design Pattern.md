# Singleton Design Pattern

- A singleton class has only one instance, accessible globally through a single point.
- Main problem this pattern solves is to ensure that only a single instance of this class exists.
- Any state you add in your singleton becomes part of "global state" of your application.

## Implement a Singleton

- Controlling instance creation.
    - Class constructor(s) must be not be accessible globally.
    - Subclassing/inheritance must not be allowed.
- Keeping track of instance.
    - Class itself is a good place to track the instance.
- Giving access to the singleton instance.
    - A public static method is good choice.
    - Can expose instance as final public static field but it won't work for all singleton implementations.

Two Options for implementing a singleont.

- Early Initialization - Eager Singleton
    - Create Singleton as soon as class is load.
- Lazy Initialization - Lazy Singleton
    - Singleton is created when it is first required.

## Implementation Considerations

- Early/Eager initialization is the simplest & preferred way. Always try to use this approach first.
- The "classic" singleton pattern implementation uses double check locking and volatile field.
- The Lazy initialization holder idiom provides best of both worlds , you don't deal with synchronization issues
  directly and is easy to implement.
- You can also implement singletons using enums. However due to pre-conceptions about what an enum is , it may be a hard
  sell during code review especially if singleton has mutable fields.
- If the simple solution works then use it.

## Design Considerations

- Singleton creation does not need any parameters. If you find yourself in need of support for constructor arguments ,
  you
  need a simple factory or factory method pattern instead.
- Make sure that your singleton are not carrying a lot of mutable global state.

## Example of A singleton Pattern

- The java.lang.Runtime class in standard Java API is a singleton.

## Compare & Contrast with Factory Method Pattern

Primary purpose or intent of singleton pattern is to ensure that only one instance of a class is ever created.
Singleton instance is created without any need of arguments from client code.

Factory method is primarily used to isolate client code from object creations & delegate object creation to subclasses.
Factory method allows to parameterize the object creation.

## Pitfalls

Singleton pattern can deceive you about true dependencies. Since they are globally accessible its easy to miss
dependencies.

They are hard to unit test. You cannot easily mock the instance that is returned.

Most common way to implement Singletons in Java is through static variables and they are held per class loader not per
JVM.
So they may not be truly Singleton in an OSGI or web application.

A Singleton carrying around a large mutable global state is a good indication of an abused Singleton pattern.

## Summary

- Singleton pattern is used when you want to ensure that only one instance of a class exists in application.
- In Java we achieve this by making constructor private, this also prevents inheritance & providing public a public
  static method which returns the singleton instance.
- In eager loading singleton, we create instance as soon as class is loaded by classloader.
- In lazy loading singleton, we defer creation until some code actually requests the instance.
- Always prefer eager loading instance unless creation cost is high and start-up time impact is noticeable.

There are very few situations where a Singleton is really a good choice.

- Application configuration values can be tracked in a singleton. Typically, these are read from file at start and then
  referred to by other parts of application.
- Logging frameworks also make use of Singleton pattern.
- Spring framework treats all beans by default as singletons. In Spring, we don't have to make any changes to ensure
  single instance, Spring handles that for us.

Singletons are easy to overuse & abuse. Any mutable state of a singleton is now a global state. A large global state
makes it harder to maintain application as it can be modified from any part of application.