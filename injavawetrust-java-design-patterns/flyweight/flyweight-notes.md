
# Flyweight Pattern

## GoF Definition

Use sharing to support large numbers of fine-grained objects efficiently.

## Concept

A flyweight is a shared object that can be used in multiple contexts simultaneously.
The flyweight acts as an independent object in each context.
It is indistinguishable from an instance of the object that's not shared.
Flyweights cannot make assumptions about the context in which they operate.

When you consider flyweight pattern , you need to remember following points :
- The pattern is useful when you need a large number of similar objects that are unique in terms
of only a few parameters and most of the sutffs are common in general.
  
- A flyweight is an object. It tries to minimize memory usage by sharing data as much as possible with other
similar objects. Sharing objecst may allow their usage at fine granularities with minimum costs.
  
- Two common terms are used in this context : extrinsic and intrinsic
An intrinsic state is stored/shared in the flyweight object, and it is independent of flyweight's context.
  On the other hand, an extrinsic state varies with flyweight's context, which is why they cannot be shared.
Client objects maintain the extrinsic state, and they need to pass this to a flyweight.
Note tht, if required , clients can also computer the extrinsic state on the fly using flyweights. 
  
- Experts suggest that while implementing this pattern , we should make intrinsic states immutable.

## Computer World Example

Suppose that you want to make a website where different users can compile and 
execute the programs with their preferred computer languages, such as Java, C++, C#, and so forth.

If you need to set up a unique environment for each individual user within a short period of time, 
your site will overload and the response time of the server will become so slow 
that no one will be interested in using your site.

So, instead of creating a new programming environment for every user, 
you can make a common programming environment (which supports different programming language
with/without minor changes) among them. And to check the existing/available programming environment 
and to make decisions whether you need to create a new one or not, you can maintain a factory.

Consider another example. Suppose that in a computer game, 
you have large number of participants whose core structures are same, 
but their appearances vary (e.g., different states, colors, weapons, etc.)

Therefore, assume that if you need to create (or store) all of these objects with 
all of these variations/states, the memory requirement will be huge.

So, instead of storing all of these objects, you can design your application in such way 
that you create these instances with common properties (flyweights with
intrinsic state) and your client object maintains all of these variations (extrinsic states).

In Java, you may notice the use of this pattern when you use the wrapper classes , such as java.lang.Integer
java.lang.Short , where the static method valueOf() replicates a factory method.
(it is worth remembering that some of the wrapper classes,
such as java.lang.Double and java.lang.Float, do not follow this pattern.) 
The Spring pool is another example of a flyweight.

## Questions & Answers

1 -  I notice some similarities between a singleton pattern and a flyweight pattern.
Can you highlight the key differences between them ?

The singleton pattern helps you maintain only one required obejct in the system.
In othet words , once the required object is created, you cannot create more.
You need to reuse the existing object.

The flyweight pattern is generally concerned about a large number of similar (which can be heavy) objects,
because they may occupy big blocks of memory.
So you try to create a smaller set of template objects that can be configured 
on the fly to complete the creation of heavy objects.

These smaller and configurable objects are called flyweights. 
You can reuse them in your application to appear that you have many large objects.
This approach helps you reduce the consumption of big chunks of memory.
Basically, flyweights make one look like many. 

This is why the GoF tells us: A flyweight is a shared object that can be
used in multiple contexts simultaneously. The flyweight acts as an independent object in each context 
— it’s indistinguishable from an instance of the object that’s not shared.


Heavy Object 1 = Flyweight Object (shared) + Configuration 1
(extrinsic and not shared)

Heavy Object 2 = Flyweight Object(shared) + Configuration 2 
(extrinsic and not shared)

By combining the intrinsic and extrinsic states, the flyweight objects provide the complete functionality.


2 - Can you observe any impact due to multithreading ?

If you are creating objects with new operators in multithreaded environment,
you may end up with multiple unwanted objecst (similar to singleton pattern).
The remedy is similar to the way you handle multithreaded environment in a singleton pattern.

3 -  What are the advantages of using flyweight design patterns ?

- You can reduce memory consumptions of heavy objects that can be controlled identically.
- You can reduce the total number of "complete but similar objects" in the system.
- You can provide a centralized machanism to contorl the states of many "virtual" objects.

4 - What are the challenges associated with using flyweight design patterns ?

- In this pattern , you need to take the time to configure these flyweights.
The configuration time can impact the overall performance of the application.
  
- To create flyweights , you extract a common template class from the existing objects.
This additional layer of programming can be tricky and sometimes hard to debug and maintain.

- You can see that logical instances of a class cannot behave differently from other instances.
- The flyweight pattern is often combined with singleton factory implementation and to guard singularity
additional cost is required ( you may opt for a synchronized method or double-checked locking, but each of them
  are costly operations.)
  
5 - Can i have non-shareable flyweight interface?

Yes. A flyweight interface does not enforce that it needs to always be shareable.
In some cases, you may non-shareable flyweights with concrete flyweight objects as children.
In our example , you saw the use of non-shareable flyweights using fixed size robots.


6 - Since intrinsic data of flyweights are the same, I can share them. Is this correct?

Yes

7 - How do clients handle the extrinsic data of these flyweights?

They need to pass the information (states) to the flyweights.
Clients either manage the data or compute them on the fly.

8 - Extrinsic data is not shareable. Is this correct?

Yes

9 - You said that I should try to make intrinsic states immutable. How can I achieve that?

Yes , for thread safety and security, experts suggest that you implement that.
In this case , it is already implemented. In Java , you must remember that String objects are inherently immutable.

Also , you may notice that in the concrete flyweights , here are no setter methods to set/modify the value
of robotTypeCreated.
When you supply the data only through a constructor and there are no setter methods, you are following an 
approach that promotes immutability.


10 - You have tagged the final keyword with the intrinsic state robotTypeCreated to achieve immutability. 
Is this correct?

You need to remember that final and immutability are not synonymous. 
In the context of design patterns, the word immutability generally means that once created, 
you cannot change the state of the object. 
Although the keyword final can be applied to a class, a method, or a field, the aim is different.

The final field can help you construct a thread-safe immutable object without synchronization, 
and it provides safety in a multithreaded environment. So, I used it in this example.
The concept is described in detail in the article at 
https:// docs.oracle.com/javase/specs/jls/se7/html/jls-17. html#jls-17.5-110.

11 - The getRobotFromFactory() method is synchronized here to provide thread safety. Is this understanding correct?
Exactly. In a single-threaded environment, it is not required.

12 - The getRobotFromFactory() method is static here. Is that mandatory?

No. You can implement a non-static factory method also.
You may often notice the presence of a singleton factory with flyweight pattern implementations.

13 - What is the role of “RobotFactory” in this implementation?

It catches flyweights and provides a method to get them.
In this example , there are many objects that can be shared.
So, storing them in a central is always a good idea.

