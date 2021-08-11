
# Iterator Pattern

# GoF Definition

Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

## Concept

Using iterators, a client object can traverse a container 
(or a collection of objects) to access its elements without knowing how these data are stored internally. 

The concept is very useful when you need to traverse different kinds of collection objects in a standard and uniform way.
The following are some important points about this pattern.

- It is often used to traverse the nodes of a tree-like structure. 
So, in many scenarios, you may notice the use of iterator patterns with composite patterns.

- The role of an iterator is not limited to traversing. This role can vary to support various requirements.
- Clients cannot see the actual traversal mechanism. 
A client program only uses the iterator methods that are public in nature.

The participants are as follows:

- Iterator: An interface to access or traverse elements.
- ConcreteIterator: Implements the Iterator interface methods. 
  It can also keep track of the current position in the traversal of the aggregate.
- Aggregate: Defines an interface that can create an Iterator object.
- ConcreteAggregate: Implements the Aggregate interface. It returns an
  instance of ConcreteIterator.

## Computer-World Example

the iterator classes in Java’s collection framework are iterator examples. 
When you use the interfaces like java.util.Iterator or java.util.enumeration , you basically use this pattern.
The java.util.Scanner class also follows this pattern.

## Questions & Answers

1 - What is the use of an iterator pattern?
- You can traverse an object structure without knowing its internal details. 
As a result, if you have a collection of different subcollections 
(e.g., your container is mixed up with arrays, lists, or linked lists, etc.), 
you can still traverse the overall collection and deal with the elements in 
a universal way without knowing the internal details or differences among them.

- You can traverse a collection in different ways. 
You can also provide an implementation that supports multiple traversals simultaneously.

2 - What are the key challenges associated with this pattern?
Ideally, during a traversal/iteration process, you should not
perform any accidental modification to the core architecture.

3 - But to deal with the challenge mentioned earlier, you could
make a backup and then proceed. Is this correct?

Making a backup and reexamining later is a costly operation.

4 - Throughout the discussion, you have talked about collections.  What is a collection?

It is a group of individual objects that are presented in a single unit. 
You may often see the use of the interfaces like java.util. 
Collection, java.util.Map, and so forth, in Java programs. 
These are some common interfaces for Java’s collection classes, which were introduced in JDK 1.2.

5 - In the modified implementation, why am I not seeing the @Override annotation for the first() and currentItem() methods?

These two methods are not present in the java.util.Iterator interface. 
The built-in Iterator interface has the hasNext() and next() methods. 
So, I used the @Override annotation for these methods. 
There is another method, remove(), in this interface. It has a default implementation. 
Since I have not used it, I did not need to modify this method.

6 - In these implementations, I am seeing that you are only using strings of arrays to store and manipulate data. 
Can you show an iterator pattern implementation that uses a relatively complex data type and a different data structure?


To make these examples simple and straightforward, I only used strings and an array data structure. 
You can always choose your preferred data structure and apply the same process when you consider a complex data type. 
For example, consider the following illustration (third implementation) with these key characteristics.
