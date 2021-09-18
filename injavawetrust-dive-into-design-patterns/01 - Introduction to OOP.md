# Introduction to OOP

## Basics of OOP

Object oriented programming is a paradigm based on the concept of wrapping pieces of data, and behavior related to
that data, into special bundles called objects , which are constructed from a set of "blueprints", defined by a programmer
called classes.

## Objects, Classes

Say you have a cat named Oscar. Oscar is an object, an instance of the Cat class. 
Every cat has a lot of standard attributes: name, sex, age, weight, color, favorite food, etc. 
These are the class’s fields.

All cats also behave similarly: they breathe, eat, run, sleep and meow. These are the class’s methods. 
Collectively, fields and methods can be referenced as the members of their class.

Data stored inside the object’s fields is often referenced as state, 
and all the object’s methods define its behavior.

So a class is like a blueprint that defines the structure for objects , which are concrete instances of that class.

## Class Hierarchies

Everything fine and dandy when we talk about one class. 
Naturally, a real program contains more than a single class. 
Some of these classes might be organized into class hierarchies. Let’s find out what that means.

Say your neighbor has a dog called Fido. It turns out, dogs and cats have a lot in common: 
name, sex, age, and color are attributes of both dogs and cats. 
Dogs can breathe, sleep and run the same way cats do. 
So it seems that we can define the base Animal class that would list the common attributes and behaviors.

A parent class, like the one we’ve just defined, is called a superclass. 
Its children are subclasses. Subclasses inherit state and behavior from their parent, 
defining only attributes or behaviors that differ. Thus, the Cat class would have the
meow method, and the Dog class the bark method.

Subclasses can override the behavior of methods that they inherit from parent classes. 
A subclass can either completely replace the default behavior or just enhance it with some extra stuff.


## Pillars of OOP

Object-oriented programming is based on four pillars , concepts that differentiate it from other programming paradigms.

- Abstraction
- Encapsulation
- Polymorphism
- Inheritance

### Abstraction

Most of the time when you are creating a program with OOP, you shape objects of the program based on real-world objects. However, objecs of the program don't represent the originals with 100% accuracy.
(and it's rarely required that they do)

Instead, your objects only model attributes and behaviors of real objects in a specific context, ignoring the rest.

For example, Airplane class could probably exist in both a flight simulator and a flight booking application.
But in the forme case, it would hold details realated to the actual flight, whereas in the latter class you yould
care only about the seat map and which seats are avaiable.

Abstraction is a model of a real-world object or phenomenon, limited to a specific context, which represents all details relevant to this context with high accuracy and omits all the rest.

### Encapsulation

To start a car engine, you only need to turn a key or press a button. You don’t need to connect wires under the hood, rotate the crankshaft and cylinders, and initiate the power cycle of the engine.
These details are hudden under the hood of the car.
You have only a simple interface: a start switch, a steering wheen and some pedals. This illustrates how each object has an interface—a public part of an object, open to interactions with other objects.

Encapsulation is the ability of an object to hide parts of its state and behaviors from other objects , exposing only a limited interface to rest of the program.

To encapsulate something means to make it private, and thus accessible only from within on the methods of its own class. There is a little bit less restrictive mode called protected that makes a member of a class available to subclass as well.

Interfaces and abstract classes/methods of most programming languages are based on the concepts of abstraction and encapsulation. In modern object-oriented programming languages, the interface mechanism lets you define contracts of
interaction between objects. 

### Inheritance

Inheritance is the ability to build new classes on top of existing ones. The main benefit of inheritance is code reuse. If you want to create a class that's slightly different from an existing one, there's no need to duplicate code. Instead, you extend the existing class and puth the exatra functionality into a resulting subclass , which inherits firelds an methods of the superclass.


The consequence of using inheritance is that subclasses have the same interface as their parent class. You can’t hide a method in a subclass if it was declared in the superclass. You must also implement all abstract methods, even if they don’t make sense for your subclass.


In most programming languages a subclass can extend only one superclass. On the other hand, any class can implement several interfaces at the same time


### Polymorphism

Polymorphism is the ability of a program to detect the real class of an object and call its implementation even when its real type is unknown in the current context.

You can also think of polymorphism as the ability of an object to “pretend” to be something else, usually a class it extends or an interface it implements.

## Relations Between Objects

In addition to inheritance and implementation that we’ve already seen, there are other types of relations between objects that we haven’t talked about yet.

Association is a type of relationship in which one object uses or interacts with another. In UML diagrams the association relationship is shown by a simple arrow drawn from an object and pointing to the object it uses. By the way, having a bi-directional association is a completely normal thing. In this case, the arrow has a point at each end.

Dependency is a weaker variant of association that usually implies that there’s no permanent link between objects. Dependency typically (but not always) implies that an object accepts another object as a method parameter, instantiates, or uses another object.

Composition is a “whole-part” relationship between two objects, one of which is composed of one or more instances of the other. The distinction between this relation and others is that the component can only exist as a part of the container.

Aggregation is a less strict variant of composition, where one object merely contains a reference to another. The container doesn’t control the life cycle of the component. The com- ponent can exist without the container and can be linked to several containers at the same time.


https://www.geeksforgeeks.org/association-composition-aggregation-java/

https://www.baeldung.com/java-composition-aggregation-association

https://www.infoworld.com/article/3029325/exploring-association-aggregation-and-composition-in-oop.html

https://www.visual-paradigm.com/guide/uml-unified-modeling-language/uml-aggregation-vs-composition/

https://www.guru99.com/association-aggregation-composition-difference.html



