# FAQs

1 - Which design pattern do you like the most?

It depends on many factors, such as the context, situation, demand, constraints, and so on. 
If you know about all the patterns, you have more options to choose from.

2 - Why should developers use design patterns?

They are reusable solutions for software design problems that appear repeatedly in real-world software development.

3 - What is the difference between the command and the memento patterns?

All actions are stored for the command pattern, but the memento pattern saves the state only on request. 
Additionally, the command pattern has undo and redo operations for every action, but the memento pattern does not need that.

4 -  What is the difference between the facade pattern and the builder pattern?

The aim of the facade pattern is to make a specific portion of code easier to use. It abstracts details away from the developer.
The builder pattern separates the construction of an object from its representation.

5 - What is the difference between the builder pattern and the strategy pattern? They have similar UML representations.

You need to understand intent first. The builder pattern falls into the category of creational patterns, and 
the strategy pattern falls into the category of behavioral patterns. 
Their areas of focus are different. With the builder pattern, you can use the same construction process to 
create multiple types, and with the strategy pattern, you have the freedom to select an algorithm at runtime.

6 - What is the difference between the command pattern and the interpreter pattern?

In the command pattern, the commands are basically objects. 
In the interpreter pattern, the commands are sentences. 
Sometimes the interpreter pattern may look convenient, but you must keep in mind the cost of building an interpreter.

7 - What is the difference between the chain-of-responsibility pattern and the observer pattern?

In observer patterns, all registered users are notified/get request (for the change in subject) in parallel, 
but in the chain-of-responsibility pattern, you may not reach the end of chain, so all users need not handle the same scenario. 
The request can be processed much earlier by a user who is placed at the beginning of the chain.

8 - What is the difference between the chain-of-responsibility pattern and the decorator pattern?

They are not same at all but you may feel that they are similar in the structures. 
Similar to the previous differences, in the chain-of-responsibility pattern, only one class handles the request, but
in the decorator pattern, all classes handle the request. 
You must remember that decorators are effective in the context of adding and removing responsibilities only, 
and if you can combine the decorator pattern with the single responsibility principle, 
you can add/remove a single responsibility at runtime.


9 - What is the difference between the mediator pattern and the observer pattern?

The GoF says, “These are competing patterns. The difference between them is that Observer distributes communication 
by introducing observer and subject objects, whereas a mediator object encapsulates the communication between other objects.”

The GoF also found that you may face fewer challenges when you make reusable observers and subjects compared to 
when you make reusable mediators. But regarding the flow of communication, the mediator pattern scores higher than the observer pattern.


10 - Which do you prefer—a singleton class or a static class?

The first thing to remember is that Java does not support a top- level static class. 
You can create objects of a singleton class, which is not possible with a static class. 
So, the concepts of inheritance and polymorphism can be implemented with a singleton class. 
Now let’s consider a language that supports a full-phased static class( like C#). 
In that case, some developers believe that mocking a static class (e.g., consider unit testing scenarios) 
in a real-world application is challenging.


11 - How can you distinguish between proxies and adapters?

Proxies work on similar interfaces as their subjects but adapters work on different interfaces (to the objects they adapt).

12 - How are proxies different from decorators?

There are different types of proxies, and they vary by their implementations. 
So, it may appear that some implementations are close to decorators. For example, a protection proxy might
be implemented like a decorator. But you must remember that decorators focus on adding responsibilities, 
while proxies focus on controlling the access to an object.

13 - How are mediators different from facades?

In general, both simplify a complex system. In a mediator pattern, a two-way connection exists between a mediator 
and the internal subsystems, whereas in a facade pattern, you provide a one-way connection (the subsystems do not know about the facades).


14 - Is there any relation between flyweight patterns and state patterns?

The GoF says that the flyweight pattern can help you to decide when and how to share the state objects.


15 -  What are the similarities among simple factory, factory method, and abstract factory design patterns?

All of them encapsulate object creation. They suggest you code to the abstraction (interface) but not to the concrete classes. 
Each of these factories promotes loose coupling by reducing the dependencies on concrete classes.


16 - What are the differences among simple factory, factory method and abstract factory design patterns?

This is an important question that you may face in various job interviews. I suggest you clearly understand it.


17 - How can you distinguish the singleton pattern from the factory method pattern?

The singleton pattern ensures that you get a unique instance each time. It also restricts the creation of additional instances.
But the factory method pattern does not say that you will get a unique instance only. Most often, this pattern is used to create
as many instances as you want, and these instances are not necessarily unique. 
These newly typed instances may implement a common base class. (Do you remember that the factory method lets a class defer 
instantiation to subclasses from the GoF definition ?)


18 - How can you distinguish the builder pattern from the prototype pattern?

In the prototype pattern, you are using the cloning/ copying mechanism. 
So, at the end, you may want to override the original implementation (note the word @override in our implementation of the Ford class and Nano class). 
But changing the legacy (or original) code is not always easy. 
Apart from this point, when you are using cloning mechanisms, you do not need to think about the constructors with different parameters.
But the use of constructors with different parameters is very common in a builder pattern implementation.


19 - How can you distinguish the visitor pattern from the strategy pattern?

In a strategy pattern, each subclass uses different algorithms to solve a common problem. 
But in a visitor design pattern, each visitor subclass may provide different functionalities.

20 - How are null objects different from proxies?

In general, proxies act on real objects at some point and they may also provide behaviors. But a null object does not do any such operation.


21 - How can you distinguish the interpreter pattern from the visitor pattern?

In an interpreter pattern, you represent simple grammar as an object structure, 
but in a visitor pattern, you define specific operations that you want to use on an object structure. 
In addition to this, an interpreter has direct access to the properties that are needed, 
but in a visitor pattern, you need special functionalities (similar to an observer) to access them.

22 - How can you distinguish the flyweight pattern from the object pool pattern?

I did not discuss the object pool pattern in this book. But if you already know about the object pool pattern, 
you notice that in the flyweight pattern, flyweights have intrinsic and extrinsic states. 
So, if a flyweight has both states, the states are divided and the client needs to pass some part of the state to it. 
Also in general, the client does not change the intrinsic state because it is shared.
The object pool pattern does not store any part of state outside; 
all state information is stored/encapsulated inside the pooled object. 
Also, clients can change the state of a pooled object.

23 - How are libraries (or frameworks) similar/different from design patterns?

They are not design patterns. 
They provide the implementations that you can use directly in your application. 
But they can use the concept of the patterns in those implementations.
