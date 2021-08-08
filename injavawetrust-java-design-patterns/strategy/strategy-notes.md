# Strategy (Policy) Pattern

## GoF Definition

Define a family of algorithms, encapsulate each one, and make them interchangeable.
Strategy lets the algorithm vary independently from the clients that use it.

## Concept

Suppose there is an application where you have multiple algorithms and each of these algorithms can perform a specific task.
A client can dynamically pick any of these algorithms to serve its current need.

The strategy pattern suggests that you implement these algorithms in separate classes.
When you encapsulate an algorithm in a separate class, you call it a strategy.
An object that uses the strategy object is often referred to as a context object.
These "algorithms" are also called behaviors in some applications.

## Computer world Example

Suppose that you have a list of integers and you want to sort them.
You do this by using various algorithms; for example, Bubble Sort, Merge Sort, Quick Sort, Insertion Sort, and so forth.
So, you can have a sorting algorithm with many different variations. 
Now you can implement each of these variations (algorithms) in separate classes and pass the objects of these classes 
in client code to sort your integer list.

You can consider the java.util.Comparator interface in this context.
You can implement this interface and provide multiple implementations of comparators with different algorithms
to do various comparisons using the compare() method.
This comparison result can be further used in various sorting techniques.
The Comparator interface plays the role of a strategy interface in this context.


## Questions & Answers

1 - Why are you complicating the example by avoiding simple subclassing of these behaviors?

In object-oriented programming, you may prefer to use the concept of polymorphism so that your code can pick the intended 
object (among different object types) at runtime, leaving your code unchanged.

When you are familiar with design patterns, most often, you prefer composition over inheritance.

Strategy patterns help you combine composition with polymorphism. Let’s examine the reasons behind this.

It is assumed that you try to use the following guidelines in any application you write:
 - Separate the code that varies a lot from the part of code that does not vary.
 - Try to maintain the varying parts as freestanding as possible (for easy maintenance).
 - Try to reuse them as much as possible.

Following these guidelines, I have used composition to extract and encapsulate the volatile/varying parts of the code, 
so that the whole task can be handled easily, and you can reuse them.

But when you use inheritance, your parent class can provide a default implementation, 
and then the derived class changes it (Java calls it overriding it). 
The next derived class can further modify the implementation, 
so you are basically spreading out the tasks over different levels, 
which may cause severe maintenance and extensibility issues in the future. 

2 - If this is the case, you could create a separate interface, 
TransportInterface, and place the showTransportMedium() method in that interface. 
Now any class that wants to get the method can implement that interface also. 
Is this understanding correct?

Yes, you can do that.

3 - Can you modify the default behavior at runtime in your implementation?
Yes, you can.


4 - Can you use an abstract class instead of an interface?
Yes. It is suitable in some cases where you may want to put common behaviors in the abstract class.

5 - What are the key advantages of using a strategy design pattern?

- This pattern makes your classes independent from algorithms. 
Here, a class delegates the algorithms to the strategy object (that encapsulates the algorithm) dynamically at runtime. 
So, you can simply say that the choice of the algorithm is not bound at compile time.
- Easier maintenance of your codebase.
- It is easily extendable.

6 - What are key challenges associated with a strategy design pattern?

- The addition of context classes causes more objects in our application
- Users of the application must be aware of different strategies; otherwise, the output may surprise them. 
So, there exists a tight coupling between the client code and the implementation of different strategies.
- When you introduce a new behavior/algorithm, you may need to change the client code also.
