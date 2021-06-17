# One-of-a-Kind Objects

## Singleton Pattern defined
The Singleton Pattern ensures a class has only one instance , and provides a global point of access to it.

## Be the JVM
We have two threads, each executing this code. 
Your job is to play the JVM and determine whether there is a case in which two threads might get a hold of different boiler objects

## Dealing with multithreading

Our multithreading woes are almost trivially fixed by making getInstance() a synchronized method:

## Can we improve multithreading ?

- Do nothing if the performance of getInstance isnt critical to your application
That’s right; if calling the getInstance() method isn’t causing substantial overhead for your application, forget about it. Synchronizing getInstance() is straightforward and effective. Just keep in mind that synchronizing a method can decrease performance by a factor
of 100, so if a high-traffic part of your code begins using getInstance(), you may have to reconsider.

- Move to an eagerly created instance rather than a lazily created one

- Use "double-checked-locking" to reduce the use of synchronization in getInstance()

## Good Idea!

Many of the problems we’ve discussed—worrying about synchronization, class loading issues, 
reflection, and serialization/ deserialization issues—can all be solved by using an enum to 
create your Singleton.

## Bullet Points
- The Singleton Pattern ensures you have at most one instance of a class in your application.

- The Singleton Pattern also provides a global access point to that instance.

- Java's implementation of the Singleton Pattern use of a private constructor, a static method combined
with a static variable.
  
- Examine your performance and resource constraints and carefully choose an appropriate Singleton implementation for multithreaded applications (and we should
  consider all applications multithreaded!).
  
- Beware of the double- checked locking implementation; it isn’t thread safe in versions before Java 5.

- Be careful if you are using multiple class loaders; this could defeat the Singleton implementation and result in multiple instances.

- You can use Java’s enums to simplify your Singleton implementation.
