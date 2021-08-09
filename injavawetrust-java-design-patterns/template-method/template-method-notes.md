# Template Method Pattern

## GoF Definition

Define the skeleton of an algorithm in an operation, deferring some steps to subclasses.
Template method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

## Concept

In a template method,  you define the minimum or essential structure of an algorithm.
Then you defer some responsibilities to the sublcasses.
The key intent is that you can redefine certain steps of an algorithm, but those changes should not impact
the basic flow of the algorithm.

So, this design pattern is useful when you implement a multistep algorithm and you want to allow customization through
subclasses.

##  Computer-World Example

Suppose that you are making a program to design engineering courses. 
Let’s assume that the first semester is common for all streams.
In subsequent semesters, you need to add new papers/subjects to the application based on the course.
Remember that this pattern makes sense when you want to avoid duplicate codes in your application. 
At the same time, you may want to allow subclasses to change some specific details of the base class workflow to 
provide varying behaviors in the application.

The removeAll() method of java.util.AbstractSet is an example of the template method pattern.
There are many non-abstract methods in java.util.AbstractMap and java.util.AbstractSet classes
which can also be considered as the examples of the template method pattern.

## Questions & Answers

1 - In this pattern, I am seeing that subclasses can simply redefine the methods as per their need. 
Is the understanding correct?

Yes

2 - In the abstract class BasicEngineering, only one method is abstract, 
other two methods are concrete methods. What is the reason behind it?

It is a simple example with only 3 methods where I wanted the subclasses to 
override only the completeSpecialPaper() method. 
Other methods are common to both stream and they do not need to be overridden by 
the subclasses.

3 - Consider a situation like this: Suppose you want to add some more methods in the BasicEngineering class 
but you want to work on those methods if and only if, the child classes need them otherwise you will ignore them. 
This type of situation is very common in some PhD courses where some courses are not mandatory for all candidates. 
For example, if a student has certain qualifications, he/she may not need to attend the lectures of those subjects. 
Can you design this kind of situation with the Template Method Pattern?

Yes, we can. Basically, you may need to put a hook which is nothing 
but a method that can help us to control the flow in an algorithm.

4 - Looks like this pattern is similar to Builder pattern.Is the understanding correct ?
No. You should not forget the core intent;Template Method is
a behavioral design patterns, and Builder is a creational design pattern. 
In Builder Patterns, the clients/customers are the boss. 
they can control the order of the algorithm. 
On the other hand, in Template Method pattern, you are the boss.
you put your code in a central location and you only provide the corresponding behavior 
(For example, notice the completeCourse() method in BasicEngineering 
and see how the course completion order is defined there).
So, you have absolute control over the flow of the execution. 
You can also alter your template as per your need and then other participants need to 
follow you.

5 - What are the key advantages of using a template design pattern?
You can control the flow of the algorithms. 
Clients cannot change them. 
(Notice that completeCourse() is marked with final keyword in the abstract class BasicEngineering)

Common operations are placed in a centralized location, for example, in an abstract class. 
The subclasses can redefine only the varying parts, so that, you can avoid redundant codes.

6 - What are key challenges associated with a template design pattern?

Client code cannot direct the sequence of steps (If you need that approach, you may follow the Builder pattern).

A subclass can override a method defined in the parent class (i.e. hiding the original definition in parent class) 
which can go against Liskov Substitution Principle that basically says: If S is a subtype of T, 
then objects of type T can be replaced with objects of type
S. You can learn the details from the following link: https:// en.wikipedia.org/wiki/Liskov_substitution_principle

More subclass means more scattered codes and difficult maintenance.

7 - Looks like the subclasses can override other parent methods also in the BasicEngineering. 
Is the understanding correct?

You can do this but ideally that should not be your intent. 
In this pattern, you may not want to override all the parent methods entirely to bring the radical changes in the subclasses. 
In this way, it differs from simple polymorphism.
