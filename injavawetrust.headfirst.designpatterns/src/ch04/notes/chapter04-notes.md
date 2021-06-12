# The Factory Pattern

When you see "new" , think "concrete".

Technically there's nothing wrong with the new operator.
After all , it's a fundamental part of most modern object oriented languages.

By coding to an interface , you know you can insulate yourself form many of the changes that might happen
to a system down the road.
Why? If your code is written to an interface, then it will work with any new classes 
implementing that interface through polymorphism.

## We've got for this new object : we call it a Factory

Factories handle the details of object creation.

## The Simple Factory defined

The Simple Factory isn't actually  a Design Pattern : it's more of programming idiom.
But it is commonly used!

Some developers do mistake this idiom for the Factory Pattern, but the next time that happens you can subtly 
show you know your stuff; just don’t strut as you educate them on the distinction.

## Declaring a factory method

A factory method handles object creation and encapsulates it in a subclass.
This decouples the client code in the superclass from the object creation code in the subclass.

abstract Product factoryMethod(String type)

- A factory method is abstract so the subclasses are counted on to handle object creation.
- A factory method returns a Product that is typically used within methods defined in the superclass.
- A factory method isolates the client from knowing what kind of concrete Product is actually created.

All factory patterns encapsulate object creation. The Factory Method pattern encapsulates object creation by letting by
subclasses decide what objects to create.

## Factory Method Pattern defined

The Factory Method Pattern defines an interface for creating an object , but lets subclasses decide which class to instantiate.
Factory Method lets a class defer instantiation+ to subclasses.

As with every factory , the Factory Method Pattern gives us a way to encapsulate the instantiations of concrete types.

## The Dependency Inversion Principle

It should be pretty clear that reducing dependencies to concrete classes in our code in a "good thing".
In fact, we've got an OO design principle that formalizes this notion ; it even has a big, formal name : Dependency Inversion Principle

Design Principle : Depend upon abstraction. Do not depend upon concrete classes.

At first , this principle sounds a lot like "Program to an interface , not an implementation"
It is similar; however, the Dependency Inversion Principle makes an even stronger statement about abstraction.
It suggests that our high-level components should not depend on our low-level components ; rather , they should both 
depend on abstractions.

#A few guidelines to help you follow the Principle

The following guidelines can help you avoid OO design that violate the dependency inversion principle :

- No variable should hold a reference to a concrete class.
- No class should derive from a concrete class.
- No method should override an implemented method of any of its base classes.
