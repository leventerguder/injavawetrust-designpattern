# A Brief Overview of GoF Design Patterns

- A design pattern describes a general reusable solution to software design problems. 
While developing software, you may encounter these problems frequently. 
The basic idea is that you can solve similar kinds of problems with similar kinds of solutions. 
And these solutions were tested over a long period of time.

- Patterns provide a template of how to solve a problem. 
They can be used in many different situations. At the same time, they help you get the best possible design much faster.

- Patterns are descriptions of how to create objects and classes, 
and customize them to solve a general design problem in a particular context.

- The GoF discussed 23 design patterns. Each of these patterns focuses on a particular object-oriented design. 
Each pattern can also describe the consequences and trade-offs of use. 
The GoF categorized these 23 patterns based on their purposes, as shown in the following sections.


## Creational Patterns

Creational patterns abstract the instantiation process.
You make the systems independent from the way that their objects are composed, created and represented.
In these patterns, you are concerned about “Where should I place the “new” keyword in my application?” 
This decision can determine the degree of coupling in your classes. The following five patterns belong in this category.

• Singleton Pattern
• Prototype Pattern
• Factory Method Pattern
• Builder Pattern
• Abstract Factory Pattern

## Structural Patterns

Structural patterns focus on how classes and objects can be composed to form a relatively large structure. 
They generally use inheritance or composition to group different interfaces or implementations. 
Your choice of composition over inheritance (and vice versa) can affect the flexibility of your software. 
The following seven patterns fall into this category.

• Proxy Pattern
• Flyweight Pattern
• Composite Pattern
• Bridge Pattern
• Facade Pattern
• Decorator Pattern
• Adapter Pattern

## Behavioral Patterns

Behavioral patterns concentrate on algorithms and the assignment of responsibilities among objects. 
They focus on communication between them and how objects are interconnected. 
The following 11 patterns fall into this category.

• Observer Pattern
• Strategy Pattern
• Template Method Pattern
• Command Pattern
• Iterator Pattern
• Memento Pattern
• State Pattern
• Mediator Pattern
• Chain of Responsibility Pattern
• Visitor Pattern
• Interpreter Pattern

The GoF made another classification based on scope, namely whether the pattern primary focuses on the classes or its objects. 
Class patterns deal with classes and subclasses. They use inheritance mechanisms, 
so they are static and fixed at compile time. 
Object patterns deal with objects that can change at runtime. So, object patterns are dynamic.

Class

Factory Method Pattern
Adapter Pattern
Interpreter Pattern
Template Method Pattern

## Questions & Answers

1 - What are the differences between class patterns and object patterns?

In general, class patterns focus on static relationship but object patterns can focus on dynamic relationships. 
As name suggests, class patterns focus on classes and its subclasses and object patterns focus on the objects relationships

- Class Patterns
  - Creational
  Defers object creation to its subclasses.
  - Structural
  Focuses on the composition of classes (primarily uses the concept of inheritance).
  - Behavioral
  Describes the algorithms and execution flows.

- Object Patterns
  - Creational
  Defers object creation to another object.
  - Structural
  Focuses on the different ways of composition of objects.
  - Behavioral
  Describes how different objects can work together and complete a task.

2 - Can I combine two or more patterns in an application?
Yes. In real-world scenarios, this type of activity is common.

3 - Do these patterns depend on a particular programming language?

Programming languages can play an important role. But the basic ideas are same, patterns are just like templates 
and they give you some idea in advance of how you can solve a particular problem. 
In this book, I primarily focused on object-oriented programming with the concept of reuse. 
But instead of any object-oriented programming language, suppose you have chosen some other language like C. 
In that case, you may need to think about the core object-oriented principles such as inheritance, polymorphism,
encapsulation, abstraction, and so on, and how to implement them. 
So, the choice of a particular language is always important because it may have specialized features that can make your life easier.

4 - Should I consider common data structures like arrays and linked lists as design patterns?

The GoF clearly excludes those saying that they are not complex, domain-specific designs for an entire application or subsystem. 
They can be encoded in classes and reused as is. So, they are not your concern in this book.

5 - If no particular pattern is 100% suitable for my problem, how should I proceed?

An infinite number of problems cannot be solved with a finite number of patterns, for sure. 
But if you know these common patterns and their trade-offs, you can pick a close match. 
No one prevents you from using your own pattern for your own problem, but you have to tackle the risk.

6 - Do you suggest any general advice before I jump into the topics?

I always follow the footsteps of my seniors and teachers who are experts in this field. 
And the following are general suggestions from them.

• Program to a supertype(Abstract class/Interface), not an implementation.
• Prefer composition over inheritance.
• Try to make a loosely coupled system.
• Segregate the code that is likely to vary from the rest of your code.
• Encapsulate what varies.


