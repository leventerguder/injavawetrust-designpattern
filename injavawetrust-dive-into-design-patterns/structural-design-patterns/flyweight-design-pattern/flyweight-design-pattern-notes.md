# Flyweight Design Pattern

Also known as :Cache

Flyweight is a structural design pattern that lets you fit more objects into the available amount of RAM by 
sharing common parts of state between multiple objects instead of keeping all of the data in each object.

## Flyweight and immutability

Since the same flyweight object can be used in different contexts, you have to make sure that its state can'be modified
A flyweight should initialize its state just once via constructor parameters. 
It shouldn't expose any setter or public fields to other objects.

## Flyweight factory

For more convenient access to various flyweights, 
you can create a factory method that manages a pool of existing flyweight objects.


There are several options where this method could be placed. 
The most obvious place is a flyweight container. Alternatively, you could create a new factory class. Or you could make the factory method static and put it inside an actual flyweight class.

## Applicability

Use the Flyweight pattern only when your program must support a huge number of objects which barely fit into available RAM.

The benefit of applying the pattern depends heavily on how and where it's used. It's most useful when :

- an application needs to spawn a huge number of similar objects.
- this drains all available RAM on a target device.
- the objects contain duplicate states which can be extracted and shared between multiple objects.

## Pros and Cons

- (+) You can save lots of RAM, assuming your program has tons of similar objects.
- (-) You might be trading RAM over CPU cycles when some of the context data needs to be recalculated each time somebody calls a flyweight method.
- (-) The code becomes much more complicated. New team members will always be wondering why the state of an entity was separated in such a way.

## Relations with Other Patterns

- You can implement shared leaf nodes of the Composite tree as Flyweights to same some RAM.
- Flyweight shows how to make lots of little objects, whereas Facade shows how to make a single object that represent an entire subsystem
- Flyweight would resemble Singleton if you somehow managed to reduce all shared states of the objects to just one flyweight object.
But there are two fundamental differences between these patterns :
  - There should be only one Singleton instance, whereas a Flyweight class can have multiple instances with different intrinsic states.
  - The Singleton object can be mutable. Flyweight objects are immutable.
